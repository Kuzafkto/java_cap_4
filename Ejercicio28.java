/* 
 * Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción
incorrecta, el programa deberá mostrar un mensaje de error.

Ejemplo 1:
Turno del jugador 1 (introduzca piedra, papel o tijera): papel
Turno del jugador 2 (introduzca piedra, papel o tijera): papel
Empate

Ejemplo 2:
Turno del jugador 1 (introduzca piedra, papel o tijera): papel
Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
Gana el jugador 2

Ejemplo 3:
Turno del jugador 1 (introduzca piedra, papel o tijera): piedra
Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
Gana el jugador 1

 * 
 * @author KuzaFkto
*/
import java.util.Scanner;
public class Ejercicio28{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Jugador 1, elige una opción(piedra,papel o tijera): ");
        String choice1=sc.nextLine();
        System.out.print("Jugador 2, elige una opción(piedra,papel o tijera): ");
        String choice2=sc.nextLine();
        if((choice1.equals("tijera")|choice1.equals("papel")|choice1.equals("piedra"))&&(choice2.equals("tijera")|choice2.equals("papel")|choice2.equals("piedra"))){
            if(choice1.equals(choice2)){
                System.out.println("empate");
            }else{
                switch (choice1) {
                    case "tijera":
                        if(choice2.equals("papel")){
                            System.out.println("El jugador 1 gana");
                        }else{
                            System.out.println("El jugador 2 gana");
                        }
                        break;

                    case "piedra":
                        if(choice2.equals("tijera")){
                            System.out.println("El jugador 1 gana");
                        }else{
                            System.out.println("El jugador 2 gana");
                        }
                        break;
                    case "papel":
                        if(choice2.equals("piedra")){
                            System.out.println("El jugador 1 gana");
                        }else{
                            System.out.println("El jugador 2 gana");
                        }
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
            }

        }else{
            System.out.println("error");
        }

       
        
        sc.close();
    }
}