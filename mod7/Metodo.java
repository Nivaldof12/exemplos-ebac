package mod7;

/**
 * @author Nivaldo
 */
public class Metodo {
    public static void main(String[] args) {
        Objeto1 objeto1 = new Objeto1();
        Objeto2 objeto2 = new Objeto2();

        // Objeto1 = bola
        System.out.println("Método 1: ");
        objeto1.setCodigo(1);
        objeto1.setPreco(99.99);
        objeto1.setMarca("Adidas");
        objeto1.setQuantidade(14);
        objeto1.imprimirMetodo();
        System.out.println(" ");

        // Objeto2 = Video Game
        System.out.println("Método 2: ");
        objeto2.codigo = 2;
        objeto2.marca = "Xbox One";
        objeto2.memoria = 500;
        objeto2.console();
    }
}
