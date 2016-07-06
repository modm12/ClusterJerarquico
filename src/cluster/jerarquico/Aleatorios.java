/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cluster.jerarquico;

import Conexion.Individuo;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author modm_
 */
public class Aleatorios {
    public ArrayList<String> departamentos;
    public ArrayList<String> nombresMujeres;
    public ArrayList<String> nombresHombres;
    Random r;

    public Aleatorios() {
        cargarDepartamentos();
        cargarNombresHombres();
        cargarNombresMujeres();
    }
    public ArrayList<Individuo> listaUsuarios(int cant){
        ArrayList<Individuo> lista = new ArrayList<>();
        for(int n=0; n<cant;n++){
            lista.add(nuevo());
        }
        return lista;
    }
    public Individuo nuevo(){
         r = new Random();
        Individuo in = new Individuo();
        int posicion = r.nextInt(1000);
        if(posicion%2==1){
            in.setSexo(Boolean.TRUE);
            in.setNombre(generarNombreHombre());
            
        }else{
            in.setSexo(Boolean.FALSE);
            in.setNombre(generarNombreMujer());
        }
        r = new Random();
        posicion = r.nextInt(22);
        in.setDepartamento(generarDepartamento(posicion));
        in.setDpi(generarDpi()+" "+posicion+" 00");
        posicion = r.nextInt(3);
        in.setEsCivil(posicion);
        return in;
        
    }
    public String generarDpi(){
         int n=(int)(r.nextDouble() * 999999999 + 111111111);
         return Integer.toString(n);
    }
    public String generarDepartamento(int n){
        
        return departamentos.get(n);
    }
    
    
    public String generarNombreMujer(){
        r = new Random();
        int posicion = r.nextInt(50);
        return nombresMujeres.get(posicion);
    }
    
    public String generarNombreHombre(){
        r = new Random();
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
