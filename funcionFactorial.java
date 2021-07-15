package Semana10;
/**
 * Nombre del programa: 
 * Descripcion: Haga una función que calcule el factorial de un número entero. Pruébela en un main. 
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ej5w10 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ 
        int numero;
        int factorial=1;

        escribir.println("Digite un numero entero positivo:");
        numero = Integer.parseInt(leer.readLine());
        
        factorial = calcularFactorial(numero);
        mostrarFactorial(numero, factorial);
    }

    //Se usa parametro pNum porque se necesita el valor de una variable que no esta dentro de la rutina
    public static int calcularFactorial(int pNum){
        int factorial=1;

        for(int count=1; count<=pNum; count++){
            factorial = factorial * count;
        }

        return factorial;
    }

    public static void mostrarFactorial(int pNum, int pFactorial){
        escribir.println(pNum+ " es: " +pFactorial);
    }
}