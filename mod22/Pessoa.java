package mod22;

/**
 * @author Nivaldo
 */

public class Pessoa {
    private String nome;
    private String sexo;

    public Pessoa() {
    }

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = this.sexo;
    }

    public void adicionarSexo(String sexo) {
        setSexo(sexo);
    }
}