/*
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t =√2h/g.
siendo g = 9.81m/s2

 * 
 * 
 * @author KuzaFkto
 */

import java.util.Scanner;
import java.lang.Math;
public class Ej6{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la altura en la que se encuentra el objeto");
        int h = sc.nextInt();
        if (h>0){
            double t = Math.round(Math.sqrt((2*h)/9.81));
        System.out.println("El objeto tardará " + t + " segundos en caer");
        }else{
            System.out.println("La altura no puede ser negativa");
        }
        sc.close();
    }
}