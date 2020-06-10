package com.fluch.ClasesModulo2;
import testio.TextIO;
public class matrices {
    public static void Ejercicio1() {
       /*   Desarrollar un programa que por medio de tres (3) matrices de N*M
            (Determinar el tamaño, igual para las 3 matrices):
        - Almacenar números pares aleatorios entre 0 y 100 en la primera matriz.
        - Almacenar números impares aleatorios entre 0 y 50 en la segunda matriz.
        - Almacenar la suma de los valores de ambas matrices en la tercera matriz.
        */
        int filas, columnas, numeroA, numeroB, numeroC;
        System.out.println("Se crearan 3 matrices de igual tamaño: ");
        System.out.println("Ingrese número de filas: ");
        filas = TextIO.getInt();
        System.out.println("Ingrese número de columnas: ");
        columnas = TextIO.getInt();
        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];
        int[][] matrizC = new int[filas][columnas];
        for (int k = 0; k < 3; k++){
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    do {
                        numeroA = (int) (Math.random() * 100);
                        numeroB = (int) (Math.random() * 50);
                        numeroC = numeroA + numeroB;
                    } while (!(((numeroA % 2) == 0)&((numeroB % 2)!= 0)));
                    matrizA[i][j] = numeroA;
                    matrizB[i][j] = numeroB;
                    matrizC[i][j] = numeroC;

                    switch (k) {
                        case 0:
                            System.out.print(" " + matrizA[i][j]);
                            break;
                        case 1:
                            System.out.print(" " + matrizB[i][j]);
                            break;
                        case 2:
                            System.out.print(" " + matrizC[i][j]);
                            break;
                    }
                      /*
                    }
                    if (k==0)
                        System.out.print(" " + matrizA[i][j]);
                    else if (k==1)
                        System.out.print(" " + matrizB[i][j]);
                    else
                        System.out.print(" " + matrizC[i][j]);
                    */
                }//end for j
                System.out.println();
            }//end for i
            System.out.println();
            //System.out.println();
        }//end for k
    }//end Ejercicio1
}//end class matrices

