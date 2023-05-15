package Algoritmos_Avançados;

// Entrada: Quantia 18, Moedas disponíveis 5, 2 e 1
// Saída: 5 (três moedas de cinco, uma de 2 e uma de 1)
public class AlgoritmoGuloso {
    public static void main(String[] args) {
        int quantia = 18;
        int[] moedasDisponiveis = {5, 2, 1};

        int numMoedas = darTroco(quantia, moedasDisponiveis);

        System.out.println(numMoedas);
    }

    public static int darTroco(int quantia, int[] moedasDisponiveis) {
        int numMoedas = 0;

        for (int moeda : moedasDisponiveis) {
            while (quantia >= moeda) {
                quantia -= moeda;
                numMoedas++;
            }
        }

        return numMoedas;
    }
}
