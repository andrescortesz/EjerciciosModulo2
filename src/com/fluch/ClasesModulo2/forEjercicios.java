package com.fluch.ClasesModulo2;
import java.util.Scanner;

public class forEjercicios {
    public static void Ejercicio1(){
        //  Ejercicio1: Desarrolla un programa que permita mostrar
        //  el factorial de un número definido previamente.
        long factorial=1;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Ingrese el numero que desee que sea factorial:");
        int numero = myObj.nextInt();
        for (int i=numero;i>=1;i--)
            factorial=i*factorial;
        System.out.println("El factorial de " + numero + " es: " + factorial);
        myObj.close();
    }//end Ejercicio1
}//end class