/*
 * Escribe un programa que pinte una pirámide rellena con un carácter introducido
por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
hacia la derecha.


 * @author KuzaFkto
 */
import java.util.Scanner;

public class Ej15{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        char jhinCrit = '4';
        System.out.println("");
        System.out.printf("Elija la direccion de la piramide :\n1: Derecha\t 3: Arriba\n2: Izquierda \t 4:abajo \n");

        int choice = sc.nextInt(); //user chooses pyramid side.

        switch (choice) {
            case 1:
                
            System.out.println ( jhinCrit+"   " );
            System.out.println (jhinCrit+""+jhinCrit+"  " );
            System.out.println (jhinCrit+""+jhinCrit+""+jhinCrit+" "  );
            System.out.println (jhinCrit+""+jhinCrit+"  " );
            System.out.println ( jhinCrit+"   " );
                break;
            case 2:
            
            System.out.println ("    " + jhinCrit);
            System.out.println ("   " + jhinCrit+""+jhinCrit);
            System.out.println ("  " + jhinCrit+""+jhinCrit+""+jhinCrit);
            System.out.println ("   " + jhinCrit+""+jhinCrit);
            System.out.println ("    " + jhinCrit);
            
                break;
            case 3:
            System.out.println ("   " + jhinCrit);
            System.out.println ("  " + jhinCrit+""+jhinCrit+""+jhinCrit);
            System.out.println (" " + jhinCrit+""+jhinCrit+""+jhinCrit+""+jhinCrit+""+jhinCrit);
            System.out.println (jhinCrit+""+jhinCrit+""+jhinCrit+""+jhinCrit+""+jhinCrit+""+jhinCrit+""+jhinCrit);
                break;
            case 4:
            System.out.println (jhinCrit+""+jhinCrit+""+jhinCrit+""+jhinCrit+""+jhinCrit+""+jhinCrit+""+jhinCrit);
            System.out.println (" " + jhinCrit+""+jhinCrit+""+jhinCrit+""+jhinCrit+""+jhinCrit);
            System.out.println ("  " + jhinCrit+""+jhinCrit+""+jhinCrit);
            System.out.println ("   " + jhinCrit);
                break;
            default:
            System.out.println("Error, elija una opción correcta");
                break;
        }

/* 
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡠⢒⣩⣥⠡⠀⠀⠀⠀⠌⣬⣍⡒⢄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡴⠫⣶⣿⣿⣿⣧⡑⢄⡠⢊⣼⣿⣿⣿⣦⠝⢆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡜⡅⣿⣦⡙⢿⣿⣿⣿⣦⣴⣿⣿⣿⡿⢋⣴⣿⢨⢣⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⡜⣼⡇⣿⣿⣿⣦⡹⣿⣿⣿⣿⣿⣿⢋⣴⣿⣿⣿⢸⣧⢣⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⠗⠛⠻⠿⣿⣷⡘⡿⠟⠻⢿⢃⣾⣿⠿⠟⠛⠺⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠸⠟⠀⣀⢀⣄⣀⠈⠙⡗⣰⠿⠿⣆⢺⠋⠁⣀⣤⡀⣀⠈⠻⠇⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢀⢦⣍⡛⠶⣤⠤⠜⣀⣤⠀⣶⣶⠀⣤⣐⠣⢤⣤⠶⢛⣩⡶⡀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠈⢧⡙⢿⣷⡆⣶⣿⡿⢋⢸⣿⣿⡆⡙⢿⣿⣶⢰⣾⡿⢋⡼⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢙⠦⣍⠰⣿⡟⣡⣿⢸⣿⣿⡇⣿⡌⢻⣿⠆⣩⠶⡋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⢌⢷⢈⢳⣌⠁⣤⡌⢸⣿⣿⡇⢡⣤⠈⣡⡞⡁⡾⡡⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡎⣧⡹⢰⣿⣷⣈⠛⠛⣡⣾⣿⡆⢏⣼⢸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⣿⣇⢸⣿⣿⣿⣿⣿⣿⣿⣿⡇⣸⣿⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠃⣿⣿⣄⠙⢉⣩⣉⣉⣍⡉⠋⣨⣿⣿⠘⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⣄⠻⣿⣿⣷⡆⢀⣀⣀⡀⢰⣾⣿⣿⠟⣠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠳⣌⠻⢋⡤⠉⠉⠉⠁⣤⡙⠟⣡⠞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠿⣿⡇⠀⠀⠀⠀⢸⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        */

        sc.close();
    }
}