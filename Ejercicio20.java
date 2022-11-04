/*
Realiza un programa que diga si un número entero positivo introducido por
teclado es capicúa. Se permiten números de hasta 5 cifras.

* @author KuzaFkto
 */

import java.util.Scanner;
public class Ejercicio20{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese un número para comprobar si es capicúa");
        int n = sc.nextInt();

        if (n >=0 && n<10){
            System.out.println("El número es capicúa");
        }else if (n>=10 && n<100 && n/10==n%10){
            System.out.println("El número es capicúa");

        }else if(n>=100 && n <1000 && n/100==n%10){
            System.out.println("El número es capicúa");

        }else if (n>=1000 && n<10000 && n/1000==n%10 &&((n/100)%10)==((n%100)/10)) /*ejemplo de capicúa: 5445*/ {
            System.out.println("El número es capicúa");

        } else if (n>=10000 && n<100000 && n/10000==n%10 &&((n/1000)%10)==((n%1000)/10)) /*ejemplo de capicúa: 34043*/ {
            System.out.println("El número es capicúa");
        }

        sc.close();
    }
}