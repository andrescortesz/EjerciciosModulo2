package com.fluch.ClasesModulo2;
//import java.util.Formatter;
public class condicionalesSimples {

    public static void Ejercicio1(){
        double randomNumber=Math.random()*100;
        if (randomNumber>50){
            System.out.printf("El número aleatorio -> '%5.2f'", randomNumber);
            System.out.println(", es mayor a 50.");
        }
        else
            System.out.printf("El numero es menor a 50. '%5.2f'", randomNumber);
        System.out.println();
    }//end Ejercicio1
    public static void Ejercicio2(){
        double randomNumber1=Math.random()*10;
        double randomNumber2=Math.random()*10;
        if (randomNumber1>randomNumber2){
            System.out.printf("El primer numero aleatorio es mayor al segundo. Su potencia con exponente el segundo es: '%5.2f'", Math.pow(randomNumber1,randomNumber2));
        }
        else
            System.out.printf("El segundo numero aleatorio es mayor al primero. Su potencia con exponente el primero es: '%5.2f'", Math.pow(randomNumber2,randomNumber1));
    }//end Ejercicio2
    public static void Ejercicio3(){
        int randomNumber1=  (int)(Math.floor(Math.random()*-10));
        if (randomNumber1<0){
            System.out.println("Es menor que cero o negaivo. " + randomNumber1);
        }
    }//end Ejercicio3
    public static void Ejercicio4(){
        int number1=7, number2=2;
        int result=number1%number2;
        if (result==0)
            System.out.println("if, Es multiplo -> " + result);
        else
            System.out.println("Else, No es multiplo -> " + result);
    }//end Ejercicio4
    public static void Ejercicio5(){
        double randomNote =  (Math.random()*5);
        if (randomNote>2.98)
            System.out.printf("Aprobó -> '%2.2f'%n", randomNote);
        else
            System.out.printf("Perdió -> '%2.2f'%n", randomNote);
    }//end Ejercicio5
}//end class condicionalesSimples
