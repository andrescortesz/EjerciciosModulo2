package com.fluch.ClasesModulo2;

import testio.TextIO;

public class vectores {
    public static void Ejercicio1(){
        /* Ejercicio1: Desarrollar un programa que por medio de un vector,
           de tipo float permita almacenar el peso de 5 personas para posteriormente:
            - Determinar el promedio del peso de las 5 personas.
            - Determinar cuántas personas superar el promedio del peso.
            - Determinar cuántas personas son inferiores al promedio del peso.
        */
        float pesoPersonas[] = {80,50,60,71,79};
        float promedio=0, suma=0;
        int countUp=0, countDown=0;
        for (int i=0;i<pesoPersonas.length;i++)
            suma=pesoPersonas[i]+suma;
        promedio=suma/5;
        for (int i=0;i<pesoPersonas.length;i++) {
            if (pesoPersonas[i] > promedio)
                countUp++;
            else
                countDown++;
        }//end for
        System.out.println("El promedio es: " + promedio);
        System.out.println("Los que superan el promedio son: " + countUp);
        System.out.println("Los que no superan el promedio son: " + countDown);
    }//end Ejercicio1
    public static void Ejercicio2(){
        /*  Desarrollar un programa que dados dos grupos (Grupo A – Grupo B)
            cada uno con 10 estudiantes y una nota final de la materia por estudiante, determinar:
            - El promedio general de cada grupo.
            - El promedio general de ambos grupos.
            - El grupo con mejor promedio.
        */
        double grupoA[]={2.5,3.4,4.0,3.1,5,4.5,3.8,2.8,4.8,2.9}, grupoB[]={1.1,2.5,2.8,3.9,3.5,4.0,4.0,0.5,5,3.0};
        double promedioA=0,promedioB=0,promedio=0,sumaA=0, sumaB=0;
        for (int i=0; i<grupoA.length;i++) {
            sumaA = grupoA[i] + sumaA;
            sumaB = grupoB[i] + sumaB;
        }
        promedioA=sumaA/grupoA.length;
        System.out.printf("El grupo A TUVO promedio DE: %3.2f%n" , promedioA);
        promedioB=sumaB/grupoB.length;
        System.out.printf("El grupo B TUVO promedio DE: %3.2f%n" , promedioB);
        promedio=(promedioA+promedioB)/2;
        System.out.printf("El promedio entre los dos grupos fue: %3.2f%n" , promedio);
        if (promedioA>promedioB)
            System.out.println("El mejor promedio fue del grupo A");
        else
            System.out.println("El mejor promedio fue del grupo B");
    }//End Ejercicio2
    public static void Ejercicio3(){
        /*
        Desarrollar un programa que, dada una palabra, divida todos sus caracteres y
        los almacene en las posiciones de un vector del tamaño de la palabra, por ejemplo:
        - “Colombia”, tiene 8 palabras, por ende, el vector debe ser de tamaño 8 para almacenar cada carácter.
        */
        String palabra;
        System.out.println("Ingrese una palabra: ");
        palabra= TextIO.getWord();
        char vectorPalabra[]= new char[palabra.length()];
        for (int i=0;i<palabra.length();i++){
            vectorPalabra[i]= palabra.charAt(i);
            System.out.print(" " + vectorPalabra[i]);
        }//end for
    }//end Ejercicio3

}//end class
