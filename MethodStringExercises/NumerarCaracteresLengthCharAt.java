import java.util.Scanner;
public class LiebanaJoseAntonio_StringsE_2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userPhrase = "";

        System.out.println("Bienvenido, escriba una frase cualquiera, por favor");
        userPhrase = input.nextLine();

        for (int i = 0; i <userPhrase.length() ; i++) {
            System.out.print( userPhrase.charAt(i)  + ":" + (i+1) + " ");
        }
    }
}
