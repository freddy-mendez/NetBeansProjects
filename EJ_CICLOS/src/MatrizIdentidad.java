/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Teleinformatica III
 */
import java.util.Scanner;
public class MatrizIdentidad {
    public static void main(String[] args) {
        int t[][]; // definimos t como una tabla bidimensional
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite número de filas y columnas matriz cuadrada: ");
        int n= leer.nextInt();
 t = new int [n][n]; // creamos una matriz de nxn
 for (int i=0;i<n;i++){ // utilizamos i para la primera dimensión
  for (int j=0;j<n;j++){ // utilizamos j para la segunda dimensión
 if (i==j){
 t[i][j]=1;
 }
     else {
        t[i][j]=0; 
     }
 }
 }
 System.out.println("MATRIZ IDENTIDAD  "+n+" x "+n);
 for (int i=0;i<n;i++) {
 System.out.println();
 for (int j=0;j<n;j++) {
 System.out.print(t[i][j]+" "
         + " ");
 }
 }
 System.out.println();
 }
}


