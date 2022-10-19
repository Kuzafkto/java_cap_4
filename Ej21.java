/*
 * 
 * Calcula la nota de un trimestre de la asignatura Programación. El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la average de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene 
la nota media anterior.

Ejemplo 1:
Nota del primer control: 7
Nota del segundo control: 10
Tu nota de Programación es 8.5

Ejemplo 2:
Nota del primer control: 6
Nota del segundo control: 3
¿Cuál ha sido el resultado de la recuperación? (apto/no apto): apto
Tu nota de Programación es 5

Ejemplo 3:
Nota del primer control: 6
Nota del segundo control: 3
¿Cuál ha sido el resultado de la recuperación? (apto/no apto): no apto
Tu nota de Programación es 4.5

 * 
 * @author KuzaFkto
 */
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ej21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la nota del primer control de programación");
        int n1= sc.nextInt();
        System.out.println("Ingresa la nota del segundo control de programación ");
        int n2 = sc.nextInt();
        if (n1>=0 && n2>=0 && n1<=10 && n2 <=10){
            float average = (n1+n2)/2;
            if (average>=5){
                System.out.println("Felicidades, tu media de programación es de " + average + ", estas aprobado");
            }else{
                System.out.println("¿Cual ha sido el resultado de la recuperación? (apto/no apto)");
                String result = sc.nextLine();
                result = sc.nextLine();
                switch (result) {
                    case "apto":
                        average = 5;
                        System.out.println("Eres apto!, tu nota de programación es de " + average);
                        break;

                        case "no apto":
                            System.out.println("Tu nota de programación es de " + average);
                        break;
                
                    default:
                    System.out.println("Error al ingresar el resultado");
                        break;
                }
            }
        }else{
            System.out.println("Las notas ingresadas de los controles son incorrectas");
        }

        sc.close(); 
    }
}