package mod11;
import java.util.Random;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
/**
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        String myInt = scanner.next();
        String my = scanner.next();
        scanner.close();

        System.out.println("myString is: " + myString);
        System.out.println("myInt is: " + myInt);
        System.out.println("my: " + my);
 */

        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        Random gerador = new Random();
        int sorteado = numeros[gerador.nextInt(numeros.length)];
        System.out.println("Número sorteado: " + sorteado);

    }
}
