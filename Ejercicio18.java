/*
 * Escribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras

 * @author KuzaFkto
 */
import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese un número para mostrar la primer cifra");
        int n = sc.nextInt();
        if (n >=0 && n<10){
            System.out.println(n);
        }else if (n>=10 && n<100){
            System.out.println(n/10);
        }else if (n>=100 && n <1000){
            System.out.println(n/100);
        } else if (n>=1000 && n<10000){
            System.out.println(n/1000);
        } else if (n>=10000 && n<100000){
            System.out.println(n/10000);
        }
        sc.close();
    }
}