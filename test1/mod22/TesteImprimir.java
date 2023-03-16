package mod22;

import org.junit.Assert;
import org.junit.Test;

public class TesteImprimir {

    @Test
    public void testeImprimir() {

        Pessoa pessoa = new Pessoa();

        pessoa.adicionarSexo("Feminino");

        Assert.assertEquals("Feminino",pessoa.getSexo());
    }

}
