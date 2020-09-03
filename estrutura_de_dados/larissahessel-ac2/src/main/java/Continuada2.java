import java.util.InputMismatchException;
import java.util.Scanner;

public class Continuada2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int maxCid = 0;

        System.out.println("Sistema de cadastro de temperaturas máximas de cidades ");
        System.out.println();
        System.out.println("Iniciando sistema...");
        System.out.println("--------------------------------------------------------");

        do {
            try {
                System.out.println("> Digite o número máximo de cidades que irá " +
                        "cadastrar no sistema (6 a 25)");
                maxCid = leitor.nextInt();

                if (maxCid < 6 || maxCid > 25) {
                    throw new Exception(" > Digite o número máximo de cidades que irá " +
                            "cadastrar no sistema ( 6 a 25)");
                }
            } catch (Exception erro) {
                System.out.println("Valor inválido. Tente novamente :(\n");
            }
        } while (maxCid < 6 || maxCid > 25);

        String[] cidade = new String[maxCid];
        int[][] temperaturas = new int[maxCid][3];

//        double[] media = new double[maxCid];


        for (int i = 0; i < maxCid; i++) {
            try {
                System.out.println("> Digite o nome da cidade para cadastrar (Uma por vez, por favor)");
                cidade[i] = leitor.next();

                System.out.println("> Qual a temperatura máxima do dia 1?");
                temperaturas[i][0] = leitor.nextInt();

                System.out.println("> Qual a temperatura máxima do dia 2?");
                temperaturas[i][1] = leitor.nextInt();

                System.out.println("> Qual a temperatura máxima do dia 3?");
                temperaturas[i][2] = leitor.nextInt();

//                media[i] = (double) (temperaturas[i][0] + temperaturas[i][1] + temperaturas[i][2]) / 3;

            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite novamente :D");
                i--; // ;-;
            }
        }

        System.out.println("--------------------------------------------------------");

        System.out.printf("%-15s %5s %5s %5s %5s\n", "CIDADES", "DIA 1", "DIA 2", "DIA 3", "MÉDIA");

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.printf("%-15s %5s %5s %5s %5s\n", cidade[i], temperaturas[i][0],
                    temperaturas[i][1],temperaturas[i][2]);
//                    media[i]);
        }
    }
}
