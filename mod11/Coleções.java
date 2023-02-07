package mod11;

import java.util.Random;

public class Coleções {
    public static void main(String[] args){
            teste1();
            teste2();
        }

    private static void teste1() {
        // i++ é a posição + 1, ou seja, toda vez que rodar o controle de fluxo com por exemplo o
        // "for" ele vai passar para a próxima posiçãodo da lista (array).
        System.out.println("****** Imprimindo lista ******");
        int[] array = {87,21,35,65,75,34,22};
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void teste2() {
    // Sorteando um número de 1 a 100!
        System.out.println("****** Sorteio de 1 a 100 ******");
        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        Random gerador = new Random();
        int sorteado = numeros[gerador.nextInt(numeros.length)];
        System.out.println("Número sorteado: " + sorteado);
    }

}
