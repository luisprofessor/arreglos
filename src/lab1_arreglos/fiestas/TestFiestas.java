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
public class TestFiestas {
    
    public static void main(String...arg){
    
        Fiesta f=new Fiesta();
        
        Amigo juan = new Amigo(12345, "Juan", "Lopez");
        Especial maria=new Especial(334,"Maria Jose","Lucero");
        Amigo sofia=new Amigo(333311, "Sofia", "Miranda");
        
        f.agregarInvitado(juan);
        f.agregarInvitado(maria);
        f.agregarInvitado(sofia);
        
        f.informar();
                

        
    }
    
}
