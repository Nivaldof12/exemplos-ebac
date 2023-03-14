package mod18;

@ILista(tabela = "Pedro")
public class Demo {

    @ILista(tabela = {"Nivaldo", "Lucas", "João"})
    private String tabelas;

    @ILista(tabela = {"Pedrão", "Leite"})
    public Demo() {

    }
    public static void main(String[] args) {
        Prod prod = new Prod();
        Class prod1 = prod.getClass();
        System.out.println(prod1);
    }
}
