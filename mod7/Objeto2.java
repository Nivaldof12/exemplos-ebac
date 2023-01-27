package mod7;

/**
 * @author Nivaldo
 */
public class Objeto2 {
    // Classe sem Getters e Setters

    //Variáveis
    int codigo;
    String marca;
    int memoria;

    //Método
    void console() {
        System.out.println("Código do produto: " + this.codigo);
        System.out.println("Marca do console: " + this.marca);
        System.out.println("O Vídeo game tem " + this.memoria + " Gigabytes de memoria");
    }


}
