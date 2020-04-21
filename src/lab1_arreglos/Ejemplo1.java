/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_arreglos;

/**
 *
 * @author usuario2
 */
public class Ejemplo1 {
    private int lista[]=new int[5];
    private Invitado invitados[]=new Invitado[100];
    
    
    public void m1(){
    
        int otraLista[]=new int[4];
        
        
    }
    
    public void m2(){
    
        Invitado listaInv[]=new Invitado[3];
        listaInv[0]=new Invitado(23492,"Juan","Perez");
        listaInv[1]=new Invitado(3334,"Maria","Castro");
        
        int arreglo[]=new int[3];
        arreglo[0]=40;
        arreglo[1]=60;
        arreglo[2]=89;
        
        int otroArreglo[]={40,90,50,50,100};
        
        Invitado otrosInvitados[]={new Invitado(23,"mario","lopez"), new Invitado(44,"carlos","lucero")};
        
        for(int i=0;i<arreglo.length;i++){
        
            System.out.println(arreglo[i]);
        }
        
        for(int it:arreglo){
        
            System.out.println(it);
        }
        
        for(Invitado it:otrosInvitados){
        
            System.out.println(it);
        }
        
        
       
        
        
        
        
    }
    
    
}
