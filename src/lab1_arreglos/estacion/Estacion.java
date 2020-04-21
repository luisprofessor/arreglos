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
public class Estacion {
    private float dias[];
    private int indice=-1;
    public Estacion(){
    
        dias=new float[7];
    }

    public void agregarMedicion(float ml){
    
        indice++;
        if(indice<dias.length){
                    dias[indice]=ml;
        }
        
    }
    
    public void mostrarRegistro(){
    
        for(float it:dias){
        
            System.out.println(it);
        }
    
    }
    
    
    
}
