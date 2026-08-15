/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices.y.vectores;
import java.io.*;
/**
 *
 * @author david
 */
public class Matriz {
    public static void main(String[] args) {
    BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
    int i,j,tam,matriz[][];
    try{
        System.out.println("Tamaño de la matriz:");
        tam=Integer.parseInt(leer.readLine());
        matriz=new int [tam][tam];
        for (i = 0; i < tam; i++) {
            for (j = 0; j < tam; j++) {
                System.out.println("Teclea el valor en: ("+i+") y ("+j+"): ");
                matriz[i][j]=Integer.parseInt(leer.readLine());
            }
        }
        for(i=0;i<tam;i++){
            for(j=0;j<tam;j++){
                System.out.print("Valor en posicion ("+i+"),("+j+"): "+matriz[i][j]+ "\t");
            }
            System.out.println("");
        }
    }
    catch(Exception e){}
    }
}
