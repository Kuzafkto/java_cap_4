
/*
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =
0).
Ejemplo 1:
Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
Por favor, introduzca el valor de a: 2
Ahora introduzca el valor de b: 1
x = -0.5
Ejemplo 2:
Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
Por favor, introduzca el valor de a: 0
Ahora introduzca el valor de b: 7
Esa ecuación no tiene solución real.

@author KuzaFkto
 * 
 */

import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.println("Por favor, introduzca el valor de a:");
        float a = sc.nextFloat();
        System.out.println(" Por favor, introduzca el valor de b:");
        float b = sc.nextFloat();
        if (a==0){
            System.out.println("X vale 0");
        } else{
            System.out.println("X vale " + (float)(-b/a));
        }

    sc.close();

    }
}