/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices.y.vectores;
import java.util.Random;
import java.io.*;
/**
 *
 * @author david
 */
public class MatrizRandom {
    public static void main(String[] args) {
    BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
        try{
        double random=Math.random();
        int j,i,tam,matriz[][],aleatorio;
        System.out.println("Teclea el tamaño de la matriz");
        tam=Integer.parseInt(read.readLine());
        matriz=new int [tam][tam];
        Random rnd= new Random();
        for(i=0;i<tam;i++){
            for(j=0;j<tam;j++){
                aleatorio=rnd.nextInt(10);
                matriz[i][j]=aleatorio;
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    catch(Exception e){}
    }
}