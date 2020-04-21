/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_arreglos.multidimension;

/**
 *
 * @author usuario2
 */
public class PruebaMulti {
    
    public static void main(String...xxxxx){
    
        int matriz[][]=new int[3][];
        matriz[0]=new int[4];
        matriz[1]=new int[2];
        matriz[2]=new int[3];
        
        matriz[2][2]=78;
        matriz[1][1]=30;
        
        for(int f=0;f<matriz.length;f++){
        
            for(int c=0;c<matriz[f].length;c++){
            
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println("");
        
        }
        
    }
    
}
