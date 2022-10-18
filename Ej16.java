/*
 * Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos
está siendo infiel. El programa irá haciendo preguntas que el usuario contestará
con verdadero o falso. Cada pregunta contestada como verdadero sumará 3
puntos. Las preguntas contestadas con falso no suman puntos. A continuación
se listan las preguntas del test.

1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo
aparente.
2. Ha aumentado sus gastos de vestuario
3. Ha perdido el interés que mostraba anteriormente por ti
4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se
arregla el pelo y se asea con más frecuencia (si es mujer)
5. No te deja que mires la agenda de su teléfono móvil
6. A veces tiene llamadas que dice no querer contestar cuando estás tú
delante
7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a
8. Muchos días viene tarde después de trabajar porque dice tener mucho
más trabajo
9. Has notado que últimamente se perfuma más
10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo
A continuación se muestran los mensajes que deberá dar el programa según
la puntuación obtenida.
• Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente
fiel.
• Puntuación entre 11 y 22: Quizás exista el peligro de otra persona en su
vida o en su mente, aunque seguramente será algo sin importancia. No
bajes la guardia.
• Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estar
viviendo un romance con otra persona. Te aconsejamos que indagues un
poco más y averigües que es lo que está pasando por su cabeza.
 * 
 * @author KuzaFkto
 */
import java.util.Scanner;
public class Ej16{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean answer=false;
        int points=0;

        System.out.println("Bienvenido al test de infidelidad, por favor responda con total honestidad \n escribiendo ''true'' para verdadero y ''false'' para falso");

        System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        answer=sc.nextBoolean();
        if(answer){
            points +=3;
        }
        System.out.println("2. Ha aumentado sus gastos de vestuario.");

        answer=sc.nextBoolean();
        if(answer){
            points +=3;
        }

        System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");

        answer=sc.nextBoolean();
        if(answer){
            points +=3;
        }

        System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora \n se arregla el pelo  y se asea con más frecuencia (si es mujer).");

        answer=sc.nextBoolean();
        if(answer){
            points +=3;
        }

        System.out.println("5. No te deja que mires la agenda de su teléfono móvil.");

        answer=sc.nextBoolean();
        if(answer){
            points +=3;
        }

        System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");

        answer=sc.nextBoolean();
        if(answer){
            points +=3;
        }

        System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");

        answer=sc.nextBoolean();
        if(answer){
            points +=3;
        }

        System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");

        answer=sc.nextBoolean();
        if(answer){
            points +=3;
        }

        System.out.println("9. Has notado que últimamente se perfuma más.");

        answer=sc.nextBoolean();
        if(answer){
            points +=3;
        }

        System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo");

        answer=sc.nextBoolean();
        if(answer){
            points +=3;
        }

        if (points>=0 && points <=10){
            System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        }else if(points>=11 && points <22){
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, \n aunque seguramente será algo sin importancia. No bajes la guardia");
        }else if (points>=22 && points <=30){
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona.\n Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
        }

        sc.close();
    }
}