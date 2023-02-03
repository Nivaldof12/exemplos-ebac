package mod10;

//import java.util.Arrays;
import java.util.Scanner;

public class ControleComplexo {

    private static String[] nomes;
    private static float[] av1;
    private static float[] av2;

    private static final int TAMANHO = 100;

    private static void imprimir() {
        for (int i = 0; i < TAMANHO; i++) {
            if(nomes[i] != null) {
                imprimir(i);
            }
        }
    }

    private static void imprimir(int indice) {
        float resultadoNotaMedia = notaMedia(indice);

        System.out.println("Matricula: " + "<"+indice+">" + " - " + "Aluno: " + nomes[indice] + " - " + "Nota 1: " + av1[indice] + " - "+ "Nota 2: " + av2[indice] + " - " + "Media: " + resultadoNotaMedia + " - " + "Status: " + obterSituacao(resultadoNotaMedia));
    }

    private static float notaMedia(int indice){
        float resultadoNotaMedia = (av1[indice] + av2[indice]) / 2;

        return resultadoNotaMedia;
    }

    private static String obterSituacao(float sl) {
        if(sl < 4) {
            return "Reprovado";
        } else if(sl >= 4 && sl < 7) {
            return "Prova Final";
        } else if(sl >= 7 && sl <= 10) {
            return "Aprovado";
        } else {
            return "Nota incorreta";
        }
    }



    public static void main(String[] args) {
        nomes = new String[TAMANHO];
        av1 = new float[TAMANHO];
        av2 = new float[TAMANHO];

        Scanner in = new Scanner(System.in);

        String opcao;
        int pos = 0;

        do {
            System.out.print("| [1] Cadastrar aluno | [2] Consultar matricula | [3] Consultar todos | [4] Sair |");
            System.out.println(" ");

            System.out.println("Informe a escolha desejada: ");

            opcao = in.next();

            switch (opcao) {
                case "1":
                    if(pos < TAMANHO) {
                        System.out.print("Informe o nome do aluno: ");
                        nomes[pos] = in.next();

                        System.out.print("Informe a nota da AV1: ");
                        av1[pos] = in.nextFloat();

                        System.out.print("Informe a a nota da AV2: ");
                        av2[pos] = in.nextFloat();

                        imprimir(pos);

                        pos++;
                    } else {
                        System.out.println("Impossivel realizar um novo cadastramento! Limite = 100");
                    }
                    break;

                case "2":
                    System.out.println("Informe a matricula do aluno: ");
                    int id = in.nextInt();

                    imprimir(id);
                    break;

                case "3":
                    System.out.println("Lista dos alunos cadastrados: ");
                    imprimir();
                    break;

                case "4":
                    break;

                default:
                    break;
            }
        } while (!"4".equalsIgnoreCase(opcao));


        System.out.println("Sistema finalizado!");

        in.close();
    }
}
