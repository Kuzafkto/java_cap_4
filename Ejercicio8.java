/*
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente).

 * 
 * @author KuzaFkto
 */

import java.util.Scanner;
public class Ejercicio8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la primer nota");
        float g1 = sc.nextFloat();
        System.out.println("Ingrese la segunda nota");
        float g2 = sc.nextFloat();
        System.out.println("Ingrese la tercer nota");
        float g3 = sc. nextFloat();
        float average = (g1+g2+g3)/3;
        System.out.println("El promedio es " + average);


         if (average <5){
            System.out.println("Tu nota de boletin es insuficiente");
         } else if (average == 5){
            System.out.println("Tu nota de boletin es suficiente");
        }else if (average>5 && average< 6){
            System.out.println("Tu nota de boletin es bien");
         } else if (average>=7 && average <=8.50){
            System.out.println("Tu nota de boletin es notable");
         }else if (average>=8.50 && average <=10){
            System.out.println("Tu nota de boletin es sobresaliente");
         } else{
            System.out.println("La nota introducida es incorrecta");
         }
        sc.close();
    }

}