/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluster.jerarquico;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author modm_
 */
public class ClusterJerarquico {
    public ArrayList<String> departamentos;
    public ArrayList<String> nombresMujeres;
    public ArrayList<String> nombresHombres;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        cargarDepartamentos();
//        cargarNombresMujeres();
//        cargarNombresHombres();
    }
    
    public String generarDepartamento(){
        Random r = new Random();
        int posicion = r.nextInt(22);
        return departamentos.get(posicion);
    }
    
    public String generarNombreMujer(){
        Random r = new Random();
        int posicion = r.nextInt(50);
        return nombresMujeres.get(posicion);
    }
    
    public String generarNombreHombre(){
        Random r = new Random();
        int posicion = r.nextInt(50);
        return nombresHombres.get(posicion);
    }
    
    public void cargarDepartamentos(){
        departamentos = new ArrayList<>();
        departamentos.add("Guatemala");
        departamentos.add("El Progreso");
        departamentos.add("Sacatepéquez");
        departamentos.add("Chimaltenango");
        departamentos.add("Escuintla");
        departamentos.add("Santa Rosa");
        departamentos.add("Sololá");
        departamentos.add("Totonicapán");
        departamentos.add("Quetzaltenango");
        departamentos.add("Suchitepéquez");
        departamentos.add("Retalhuleu");
        departamentos.add("San Marcos");
        departamentos.add("Huehuetenango");
        departamentos.add("El Quiche");
        departamentos.add("Baja Verapaz");
        departamentos.add("Alta Verapaz");
        departamentos.add("El Peten");
        departamentos.add("Izabal");
        departamentos.add("Zacapa");
        departamentos.add("Chiquimula");
        departamentos.add("Jalapa");
        departamentos.add("Jutiapa");
    }
    
    public void cargarNombresMujeres(){
        nombresMujeres = new ArrayList<>();
        nombresMujeres.add("Isabella");
        nombresMujeres.add("Olivia");
        nombresMujeres.add("Alexis");
        nombresMujeres.add("Sofía");
        nombresMujeres.add("Victoria");
        nombresMujeres.add("Amelia");
        nombresMujeres.add("Alexa");
        nombresMujeres.add("Julia");
        nombresMujeres.add("Camila");
        nombresMujeres.add("Alexandra");
        nombresMujeres.add("Maya");
        nombresMujeres.add("Andrea");
        nombresMujeres.add("Ariana");
        nombresMujeres.add("María");
        nombresMujeres.add("Eva");
        nombresMujeres.add("Angelina");
        nombresMujeres.add("Valeria");
        nombresMujeres.add("Natalia");
        nombresMujeres.add("Isabel");
        nombresMujeres.add("Sara");
        nombresMujeres.add("Liliana");
        nombresMujeres.add("Adriana");
        nombresMujeres.add("Juliana");
        nombresMujeres.add("Gabriela");
        nombresMujeres.add("Daniela");
        nombresMujeres.add("Valentina");
        nombresMujeres.add("Lila");
        nombresMujeres.add("Vivian");
        nombresMujeres.add("Nora");
        nombresMujeres.add("Ángela");
        nombresMujeres.add("Elena");
        nombresMujeres.add("Clara");
        nombresMujeres.add("Eliana");
        nombresMujeres.add("Alana");
        nombresMujeres.add("Miranda");
        nombresMujeres.add("Amanda");
        nombresMujeres.add("Diana");
        nombresMujeres.add("Ana");
        nombresMujeres.add("Penélope");
        nombresMujeres.add("Aurora");
        nombresMujeres.add("Alexandría");
        nombresMujeres.add("Lola");
        nombresMujeres.add("Alicia");
        nombresMujeres.add("Amaya");
        nombresMujeres.add("Alexia");
        nombresMujeres.add("Jazmín");
        nombresMujeres.add("Mariana");
        nombresMujeres.add("Alina");
        nombresMujeres.add("Lucía");
        nombresMujeres.add("Fátima");
    }
    
    public void cargarNombresHombres(){
        nombresHombres = new ArrayList<>();
        nombresHombres.add("Daniel");
        nombresHombres.add("David");
        nombresHombres.add("Gabriel");
        nombresHombres.add("Benjamín");
        nombresHombres.add("Samuel");
        nombresHombres.add("Lucas");
        nombresHombres.add("Ángel");
        nombresHombres.add("José");
        nombresHombres.add("Adrián");
        nombresHombres.add("Sebastián");
        nombresHombres.add("Xavier");
        nombresHombres.add("Juan");
        nombresHombres.add("Luis");
        nombresHombres.add("Diego");
        nombresHombres.add("Óliver");
        nombresHombres.add("Carlos");
        nombresHombres.add("Jesús");
        nombresHombres.add("Alex");
        nombresHombres.add("Max");
        nombresHombres.add("Alejandro");
        nombresHombres.add("Antonio");
        nombresHombres.add("Miguel");
        nombresHombres.add("Víctor");
        nombresHombres.add("Joel");
        nombresHombres.add("Santiago");
        nombresHombres.add("Elías");
        nombresHombres.add("Iván");
        nombresHombres.add("Óscar");
        nombresHombres.add("Leonardo");
        nombresHombres.add("Eduardo");
        nombresHombres.add("Alan");
        nombresHombres.add("Nicolás");
        nombresHombres.add("Jorge");
        nombresHombres.add("Omar");
        nombresHombres.add("Paúl");
        nombresHombres.add("Andrés");
        nombresHombres.add("Julián");
        nombresHombres.add("Josué");
        nombresHombres.add("Román");
        nombresHombres.add("Fernando");
        nombresHombres.add("Javier");
        nombresHombres.add("Abraham");
        nombresHombres.add("Ricardo");
        nombresHombres.add("Francisco");
        nombresHombres.add("César");
        nombresHombres.add("Mario");
        nombresHombres.add("Manuel");
        nombresHombres.add("Édgar");
        nombresHombres.add("Alexis");
        nombresHombres.add("Israel");
    }
}
