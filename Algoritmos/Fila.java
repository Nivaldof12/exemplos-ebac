package Algoritmos;

public class Fila {
    private int[] elementos;
    private int tamanho;
    private int inicio;
    private int fim;

    public Fila(int capacidade) {
        elementos = new int[capacidade];
        tamanho = 0;
        inicio = 0;
        fim = -1;
    }

    public void enqueue(int elemento) {
        if (tamanho == elementos.length) {
            throw new IllegalStateException("Fila cheia");
        }
        fim++;
        if (fim == elementos.length) {
            fim = 0;
        }
        elementos[fim] = elemento;
        tamanho++;
    }

    public int dequeue() {
        if (tamanho == 0) {
            throw new IllegalStateException("Fila vazia");
        }
        int elementoRemovido = elementos[inicio];
        inicio++;
        if (inicio == elementos.length) {
            inicio = 0;
        }
        tamanho--;
        return elementoRemovido;
    }

    public int rear() {
        if (tamanho == 0) {
            throw new IllegalStateException("Fila vazia");
        }
        return elementos[fim];
    }

    public int front() {
        if (tamanho == 0) {
            throw new IllegalStateException("Fila vazia");
        }
        return elementos[inicio];
    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }
}
