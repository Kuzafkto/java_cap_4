/*
 *
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.

 * @author KuzaFkto
 */
import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            int day = sc.nextInt();
            switch (day) {
                case 1:
                        System.out.println("Hoy es lunes");
                    break;
            
                case 2:
                        System.out.println("Hoy es martes");
                    break;

                case 3:
                        System.out.println("Hoy es miercoles");
                    break;

                case 4:
                        System.out.println("Hoy es jueves");
                    break;

                case 5:
                        System.out.println("Hoy es viernes");
                    break;

                case 6:
                        System.out.println("Hoy es sabado");
                    break;

                case 7:
                        System.out.println("Hoy es domingo");
                    break;
                default:
                    break;
            }
            sc.close();
        
    }
}