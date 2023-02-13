package mod10;

import java.util.Scanner;

/**
 * @author Nivaldo
 */

public class ControledeFluxo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("[1] Calcular nota");
        System.out.println("[2] Sair");
        System.out.println("Informe a escolha desejada: ");
        double sistema = s.nextDouble();

        if (sistema == 1) {
            Scanner s1 = new Scanner(System.in);
            Scanner s2 = new Scanner(System.in);
            Scanner s3 = new Scanner(System.in);
            Scanner s4 = new Scanner(System.in);

            System.out.println("Informe a Primeira nota: ");
            double nota1 = s1.nextDouble();
            System.out.println("Informe a Segunda nota: ");
            double nota2 = s2.nextDouble();
            System.out.println("Informe a Terceira nota: ");
            double nota3 = s3.nextDouble();
            System.out.println("Informe a Quarta nota: ");
            double nota4 = s4.nextDouble();

            double notafinal = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.println("A média das notas é: " + notafinal);

            if (notafinal >= 7 && notafinal <= 10) {
                System.out.println("Aluno aprovado!");
            } else if (notafinal > 4 && notafinal < 7) {
                System.out.println("Aluno está de recuperação!");
            } else if (notafinal >=0 && notafinal < 5) {
                System.out.println("Aluno reprovado!");
            } else {
                System.out.println("Coloque números de 0 a 10!");
            }

        } else if (sistema == 2) {
            System.out.println("Obrigado!");
        } else {
            System.out.println("Informe o número 1 ou 2.");
        }
    }
}
