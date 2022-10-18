/*
 * Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.

@author KuzaFkto
 */
import java.util.Scanner;
public class Ej17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int n= sc.nextInt();
        n=n%10;
        System.out.println("El último dígito del número es " +n);


        sc.close();
    }

}