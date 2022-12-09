/*3. Et dediques a vendre figures Otaku comprades a Tokio per wallapop. Si estan en bon
        estat les pots revendre per un +25%, si no, per +10%. Implementa l’algoritme.*/


import java.util.Scanner;
public class A_ExercicisInicials3_FiguraWallapop {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);

        float costInicial = 0.0f, preuVenta = 0.0f;
        boolean bonEstat;

        System.out.println("Benvingut/da al programa");
        System.out.print("Escriu l'import de la compra actual:");
        costInicial = llegir.nextFloat();
        System.out.println("Esta en bon estat la figura? (true | false)");
        bonEstat = llegir.nextBoolean();

        if (bonEstat == true){
            preuVenta = costInicial * 1.25f;
        }else{
            preuVenta = costInicial * 1.10f;
        }

        System.out.printf("El preu de venta es de %.2f €", preuVenta);
    }
}
