/*
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
a las 15:00h.

 * @author KuzaFkto
 */
import java.util.Scanner;
public class Ejercicio22{
    /*Necesitamos usar el formato de 24 horas, recuerda que el fin de semana empieza el viernes a las 15:00
     * se da por hecho que introducirá los datos antes del viernes a las 15:00 por lo tanto no ingresará ni
     * sabado ni domingo.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la hora actual, separando los minutos por coma");
        float hour = sc.nextFloat();
        if (hour>0 && hour<=24){
            System.out.println("Ingrese el día de la semana");
            String day = sc.next();
            float minutes = 0;
            /*
             * formula para el siguiente día:
             * 
             * 24*60-((int)hour*60+((hour - (int) hour)*100))= 24 horas pasados a minutos - minutos de la hora actual= lo que falta para medianoche. 
             * 
             * Solo debo de sumarle los días faltantes (24 horas pasadas a minutos), y el período de tiempo del viernes 
             * desde las 0:00 hasta las 15:00 que es cuando empieza el fin de semana.
             * 
             */
            switch (day) {
                case "lunes":
                minutes = 24*60-((int)hour*60+((hour - (int) hour)*100));
                minutes += (24*60)*3; // Faltan otros tres días (martes,miercoles y jueves) hasta llegar al viernes 
                minutes += 15*60; // período de tiempo desde las 0:00 del viernes hasta las 15:00
                System.out.println("Faltan " + (int)minutes + " minutos para que comience el fin de semana (Viernes a las 15:00)");
                    break;
                    
                 case "martes":
                 minutes = (24*60-((int)hour*60+((hour - (int) hour)*100))+ (24*60)*2 + 15*60);
                 System.out.println("Faltan " + (int)minutes + " minutos para que comience el fin de semana (Viernes a las 15:00)");
                    break;

                 case "miercoles ":
                 minutes = (24*60-((int)hour*60+((hour - (int) hour)*100)) + 24*60 + 15*60);
                 System.out.println("Faltan " + (int)minutes + " minutos para que comience el fin de semana (Viernes a las 15:00)");
                    break;

                 case "jueves ":
                 minutes = (24*60-((int)hour*60+((hour - (int) hour)*100))) + 15*60;
                 System.out.println("Faltan " + (int)minutes + " minutos para que comience el fin de semana (Viernes a las 15:00)");
                    break;

                 case "viernes":
                 if (hour<=15){
                    minutes = 15*60-((int)hour*60+((hour - (int) hour)*100));
                 }else{
                    System.out.println("El fin de semana empezó hace " + (int)(((int)hour*60+((hour - (int) hour)*100)) - 15*60) + " minutos!!");
                 }
                    break;
        
                default:
                    System.out.println("Ingrese un día correcto, recuerda que no puedes ingresar ni el sabado ni el domingo");
                    break;
            }
        }else{
            System.out.println("Por favor, ingrese una hora válida");
        }
        
        sc.close();
    }
}