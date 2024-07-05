import java.util.Scanner;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Random randomNumbers =  new Random();
        int numAdivinar = randomNumbers.nextInt(100);
        int intento  = 0;
        int contador = 0;
        System.out.println(numAdivinar);

        while (intento != numAdivinar)
        {
            System.out.println("Ingresa un número para intentar adivinar");
            intento = teclado.nextInt();
            contador++;
        }

        System.out.println("Has adivinado el número que era " + numAdivinar + " en " +contador + " intentos.");
    }
}
