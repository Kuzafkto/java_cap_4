/*
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.
 * 
 * 
 * @author KuzaFkto 
 */

import java.util.Scanner;

public class Ej1{
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            String day = sc.nextLine();
            System.out.println("Ingrese el día de la semana");
            switch (day) {
                case "lunes":
                    System.out.println("El lunes tenemos programación");
                    break;
            
                case "martes":
                    System.out.println(" El martes tenemos sistemas informáticos");
                    break;

                case "miercoles":
                    System.out.println("El miercoles tenemos entornos de desarrollo");

                    break;
                
                    
                case "jueves":
                    System.out.println(" El jueves tenemos programación");

                    break;

                case "viernes":
                    System.out.println(" El viernes tenemos FOL");
                    break;
                default:
                    System.out.println("El día introducido no es correcto");
                    break;
            
        } 
        
    }
}