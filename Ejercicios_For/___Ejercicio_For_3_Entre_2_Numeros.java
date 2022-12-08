import java.util.Scanner;
public class ___Ejercicio_For_3_Entre_2_Numeros {
    public static void main(String[] args) {

	/*Exercici 3: Entre dos nombres
	Desenvolupa un programa que demani dos números a l’usuari i escrigui tots els números entre
	el primer i el segon. Tingues en compte els casos que el primer nombre sigui més gran, més
	petit o igual que el segon.*/

        int primerNumero = 0;
        int segundoNumero = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un numero, por favor");
        primerNumero = entrada.nextInt();
        System.out.println("Introduce otro numero, por favor");
        segundoNumero = entrada.nextInt();

        if(primerNumero < segundoNumero) {
            for(int i = primerNumero + 1; i < segundoNumero; i ++) {
                System.out.println(i);
            }
        }
        if(primerNumero > segundoNumero) {
            for(int i = primerNumero - 1; i > segundoNumero; i --) {
                System.out.println(i);
            }
        }
        if(primerNumero == segundoNumero) {

            System.out.println("Estos numeros son iguales");
        }
    }
}

