import java.util.Scanner;
public class A_ExercicisInicials9_TablaMultiplicar_While {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        final int TABLA = 5;
        int i = 1;

        while (i<=10){
            System.out.println(i + "x" + TABLA + " = " + (i * TABLA));
            i ++;
        }
    }
}
