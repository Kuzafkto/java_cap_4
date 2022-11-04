/*
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
pedir por teclado. El carácter con el que se pinta la pirámide también se debe
pedir por teclado.
 * @author KuzaFkto
 */
import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la altura de la piramide");
        int heigth=sc.nextInt();
        for (int i=1;i<=heigth;i++){
            for (int z =0; z<heigth-i;z++){
                System.out.print(" ");
            }
            for (int x=0;x<i*2-1;x++){
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}