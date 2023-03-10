package mod17;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        Chevrolet chevolet = new Chevrolet();
        Volkswagen volkswagen = new Volkswagen();

        List<Icarros> lista = new ArrayList<>();

        lista.add(chevolet);
        lista.add(volkswagen);

        for(Icarros icarros : lista) {
            icarros.modelo();
        }

    }

}
