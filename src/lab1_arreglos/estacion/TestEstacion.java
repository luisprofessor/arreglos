/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_arreglos.estacion;

/**
 *
 * @author usuario2
 */
public class TestEstacion {
    
    public static void main(String...arg){
    
        Estacion e=new Estacion();
        e.agregarMedicion(20);
        e.agregarMedicion(0);
        e.agregarMedicion(30);
        e.agregarMedicion(23.5f);
        
        e.mostrarRegistro();
    }
    
}
