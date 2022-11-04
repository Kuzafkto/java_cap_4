/*
 * Realiza un programa que calcule la media de tres notas.
 * 
 * @author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio7{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la primer nota");
        float g1 = sc.nextFloat();
        System.out.println("Ingrese la segunda nota");
        float g2 = sc.nextFloat();
        System.out.println("Ingrese la tercer nota");
        float g3 = sc. nextFloat();
        if(g1>0&&g1<=10&& g2>0&&g2<=10 && g3>0&&g3<=10){
            float average = (g1+g2+g3)/3;
            System.out.println("El promedio es " + average);
        }else{
            System.out.println("La nota ingresada de las notas es incorrecta");
        }
       

        sc.close();
    }


}