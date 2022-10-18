/*
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
horas, los minutos no se deben introducir por teclado.

@author KuzaFkto
 */
import java.util.Scanner;

public class Ej2{
    public static void main(String[] args) {
       
            Scanner sc = new Scanner (System.in);
            System.out.println("Ingrese la hora");
            int time = sc.nextInt();
           
            if(time>=6 && time<=12){
             System.out.println("Buenos días");
            } else if (time>=13 && time<=20){
                System.out.println("Buenos días");
            }else if (time>=21 || time<=5){
                System.out.println("Buenas noches");
            }
            
    }
}