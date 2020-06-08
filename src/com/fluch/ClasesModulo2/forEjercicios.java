package com.fluch.ClasesModulo2;
import testio.TextIO;

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
    public static void Ejercicio2(){
        //Desarrollar un programa que determine los divisores de un número definido previamente.
        int divisor, count=0;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Ingrese el numero que desee que sea evaluado:");
        int numero = myObj.nextInt();
        for (int i=1;i<numero;i++){
            divisor=numero%i;
            if (divisor==0)
            count++;
        }//end for
        System.out.println("El numero " + numero + " tiene: " + count + " divisores");
        myObj.close();
    }//end Ejercicio2
    public static void Ejercicio3(){
        // Ejercicio3: Desarrollar un programa que permita definir si un número entero
        // ya establecido es un número perfecto o no.
        int divisor, suma=0;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Ingrese el numero que desee que sea evaluado:");
        int numero = myObj.nextInt();
        for (int i=1;i<numero;i++){
            divisor=numero%i;
            if (divisor==0)
                suma=i+suma;    
        }//end for
        if (suma==numero)
            System.out.println("El numero " + numero + " es perfecto. ");
        else
            System.out.println("El numero " + numero + " no es perfecto. ");
        myObj.close();
    }//end Ejercicio3
    public static void Ejercicio4(){
        /*  Desarrollar un programa que realice la sumatoria de todas las iteraciones de un ciclo
            desde 0 hasta un número entero definido previamente, al resultado de la suma realizar
            las siguientes operaciones.
                - Raízcuadrada.
                - Generar un número aleatorio entre 1 y la sumatoria de las iteraciones.
                - Determinar los divisores.
                - Hallar la factorial.
                - Definir si es un número perfecto.
        */
        int sumaIteracion=0, numero, numeroAleatorio ;
        double raizCuadrada;
        System.out.println("Ingrese numero para generar iteraciones:");
        numero= TextIO.getlnInt();

        for (int i=1;i<=numero; sumaIteracion=sumaIteracion+i, i++);
        raizCuadrada= Math.sqrt(sumaIteracion);
        numeroAleatorio = (int) Math.floor(Math.random()*(sumaIteracion+0.9));
        //System.out.println("La raiz cuadrada es: " + raizCuadrada);
        System.out.println("La suma de la iteracion es: " +  sumaIteracion);
        System.out.println("El numero aleatorio es: " + numeroAleatorio);

    }//end Ejercicio4
}//end class
