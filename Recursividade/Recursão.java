package Recursividade;

import java.util.Scanner;

/**
 * Stack overflow
 */
public class Recursão {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial é " + fatorial);
    }
}
