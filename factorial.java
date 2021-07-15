package Semana6;

/**
 * Nombre del programa: 
 * Descripcion: Calcular el factorial de un número entero positivo. n! Se lee "n factorial" y 
	n! = 1*2*3*..*n-1*n. Ejemplo: 5! = 1*2*3*4*5 = 120
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ejp1w6Factorial { // Inicio del programa

    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ // Inicio de la Rutina Main
        int numero;
        int factorial=1;

        escribir.println("Digite un numero entero positivo:");
        numero = Integer.parseInt(leer.readLine());

        /*for(int count=numero; count>0; count--){
            factorial = factorial * count;
        }*/
        
        factorial = calcularFactorial(numero);
        mostrarFactorial(numero, factorial);

    } // Fin de la Rutina Main

    //Creacion de la Rutina Funcion que se encarga de calcular el factorial
    public static int calcularFactorial (int pnum){
        int factorial=1;
        
        for(int count=1; count<=pnum; count++){
            factorial = factorial * count;
        }

        return factorial;
    } // Fin de la Rutina CalcularFactorial

    //Creacion de la Rutina procedimiento que se encarga de mostrar el resultado final
    public static void mostrarFactorial(int pnum, int pfactorial){
        escribir.println(pnum+ " es: " +pfactorial);
    } // Fin de la Rutina mostrar Factorial

} // Fin del programa