import java.util.Scanner;
public class ___Ejercicio_For_11_Figura_Medio_Triangulo_Numeros_Invertido {
    public static void main(String[] args) {

	/*Exercici 13. Un triangle invertit
	Desenvolupa un programa que demani a l’usuari un nombre positiu més gran que 0. El
	programa escriurà una línia per nombre entre el nombre introduït i el 1 (és a dir,
	decreixentment). A cada línia escriurà tots els nombres des de l’1 fins el nombre corresponent
	a la línia. Ex. si l’entrada és 5 la sortida serà

	1, 2, 3, 4, 5
	1, 2, 3, 4
	1, 2, 3
	1, 2
	1*/

        Scanner entrada = new Scanner(System.in);
        int userNumber = 0;

        System.out.println("Introduce un numero, por favor");
        userNumber = entrada.nextInt();

        for(int i = userNumber; i >= 1; i --) {
            System.out.println("");
            for(int j = 1; j <= i; j ++) {
                System.out.print(j + " ");
            }
        }
    }
}