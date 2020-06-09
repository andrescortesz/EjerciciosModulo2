package com.fluch.ClasesModulo2;
import testio.TextIO;
public class whileEjercicios {
    public static void Ejercicio1(){
        /*  Desarrolla un programa que permita invertir la palabra “Programación”.
         *  El resultado debe ser “nóicamargorP”.
         */
        String palabra="Programación";
        int i=palabra.length()-1;
        while (i>=0) {
            System.out.print(palabra.charAt(i) + " ");
            i--;
        }//end while
        //------- Do While Exercise ------
        // Descomentar estas lineas para usar Do While
        /*do {
        System.out.print(palabra.charAt(i) + " ");
            i--;
        }
        while (i>=0);
        */
    }//end Ejercicio1
    public static void Ejercicio2(){
        /*  Desarrollar un programa que determine si una palabra establecida previamente es o no
         *  Palíndroma.
         */
        int i, j=0;
        String palabra;
        System.out.println("Ingrese palabra a evaluar: ");
        palabra=TextIO.getln().toLowerCase();
        i=palabra.length()-1;
        while (i>0) {
            if (palabra.charAt(i) == palabra.charAt(j)) {
                System.out.print(palabra.charAt(i) + " ");
                i--;
                j++;
            }
            else
                break;
        }    //end while
        // Descomentar estas lineas para usar Do While
        /*
        do {
            if (palabra.charAt(i) == palabra.charAt(j)) {
                System.out.print(palabra.charAt(i) + " ");
                i--;
                j++;
            }
            else
                break;
        }
        while (i>0);
        */
        if (i==0)
            System.out.println("La palabra " + palabra + " es Palíndroma");
        else
        System.out.println("La palabra " + palabra + " no es Palíndroma");
    }//end Ejercicio2
    public static void Ejercicio3(){
        /*  Ejercicio3: Desarrollar un programa que permita contar cuantas vocales existentes
            en el siguiente parrafo:
            “Porta fames dis aenean platea neque semper? Conubia eleifend commodo
            maecenas risus risus pellentesque. Eros iaculis duis posuere integer purus
            euismod consequat. Vel congue curabitur penatibus ac mus nisi iaculis;
            scelerisque feugiat blandit molestie euismod. Tincidunt risus sociis nostra
            fermentum laoreet aliquet aptent est. Platea non proin aliquet scelerisque nam maecenas elit cum.”
        * */
        int i,count=0;
        char varChar;
        String parrafo;
        System.out.println("Ingrese el parrafo a evaluar: ");
        parrafo=TextIO.getln().toLowerCase();
        i=(parrafo.length())-1;
        while (i>0)
        //do
        {
            varChar=parrafo.charAt(i);
            if ((varChar == 'a') || (varChar == 'e') || (varChar == 'i') || (varChar == 'o') || (varChar == 'u'))
                count++;
            i--;
        }//end while
        //while (i>0);
        System.out.println("El parrafo ingresado tiene " + count + " vocales");
    }//end Ejercicio3
    public static void Ejercicio4(){
        int suma=0, i=25;
        while (i>0)
        //do
        {
            suma = suma + 11;
            System.out.print(suma + " ");
            i--;
        }//end while
        //while (i>0);
    }//Ejercicio4
    public static void Ejercicio5(){

    }//end Ejercicio5
}//end class whileEjercicios
