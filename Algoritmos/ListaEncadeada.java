package Algoritmos;

public class ListaEncadeada {
    private Node head;
    private int size;

    public ListaEncadeada() {
        this.head = null;
        this.size = 0;
    }

    public void push(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
        size++;
    }

    public Node pop() {
        if (head == null) {
            return null;
        } else if (head.getNext() == null) {
            Node temp = head;
            head = null;
            size--;
            return temp;
        } else {
            Node current = head;
            while (current.getNext().getNext() != null) {
                current = current.getNext();
            }
            Node temp = current.getNext();
            current.setNext(null);
            size--;
            return temp;
        }
    }

    public void insert(int index, Node node) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            node.setNext(head);
            head = node;
            size++;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            node.setNext(current.getNext());
            current.setNext(node);
            size++;
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            head = head.getNext();
            size--;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
            size--;
        }
    }

    public Node elementAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            return current;
        }
    }

    public int size() {
        return size;
    }

    public void printList() {
        Node current = head;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.getValue());
            if (current.getNext() != null) {
                System.out.print(", ");
            }
            current = current.getNext();
        }
        System.out.print("]");
    }
}
