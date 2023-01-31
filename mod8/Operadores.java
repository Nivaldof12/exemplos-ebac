package mod8;

public class Operadores {
    public static void main(String[] args) {
        operacaoMatematica();
    }
    private static void operacaoMatematica() {
        double nota1 = 7.50;
        double nota2 = 6.00;
        double nota3 = 5.50;
        double nota4 = 4.00;
        double notafinal = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Nota: " + notafinal);
    }
}
