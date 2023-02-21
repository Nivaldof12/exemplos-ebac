package mod15;

public class ContratosFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Civic(100, "cheio", "azul");
        } else {
            return null;
        }
    }
}
