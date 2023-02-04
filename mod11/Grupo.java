package mod11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grupo {
public static void main(String[] args){
    metodo();
}
    private static void metodo() {
    System.out.println("****** Consultar Cadastrados ******");
    List<Pessoa> lista = new ArrayList<Pessoa>();
    Pessoa a = new Pessoa("Nivaldo","Masculino");
    Pessoa b = new Pessoa("Raquel","Feminino");
    Pessoa c = new Pessoa("Pedro","Masculino");
    Pessoa d = new Pessoa("Bruna","Feminino");
    Pessoa e = new Pessoa("Marina","Feminino");
    Pessoa f = new Pessoa("Eduarda","Feminino");
    Pessoa g = new Pessoa("Lucas","Masculino");
    lista.add(a);
    lista.add(b);
    lista.add(c);
    lista.add(d);
    lista.add(e);
    lista.add(f);
    lista.add(g);
    System.out.println("[1] Consultar todas as pessoas");
    System.out.println("[2] Consultar pessoas do sexo feminino");
    System.out.println("[3] Consultar pessoas do sexo masculino");
    System.out.println("[4] Sair");
    System.out.println("Informe a escolha desejada: ");
    Scanner s = new Scanner(System.in);
    int controleFluxo = s.nextInt();
    switch (controleFluxo) {
        case 1:
                System.out.println(lista);
            break;

        case 2:

            break;

        case 3:

            break;

        case 4:
                System.out.println("Obrigado!");
            break;


        default:
                System.out.println("Digite um número entre 1 e 4.");
            break;
        }
    }
}
