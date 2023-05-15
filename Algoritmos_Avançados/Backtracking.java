package Algoritmos_Avançados;

import java.util.ArrayList;
import java.util.List;
public class Backtracking {
    public static void main(String[] args) {
        int[] S = {1, 2, 3};
        int n = 2;
        List<List<Integer>> subconjuntos = calcularSubconjuntos(S, n);
        System.out.println(subconjuntos);
    }

    public static List<List<Integer>> calcularSubconjuntos(int[] S, int n) {
        List<List<Integer>> subconjuntos = new ArrayList<>();
        calcularSubconjuntosRecursivo(S, n, 0, new ArrayList<>(), subconjuntos);
        return subconjuntos;
    }

    private static void calcularSubconjuntosRecursivo(int[] S, int n, int indice, List<Integer> parcial, List<List<Integer>> subconjuntos) {
        if (parcial.size() == n) {
            subconjuntos.add(new ArrayList<>(parcial));
            return;
        }
        for (int i = indice; i < S.length; i++) {
            parcial.add(S[i]);
            calcularSubconjuntosRecursivo(S, n, i + 1, parcial, subconjuntos);
            parcial.remove(parcial.size() - 1);
        }
    }
}
