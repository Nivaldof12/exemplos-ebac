package mod9;

/**
 * @author Nivaldo
 */
public class Wrapper {
    public static void main(String[] args) {
        exemploWrapper();
        exemplo2();
    }
    private static void exemploWrapper() {
        int num1 = 10;
        Short num2 = (short) num1;
        System.out.println(num1);
        System.out.println(num2);
    }

    // Teste tipos complexos: Wrapper, variáveis primitivas e Autoboxing.
    private static void exemplo2() {
        Integer num1 = Integer.valueOf(10);
        short num2 = 5;
        Boolean num3 = num1 > num2;
        System.out.println(num3);
    }
}
