package Arrays;

import java.util.Scanner;
public class ArraysE6PedimosNotasYHacemosMedia {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        float sumaNotasClase = 0f;
        float[] notas;
        int numeroNotas = 0;
        boolean tipatgeCorrecte = false;
        int scores = 0;


        do {
            System.out.println("De cuantas notas vas a hacer media");
            tipatgeCorrecte = llegir.hasNextInt();

            if (!tipatgeCorrecte) {
                System.out.println("Error, valor no numeric");
            }else {
                numeroNotas = llegir.nextInt();
                if (numeroNotas <= 0) {
                    System.out.println("No puedes hacer la nota media de 0 o menos notas");
                    tipatgeCorrecte = false;
                }
            }
            llegir.nextLine();
        }while (tipatgeCorrecte == false);
        System.out.println("Hasta aqui todo ok");


        /* for (int i = 0; i < numeroNotas; i++) {
            do {
                System.out.println("Escribe la nota " + (i + 1) + ": ");
                tipatgeCorrecte = llegir.hasNextFloat();

                if (!tipatgeCorrecte) {
                    System.out.println("Error, valor no numeric");
                } else {
                    scores = llegir.nextFloat();
                    if (notas[i] < 0 || notas[i] > 10) {
                        System.out.println("Valor fuera de rango");
                        tipatgeCorrecte = false;
                    }
                }
                llegir.nextLine();
            } while (tipatgeCorrecte == false);
        }
        for (int i = 0; i < numeroNotas; i++) {
            sumaNotasClase = sumaNotasClase + notas[i];
        }
        System.out.println("Media clase : " + sumaNotasClase/numeroNotas);*/

    }
}