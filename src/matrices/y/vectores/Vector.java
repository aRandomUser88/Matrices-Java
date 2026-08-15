/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices.y.vectores;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author david
 */
public class Vector {
    public static void main(String[] args){
    BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
    try{
        int vect[],i,j,tam;
        System.out.println("Tamaño de vector: ");
        tam=Integer.parseInt(leer.readLine());
        vect=new int[tam];
        for (i=0;i<tam;i++) {
            System.out.println("Valor en posicion: ("+(i+1)+"): ");
            vect[i]=Integer.parseInt(leer.readLine());
        }
        for (i= 0;i<tam;i++) {
            System.out.print(vect[i]+"\t");
        } 
    }
    catch(Exception e){}
    }
}
