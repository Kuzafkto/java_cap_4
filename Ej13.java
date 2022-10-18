/*
 * Escribe un programa que ordene tres números enteros introducidos por teclado.

 * 
 * @author KuzaFkto
 */
import java.util.Scanner;

public class Ej13{
    public static void main(String[] args) {

            Scanner sc = new Scanner (System.in);
            System.out.println("Ingresa el primer número");
            int n = sc.nextInt();
            System.out.println("Ingresa el segundo número");
            int n2 = sc.nextInt();
            System.out.println("Ingresa el tercer número");
            int n3 = sc.nextInt();
    
        if (n>n2 && n>n3){
                if (n2>n3){
                System.out.println(n3+" "+n2+" "+n);
                }
                else {
                System.out.println(n2+" "+n3+" "+n);
            }
        }
    
        else if (n2>n3){
                if(n3>n){
                    System.out.println(n+" "+n3+" "+n2);
                } else {
                        System.out.println(n3+" "+n+" "+n2);
                    }
            }
            else if(n3>n){
                if(n2>n){
                    System.out.println(n+" "+n2+" "+n3);
                }
                else{
                    System.out.println(n2+" "+" "+n+" "+ " "+n3);
                }
            }
            sc.close();
      
  }
 }