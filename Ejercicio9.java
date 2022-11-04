/*
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo
ax2 + bx + c = 0).

@author KuzaFkto
 */
import java.util.Scanner;
import java.lang.Math;
public class Ejercicio9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el valor de a");
        int a = sc.nextInt();
        System.out.println("Ingresa el valor de b");
        int b = sc.nextInt();
        System.out.println("Ingresa el valor de c");
        int c = sc.nextInt();
        float raiz =(b*b- 4*a*c)/2*a;
        if (raiz>=0 && 2*a != 0){
            String ecuación = a + "x^2 +"+ b + "x + " +c;
            System.out.printf("Las soluciones a la ecuación %s son:", ecuación );
            System.out.printf("x = %.2f \n" + ((double)(-b)-(Math.sqrt(raiz))/(double)2*a));
            System.out.printf("x = %.2f \n" + ((double)(-b)+(Math.sqrt(raiz))/(double)2*a));

        }else{
            System.out.println("La ecuación no tiene solución");
        }
       
        sc.close();
    }
}   