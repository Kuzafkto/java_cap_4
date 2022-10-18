/*
 * Una pastelería nos ha pedido realizar un programa que haga presupuestos de
tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
nombre; la nata suma 2.50 y la escritura del nombre 2.75.


Ejemplo 1:
Elija un sabor (manzana, fresa o chocolate): chocolate
¿Qué tipo de chocolate quiere? (negro o blanco): negro
¿Quiere nata? (si o no): si
¿Quiere ponerle un nombre? (si o no): no
Tarta de chocolate negro: 14,00 
Con nata: 2,50 
Total: 16,50 


Ejemplo 2:
Elija un sabor (manzana, fresa o chocolate): manzana
¿Quiere nata? (si o no): no
¿Quiere ponerle un nombre? (si o no): si
Tarta de manzana: 18,00 
Con nombre: 2,75 
Total: 20,75 


Ejemplo 3:
Elija un sabor (manzana, fresa o chocolate): fresa
¿Quiere nata? (si o no): si
¿Quiere ponerle un nombre? (si o no): si
Tarta de fresa: 16,00 
Con nata: 2,50 
Con nombre: 2,75 
Total: 21,25 
 * 
 * 
 * @author KuzaFkto
 */
import java.util.Scanner;
public class Ej27{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float totalPrice= 0;
        System.out.println("Elija un sabor (manzana,fresa,chocolate)");
        String flavor = sc.nextLine();
        String name = "";
        String cream="";
        String finalPhrase=""; 
        switch (flavor) {
            case "manzana":
            finalPhrase="Tarta de manzana 18,00 euros";
                totalPrice+=18;
                break;

            case "fresa":
            finalPhrase="Tarta de fresa 16,00 euros ";
                totalPrice+=16;
                break;

            case "chocolate":
                System.out.println("Chocolate blanco o negro");
                flavor = sc.nextLine();
                switch (flavor) {

                    case "negro":
                    finalPhrase="Tarta de chocolate negro 14,00 euros ";
                    totalPrice+=14;
                        break;

                    case "blanco":
                    finalPhrase="Tarta de chocolate blanco 15,00 euros ";
                    totalPrice+=15;
                        break;
                
                    default:
                    System.out.println("El gusto elegido ha sido incorrecto");
                        break;
                }
                break;
            default:
            System.out.println("El gusto elegido ha sido incorrecto");
                break;
        }

            System.out.println("Le añado nata? (si/no)");
            cream=sc.nextLine();
            switch (cream) {
                case "si":
                totalPrice+=2.50;
                    break;
                case "no":
                    
                    break;
            
                default:
                System.out.println("La opción elegida es incorrecta");
                    break;
            }
            
            System.out.println("Quiere ponerle un nombre? (si/no)");
            name=sc.nextLine();
            switch (name) {
                case "si":
                    totalPrice+=2.75;
                    break;
                case "no":
                    
                    break;
            
                default:
                System.out.println("La opción elegida es incorrecta");
                    break;
            }

            System.out.println(finalPhrase);
            if(cream.equals("si")){
                System.out.println("Con nata: 2,50 euros");
            }
            if(name.equals("si")){
                System.out.println("Con nombre: 2,75 euros");
            }
            System.out.println("Total : "+totalPrice+" euros");


        sc.close();
    }
}