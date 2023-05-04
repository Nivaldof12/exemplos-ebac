package Algoritmos;

public class Pilha {

    private int[] elementos;
    private int tamanho;

    public Pilha() {
        this.elementos = new int[10];
        this.tamanho = 0;
    }

    public void push(int elemento) {
        if (this.tamanho == this.elementos.length) {
            int[] novoArray = new int[this.elementos.length * 2];
            for (int i = 0; i < this.tamanho; i++) {
                novoArray[i] = this.elementos[i];
            }
            this.elementos = novoArray;
        }
        this.elementos[this.tamanho++] = elemento;
    }

    public int pop() {
        if (this.tamanho == 0) {
            throw new IllegalStateException("Pilha vazia");
        }
        int elemento = this.elementos[--this.tamanho];
        this.elementos[this.tamanho] = 0;
        return elemento;
    }

    public int top() {
        if (this.tamanho == 0) {
            throw new IllegalStateException("Pilha vazia");
        }
        return this.elementos[this.tamanho - 1];
    }

    public boolean isEmpty() {
        return this.tamanho == 0;
    }

    public int size() {
        return this.tamanho;
    }

}
