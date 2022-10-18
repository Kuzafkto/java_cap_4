/*
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora.
Ejemplo 1:
Por favor, introduzca el número de horas trabajadas durante la semana: 36
El sueldo semanal que le corresponde es de 432 euros
Ejemplo 2:
Por favor, introduzca el número de horas trabajadas durante la semana: 40
El sueldo semanal que le corresponde es de 480 euros
Ejemplo 3:
Por favor, introduzca el número de horas trabajadas durante la semana: 55
El sueldo semanal que le corresponde es de 720 euros

@author KuzaFkto
 */
import java.util.Scanner;

public class Ej4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas trabajadas durante la semana");
        int hours= sc.nextInt();
        int salary = 0;
        if ( hours > 40){
            int adhours= hours -40;
            salary= (adhours*16)+(40*12);
        }else{
            salary=hours*12;
        }
        System.out.println("Su salario semanal es de " + salary + " euros.");
        sc.close();
    }
}