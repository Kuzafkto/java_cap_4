/* 
Escribe un programa que genere la nómina (bien desglosada) de un empleado
según las siguientes condiciones:

• Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
de proyecto), los días que ha estado de viaje visitando clientes durante el
mes y su estado civil (1 - Soltero, 2 - Casado).

• El sueldo base según el cargo es de 950, 1200 y 1600 euros según
si se trata de un prog. junior, un prog. senior o un jefe de proyecto
respectivamente.

• Por cada día de viaje visitando clientes se pagan 30 euros extra en
concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
un 25% en caso de estar soltero y un 20% en caso de estar casado.

Ejemplo:
1 - Programador junior
2 - Prog. senior
3 - Jefe de proyecto
Introduzca el cargo del empleado (1 - 3): 2
¿Cuántos días ha estado de viaje visitando clientes? 5
Introduzca su estado civil (1 - Soltero, 2 - Casado): 2
----------------------------------
| Sueldo base 1200,00 |
| Dietas ( 5 viajes) 150,00 |
|--------------------------------|
| Sueldo bruto 1350,00 |
| Retención IRPF (20%) 270,00 |
|--------------------------------|
| Sueldo neto 1080,00 |
----------------------------------

@author KuzaFkto
*/

import java.util.Scanner; 
public class Ej24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.printf("1- Programador Junior \n2- Programador Senior\n3- Jefe de proyecto\n");
        System.out.print("Introduzca el cargo del empleado (1 - 3): ");
         int emplCharge=sc.nextInt();
         float salary = 0;
         float baseSalary=0;
         switch (emplCharge) {
            case 1:
                salary = 950;
                baseSalary = 950;
                break;
            case 2:
                salary = 1200;
                baseSalary = 1200;
                break;
            case 3:
                salary = 1600;
                baseSalary = 1600;
                break;
            default:
            System.out.println("El puesto ingresado es incorrecto");
                break;
         }

         System.out.printf("\n¿Cuántos días ha estado de viaje visitando clientes? ");
        int travelDays=sc.nextInt();
        if(travelDays>=0){
            salary+=travelDays*30;
        }else{
            System.out.println("La cantidad de días de viaje ingresados no puede ser negativo");
        }
        System.out.printf("\n Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
        int civil=sc.nextInt();
        if(civil!=1 || civil!=2){
            System.out.println("El estado civil ingresado es incorrecto");
        }
        System.out.printf("-------------------------------------\n");
        System.out.printf("%-25s %-8.2f %-15s \n","| Sueldo base",baseSalary," |");
        System.out.printf("%-25s %-8.2f %-15s \n","| Dietas ("+travelDays+" viajes)",(float)(travelDays*30)," |");
        System.out.printf("-------------------------------------\n");
        System.out.printf("%-25s %8.2f %-15s \n","| Sueldo bruto",baseSalary+(float)(travelDays*30)," |");
        if (civil == 1){
            salary-=salary*0.25;
            System.out.printf("%-25s %8.2f %-15s \n","| Retención IRPF (25%)",(baseSalary+(float)(travelDays*30))*0.25," |");

        }else if(civil ==2){
            salary-=salary*0.20;
            System.out.printf("%-25s %8.2f %-15s \n","| Retención IRPF (20%)",(baseSalary+(float)(travelDays*30))*0.20," |");
        } 
        System.out.printf("-------------------------------------\n");

        System.out.printf("%-25s %8.2f %-15s \n","| Sueldo neto",salary," |");

        System.out.printf("-------------------------------------\n");

        sc.close();
    }
}

