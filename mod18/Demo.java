package mod18;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Demo {

    @ILista(tabela = {"Nivaldo", "Lucas", "João"})
    private String tabelas;


    public static void main(String[] args) throws NoSuchFieldException {
        Demo demo = new Demo();

        // Obter a anotação no campo tabelas
        Field field = demo.getClass().getDeclaredField("tabelas");
        ILista listaCampo = field.getAnnotation(ILista.class);
        if (listaCampo != null) {
            System.out.println("Valor da anotação @ILista no campo tabelas: " + Arrays.toString(listaCampo.tabela()));

            Prod prod = new Prod();
            Class prod1 = prod.getClass();
            System.out.println(prod1);
        }
    }
}
