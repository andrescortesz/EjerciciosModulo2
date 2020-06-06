package com.fluch.ClasesModulo2;

public class switchCase {
    public static void Ejercicio1(){
        /*  Ejercicio1: Desarrolla un programa donde por medio del tipo de un motor,
        *   determinar qué tipo de fluido puede trasportar este según las siguientes condiciones:
        *   - Si el tipo de motor es 0, mostrar un mensaje por consola indicando “No hay establecido un valor definido para el tipo”.
        *   - Si el tipo de motor es 1, mostrar un mensaje por consola indicando “Agua”.
        *   - Si el tipo de motor es 2, mostrar un mensaje por consola indicando “Gasolina”.
        *   - Si el tipo de motor es 3, mostrar un mensaje por consola indicando “Hormigón”.
        *   - Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido”.
        */
        //--------------------------------------------- Solución -------------------------------------------------------
        /*  Define the range: to define a range between 0 and 4 we need a random formula.
        *   First, Math.random generates a number between 0 and 1
        *   If we multiply this pair, we get numbers between 0 and 4.9999
        *   Then we can use the Math.floor method to take only numbers between 0 and 4
        */
        double range = 4.9;
        int motorType= (int)Math.floor(Math.random()*range);
        // generate random numbers within 0 to 4
        System.out.println(motorType);

        switch (motorType){
            case 0:
                System.out.println("No hay establecido un valor definido para el tipo");
                break;
            case 1:
                System.out.println("Fluido a transportar: Agua");
                break;
            case 2:
                System.out.println("Fluido a transportar: Gasolina");
                break;
            case 3:
                System.out.println("Fluido a transportar: Hormigón");
                break;
            default:
                System.out.println("No existe un valor definido");
        }//end switch®
    }//end Ejercicio1
    public static void Ejercicio2(){
        /*  Ejercicio2: Desarrollar una calculadora, la cual, en base a un operador,
        *   realice una operación con dos números enteros ya definidos y mostrar el resultado,
        *   los operadores a tener en cuenta son los vistos en la tabla de operadores aritméticos,
        *   sí deseas agregar más operadores, siéntete en libertad de hacerlo.
        * */
        
    }//end Ejercicio2
}//end class switchCase
