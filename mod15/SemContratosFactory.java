package mod15;

public class SemContratosFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Opala(100, "cheio", "azul");
        } else {
            return null;
        }
    }
}
