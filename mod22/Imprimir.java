package mod22;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nivaldo
 */

public class Imprimir {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("João", "Masculino"));
        pessoas.add(new Pessoa("Maria", "Feminino"));
        pessoas.add(new Pessoa("Pedro", "Masculino"));
        pessoas.add(new Pessoa("Ana", "Feminino"));
        pessoas.add(new Pessoa("Paula", "feminino"));
        pessoas.add(new Pessoa("Ludi", "Não-Binário"));

        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + " - Sexo: " + pessoa.getSexo());
        }
        System.out.println("**************");
        System.out.println("Imprimindo os nomes do sexo Feminino!");

        List<Pessoa> mulheres = pessoas.stream().filter(p -> p.getSexo().equalsIgnoreCase("Feminino")).toList();

        mulheres.stream().map(Pessoa::getNome).forEach(System.out::println);

    }
}
