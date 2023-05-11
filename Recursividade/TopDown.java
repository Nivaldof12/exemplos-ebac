package Recursividade;

public class TopDown {

    public static void main(String[] args) {
        int n = 7;
        int[] memo = new int[n+1];
        int resultado = fatorial(n, memo);
        System.out.println(resultado);
    }

    public static int fatorial(int n, int[] memo) {
        if (n == 0) {
            return 1;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        int resultado = n * fatorial(n-1, memo);
        memo[n] = resultado;
        return resultado;
    }
}
