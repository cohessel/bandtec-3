import java.util.Scanner;

public class ReservaCinema {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int qtdFileiras = 0;
        int qtdAssentos = 0;

        do {
            try {
                System.out.printf("> Informe a quantidade de fileiras da sala... (De 7 a 10)\n");
                qtdFileiras = leitor.nextInt();

                if (qtdFileiras < 7 || qtdFileiras > 10) {
                    throw new Exception("> Informe a quantidade de fileiras da sala... (De 7 a 10)\n");
                }
            } catch (Exception erro) {
                System.out.println("Valor inválido... Tente novamente!\n");
            }
        } while (qtdFileiras < 7 || qtdFileiras > 10);

        System.out.println("---------------------------------------------------------------");

        do {
            try {
                System.out.printf("> Informe a quantidade de assento dessa fileira... (De 10 a 15)\n");
                qtdAssentos = leitor.nextInt();

                if (qtdAssentos < 10 || qtdAssentos > 15) {
                    throw new Exception("> Valor inválido... Tente novamente!\n");
                }
            } catch (Exception erro) {
                System.out.println("> Valor inválido... Tente novamente!\n");
            }
        } while (qtdAssentos < 10 || qtdAssentos > 15);


        boolean[][] salaCinema = new boolean[qtdFileiras][qtdAssentos];

        boolean fim = false;
        int opcao;


        while (!fim) {
            System.out.println("===============================================================");
            System.out.println("MENU | ESCOLHA UMA DAS OPÇÕES");
            System.out.println("---------------------------------------------------------------");
            System.out.println("1. Exibir mapa de assento");
            System.out.println("2. Exibir assentos livres de uma fileira");
            System.out.println("3. Reservar assento");
            System.out.println("4. Sair");

            opcao = leitor.nextInt();


            char[] abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

            switch (opcao) {
                /*
                Exibe o mapa de assentos, porém cada fileira deve ser nomeada com uma letra,
                iniciando da letra A, como no cinema, e cada cadeira deve ser numerada,
                a partir do número 1.
                 */
                case 1:

                    for (int i = 0; i < qtdAssentos; i++) {
                        System.out.printf("%6d", i + 1);
                    }

                    System.out.println();

                    for (int fileira = 0; fileira < qtdFileiras; fileira++) {
                        System.out.printf("%-2s", abc[fileira]);

                        for (int assento = 0; assento < qtdAssentos; assento++) {

                            if (salaCinema[fileira][assento]) {
                                System.out.printf("%5s", "ocup ");
                            } else {
                                System.out.printf("%5s", "livre ");
                            }
                        }

                        System.out.println();
                    }

                    System.out.println("\n");
                    break;

                case 2:
                    System.out.println("> Digite a letra de uma fileira...");
                    String caracterDaFileira = leitor.next();

                    int indiceDoCaracter = -1;

                    for (int i = 0; i < qtdFileiras; i++) {
                        if (abc[i] == caracterDaFileira.charAt(0)) {
                            indiceDoCaracter = i;
                        }
                    }

                    if (indiceDoCaracter == -1) {
                        System.out.println("Fila Inválida!");
                    } else {
                        System.out.print("Assentos livres: ");

                        for (int i = 0; i < qtdAssentos; i++) {
                            if (!salaCinema[indiceDoCaracter][i]) {
                                System.out.printf("%d ", i + 1);
                            }
                        }

                        System.out.println();
                    }

                    break;

                case 3:

                    System.out.println("> Digite a letra de uma fileira...");
                    String caracterDaFileira2 = leitor.next();

                    System.out.println("> Digite o número do assento...");
                    int numeroDeAssento = leitor.nextInt();

                    int indice = -1;

                    for (int i = 0; i < qtdFileiras; i++) {
                        if (abc[i] == caracterDaFileira2.charAt(0)) {
                            indice = i;
                        }
                    }

                    if (numeroDeAssento <= 0 || numeroDeAssento > qtdAssentos) {
                        System.out.println("Assento inválido!");
                        break;
                    }

                    if (indice == -1) {
                        System.out.println("Fila Inválida!");
                    } else {
                        if (salaCinema[indice][numeroDeAssento -1]) {
                            System.out.printf("Este assento já está ocupado");
                        } else {
                            salaCinema[indice][numeroDeAssento -1] = true;
                            System.out.println("Reserva efetuada com sucesso!");
                        }

                        System.out.println();
                    }

                    break;

                case 4:
                    System.out.println("Até mais. Obrigado pela preferência :D");
                    fim = true;
                    break;

                default:
                    System.out.println("Opção inválida ;-;");
                    break;
            }
        }

    }
}
