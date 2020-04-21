/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_arreglos.fiestas;

/**
 *
 * @author usuario2
 */
public class Fiesta {
    private Invitado lista[]=new Invitado[100];
    private int indice=-1;
    
    
    public void agregarInvitado(Invitado inv){
    
        indice++;
        if(indice<lista.length){
                    lista[indice]=inv;
        }
        
    }
    
    public void informar(){
    
        int f=0,a=0,e=0;
        
        for(Invitado it:lista){
        
            if(it instanceof Familiar){
            
                f++;
            }else if(it instanceof Amigo){
        
                a++;
        }else if(it instanceof Especial) {
            
                e++;
            }
          
        }
        
        System.out.println("Amigos "+a);
    System.out.println("Familiares "+f);
    System.out.println("Especiales "+e);
    }
}
