package Conexion;

import java.sql.Statement;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo Lopez <panlopezv@gmail.com>
 */
public class Conexion {

    private EntityManagerFactory emf;
    private static Conexion unicaConexion;
    private int idUsuario;

    public static Conexion getConexion() {
        if (unicaConexion == null) {
            try {
                unicaConexion = new Conexion();
            } catch (Exception ex) {
                unicaConexion = null;
            }
        }
        return unicaConexion;
    }

    private Conexion() {
        try{
            emf = Persistence.createEntityManagerFactory("Cluster_JerarquicoPU");
            
            
            
            
        } catch (Exception ex) {
            emf=null;           
            JOptionPane.showMessageDialog(null, "Imposible establecer conexión con el servidor.\n\rRevise su conexión e intentelo de nuevo.", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void cerrarConexion() {
        idUsuario = 0;
        try{
            emf.close();
        } catch(NullPointerException ex){
        }
        emf = null;
        unicaConexion = null;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }
    
    public EntityManagerFactory getEmf() {
        return emf;
    }


}
