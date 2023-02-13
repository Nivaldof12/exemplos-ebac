package mod13;

public class Teste {
    public static void main(String args[]) {
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();
        System.out.println("*** TESTE PESSOA FÍSICA ***");
        pf.setNome("Nivaldo");
        pf.setIdade(21);
        pf.setCpf(12253505513l);
        System.out.println("Nome: " + pf.getNome() + ", Idade: " + pf.getIdade()
                + ", CPF: " + pf.getCpf());

        System.out.println("");

        System.out.println("*** TESTE PESSOA JURÍDICA ***");
        pj.setNome("Pedro");
        pj.setIdade(25);
        pj.setCnpj(11111111111111l);
        System.out.println("Nome: " + pj.getNome() + ", Idade: " + pj.getIdade()
                + ", CNPJ: " + pj.getCnpj());
    }
}
