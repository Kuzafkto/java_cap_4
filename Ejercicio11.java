/*
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
los segundos que faltan para llegar a la medianoche.
 * 
 * @author KuzaFkto
 */
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio11{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la hora separando los minutos con coma (formato 24Hs)");
        float hours= sc.nextFloat();
        double toTwelve= 24*3600 - ((((int)hours)*3600) + (((hours-(int)hours)*100)*60));
        System.out.println("Faltan " + Math.round(toTwelve) + " segundos para medianoche");
        sc.close();
    }
}