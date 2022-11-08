/*
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
nacimiento.
 *@author KuzaFkto
 */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el mes de nacimiento (1-12): ");
        int month=sc.nextInt();
        System.out.print("Ingrese el día de nacimiento (1-31): ");
        int day=sc.nextInt();

        if(day>0 && day<31){

            switch (month){
                case 1:
                    if(day<=20){
                        System.out.println("Tu signo zodiacal es Capricornio");
                    }else{
                        System.out.println("Tu signo zodiacal es Acuario");
                    }
                        break;
                case 2:
                    if (day<=19){
                        System.out.println("Tu signo zodiacal es Acuario");
                    }else{
                        System.out.println("Tu signo zodiacal es Piscis");
                    }
                    break;
                case 3:
                    if (day<=20){
                        System.out.println("Tu signo zodiacal es Piscis");
                    }else{
                        System.out.println("Tu signo zodiacal es Aries");
                    }
                    break;
                case 4:
                    if (day<=19){
                        System.out.println("Tu signo zodiacal es Aries");
                    }else{
                        System.out.println("Tu signo zodiacal es Tauro");
                    }
                    break;
                case 5:
                    if (day<=20){
                        System.out.println("Tu signo zodiacal es Tauro");
                    }else {
                        System.out.println("Tu signo zodiacal es Geminis");
                    }
                    break;
                case 6:
                    if (day<=20){
                        System.out.println("Tu signo zodiacal es Geminis");
                    }else{
                        System.out.println("Tu signo zodiacal es Cancer");
                    }
                    break;
                case 7:
                    if (day<=22){
                        System.out.println("Tu signo zodiacal es Cancer");
                    }else {
                        System.out.println("Tu signo zodiacal es Leo");
                    }
                    break;
                case 8:
                    if (day<=22){
                        System.out.println("Tu signo zodiacal es Leo");
                    }else{
                        System.out.println("Tu signo zodiacal es Virgo");
                    }
                    break;
                case 9:
                    if (day<=22){
                        System.out.println("Tu signo zodiacal es Virgo");
                    }else {
                        System.out.println("Tu signo zodiacal es Libra");
                    }
                    break;
                case 10:
                    if (day<=22){
                        System.out.println("Tu signo zodiacal es Libra");
                    }else {
                        System.out.println("Tu signo zodiacal es Escorpio");
                    }
                    break;
                case 11:
                    if (day<=22){
                        System.out.println("Tu signo zodiacal es Escorpio");
                    }else {
                        System.out.println("Tu signo zodiacal es Sagitario");
                    }
                    break;
                case 12:
                    if (day<=21){
                        System.out.println("Tu signo zodiacal es Sagitario");
                    }else{
                        System.out.println("Tu signo zodiacal es Capricornio");
                    }
                    break;
                default:
                    System.out.println("El valor de mes ingresado no es válido");
                    break;
            }
        }else{
         System.out.println("El número de día ingresado no es válido");
        }

        sc.close();
    }
}
