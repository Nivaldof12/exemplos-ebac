package Algoritmos;

public class TestePilha {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        System.out.println("A pilha está vazia? " + pilha.isEmpty());
        System.out.println("Tamanho da pilha: " + pilha.size());

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);

        System.out.println("A pilha está vazia? " + pilha.isEmpty());
        System.out.println("Tamanho da pilha: " + pilha.size());

        System.out.println("Topo da pilha: " + pilha.top());

        int elementoRemovido = pilha.pop();
        System.out.println("Elemento removido: " + elementoRemovido);

        System.out.println("Topo da pilha: " + pilha.top());
        System.out.println("Tamanho da pilha: " + pilha.size());
    }
}
