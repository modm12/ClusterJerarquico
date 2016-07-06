/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluster.jerarquico;

import Conexion.Individuo;
import Conexion.IndividuoJpaController;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author modm_
 */
public class ClusterJerarquico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aleatorios a = new Aleatorios();
        IndividuoJpaController controlador = new IndividuoJpaController((Conexion.Conexion.getConexion()).getEmf());
        for(Individuo in: a.listaUsuarios(100)){
            controlador.create(in);
            
        }
    }
    
    
}
