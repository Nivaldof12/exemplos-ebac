package mod7;

/**
 * @author Nivaldo
 */
public class Objeto1 {

        //Variáveis
        private int codigo;
        private double preco;
        private String marca;
        private int quantidade;
        private String imprimirMetodo;

        // Getters e Setters
        public int getCodigo() {
            return codigo;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        public String getImprimirMetodo() {
            return imprimirMetodo;
        }

        public void setImprimirMetodo(String imprimirMetodo) {
            this.imprimirMetodo = imprimirMetodo;
        }

        //Método

        public void imprimirMetodo () {
            System.out.println("Código do produto: " + this.codigo);
            System.out.println("Preço do produto: " + this.preco);
            System.out.println("Marca do produto: " + this.marca);
            System.out.println("Quantidade do produto: " + this.quantidade);
        }
}
