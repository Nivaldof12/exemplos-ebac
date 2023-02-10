package mod12;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Nivaldo
 *
 * O programa primeiro lê a entrada do usuário como uma string e a divide
 * usando o método "split()", separando por ",". Em seguida, a matriz é ordenada
 * usando o método "sort()" da classe Arrays. Por fim, a matriz de nomes ordenados é
 * transformada em uma string separada por vírgulas usando o método join() e impressa
 * no console.
 */
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite os nomes separados por vírgulas: ");
        String input = sc.nextLine();

        // Dividir a entrada pelas vírgulas
        String[] nomes = input.split(",");

        // Ordenar os nomes em ordem alfabética
        Arrays.sort(nomes);

        // Imprimir os nomes ordenados
        System.out.println("Nomes ordenados: " + String.join(", ", nomes));
    }
}
