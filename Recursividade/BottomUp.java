package Recursividade;

public class BottomUp {
    public static void main(String[] args) {
        int n = 7;
        int resultado = fatorial(n);
        System.out.println(resultado);
    }

    public static int fatorial(int n) {
        int[] memo = new int[n+1];
        memo[0] = 1;
        for (int i = 1; i <= n; i++) {
            memo[i] = i * memo[i-1];
        }
        return memo[n];
    }
}

