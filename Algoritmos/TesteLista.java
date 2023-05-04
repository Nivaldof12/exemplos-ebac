package Algoritmos;

public class TesteLista {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        lista.push(node1);
        lista.push(node2);
        lista.insert(1, node3);

        lista.printList();

        lista.pop();
        lista.remove(1);

        System.out.println();
        lista.printList();
    }
}
