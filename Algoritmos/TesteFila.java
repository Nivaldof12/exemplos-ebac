package Algoritmos;

import java.util.Scanner;

public class TesteFila {
    public static void main(String[] args) {
        teste1();
        //teste2();
    }

    public static void teste1() {
        Fila fila = new Fila(5);
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        System.out.println(fila.front()); // Saída: 1
        System.out.println(fila.rear()); // Saída: 3
        fila.dequeue();
        fila.enqueue(4);
        System.out.println(fila.front()); // Saída: 2
        System.out.println(fila.rear()); // Saída: 4
        System.out.println(fila.size()); // Saída: 3
        System.out.println(fila.isEmpty()); // Saída: false
    }
    public static void teste2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a capacidade da fila:");
        int capacidade = scanner.nextInt();
        Fila fila = new Fila(capacidade);

        while (true) {
            System.out.println("Digite a operação desejada: (enqueue, dequeue, rear, front, size, isEmpty, exit)");
            String operacao = scanner.next();

            switch (operacao) {
                case "enqueue":
                    System.out.println("Digite o valor a ser enfileirado:");
                    int valor = scanner.nextInt();
                    fila.enqueue(valor);
                    System.out.println("Valor " + valor + " adicionado à fila");
                    break;

                case "dequeue":
                    try {
                        int valorRemovido = fila.dequeue();
                        System.out.println("Valor " + valorRemovido + " removido da fila");
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "rear":
                    try {
                        int valorFim = fila.rear();
                        System.out.println("Valor no fim da fila: " + valorFim);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "front":
                    try {
                        int valorInicio = fila.front();
                        System.out.println("Valor na frente da fila: " + valorInicio);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "size":
                    int tamanho = fila.size();
                    System.out.println("Tamanho da fila: " + tamanho);
                    break;

                case "isEmpty":
                    boolean vazia = fila.isEmpty();
                    System.out.println("A fila está vazia? " + vazia);
                    break;

                case "exit":
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Operação inválida!");
                    break;
            }
        }
    }
}

