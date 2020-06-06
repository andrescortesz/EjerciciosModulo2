package com.fluch.ClasesModulo2;
//import java.util.Formatter;
public class condicionalesComplejos {
    public static void Ejercicio1(){
        /*  DESCRIPCION: Desarrollar un programa que permita por medio de la edad de una persona,
         *   determinar la categoría en la que pertenece a raíz de la siguiente tabla:
         *   Rango de edad               Categoría
         *    0 -  5                     Infante
         *    6 - 10                     Niño
         *   11 - 15                     Pre adolescente
         *   16 - 18                     Adolescente
         *   19 - 25                     Pre adulto
         *   26 - 40                     Adulto
         *   41 - 55                     Pre anciano
         *   56+                         Anciano
         */
        int edadPersona= (int)(Math.random()*100);
        if (edadPersona<5)
        System.out.println("Infante");
        else if (edadPersona<10)
            System.out.println("Niño");
        else if (edadPersona<15)
            System.out.println("Preadolecente");
        else if (edadPersona<18)
            System.out.println("Adolecente");
        else if (edadPersona<25)
            System.out.println("Pre adulto");
        else if (edadPersona<40)
            System.out.println("Adulto");
        else if (edadPersona<55)
            System.out.println("Pre Anciano");
        else
            System.out.println("Anciano");
        System.out.println(edadPersona);
    }//end Ejercicio1
    public static void Ejercicio2(){
        /*  DESCRIPCION: Desarrollar un programa que permita determinar la cantidad de cifras de un número X
            teniendo en cuenta que el número únicamente puede tener 4 cifras. Mostrar un mensaje
            por defecto si el número supera las 4 cifras.
        */
        int numeroAleatorio= (int)(Math.random()*10000);
        if (numeroAleatorio<10)
            System.out.println("Numero de una cifra");
        else if (numeroAleatorio<100)
            System.out.println("Numero de dos cifras");
        else if (numeroAleatorio<1000)
            System.out.println("Numero de tres cifras");
        else
            System.out.println("Numero de cuatro cifras");
        System.out.println(numeroAleatorio);
    }//end Ejercicio2
    public static void Ejercicio3(){
        /*DESCRIPCION: Desarrollar un programa que, por medio de 3 números enteros,
          determinar cuál es el mayor.
        */
        int numero1=(int)(Math.random()*1000), numero2=(int)(Math.random()*1000), numero3=(int)(Math.random()*1000);
        System.out.println("Numero1 -> " + numero1 + "\n");
        System.out.println("Numero2 -> " + numero2 + "\n");
        System.out.println("Numero3 -> " + numero3 + "\n");
        if (numero1>numero2){
            if (numero1>numero3)
                System.out.println("El maximo es: " + numero1);
            else
                System.out.println("El maximo es: "+ numero3);
        }
        else if (numero2>numero3)
            System.out.println("Numero maximo es: " + numero2);
        else
            System.out.println("El maximo es: " + numero3);
    }//end Ejercicio3
    public static void Ejercicio4(){
        /*  DESCRIPCION: Un postulante a un empleo, realiza un test de capacitación,
            se obtuvo la siguiente información: cantidad total de preguntas que se le realizaron
            y la cantidad de preguntas que contestó correctamente. Desarrolle un programa que
            informe el nivel según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
            1.  Nivel máximo:          Porcentaje >=    90%.
            2.  Nivel medio:           Porcentaje >=    75% y <90%.
            3.  Nivel regular:         Porcentaje >=    50% y <75%.
            4.  Fuera de nivel:        Porcentaje <     50%.
        */
        int cantidadPreguntas=100;
        int porcentajeCorrectas=(int)(Math.random()*100);
        int porcentajeCorrecto= porcentajeCorrectas%cantidadPreguntas;
        //System.out.println(porcentajeCorrecto);
        if (porcentajeCorrecto>=90)
            System.out.println(porcentajeCorrectas + "% -> Nivel maxino");
        else if (porcentajeCorrecto>=75)
            System.out.println(porcentajeCorrectas + "% -> Nivel medio");
        else if (porcentajeCorrecto>=50)
            System.out.println(porcentajeCorrectas + "% -> Nivel regular");
        else
            System.out.println(porcentajeCorrectas + "% -> Fuera de nivel");
    }//end Ejercicio4
}//end class condicionalesComplejos