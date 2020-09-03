import java.util.Scanner;

public class OJogo {

    public static void main(String[] args) {

        Baralho baralho = new Baralho();
        Scanner leitor = new Scanner(System.in);

        //2
        System.out.println("EXIBINDO CARTAS................................");
        baralho.exibirCartas();

        System.out.println("---------------------------------------");

        //3 e 4
        System.out.println("EXIBINDO CARTAS EMBARALHADAS................................");

        baralho.embaralhar();
        baralho.exibirCartas();

        //5
        baralho.embaralhar();

        System.out.println("---------------------------------------");

        int valorUsuario = 0;

        //6
        do {
            try {
                System.out.println("--- Quantas cartas deseja que sejam viradas? ");
                valorUsuario = leitor.nextInt();

                if (valorUsuario < 1 || valorUsuario > 11) {
                    throw new Exception("--- Quantas cartas deseja que sejam viradas? ");
                }
            } catch (Exception erro) {
                System.out.println("--- Valor inválido. Insira entre 1 e 11");
            }
        } while (valorUsuario < 1 || valorUsuario > 11);


        int palpiteUsuario = 0;

        //7
        do {
            try {
                System.out.println("--- Quantas dessas cartas você acha que serão de NAIPE VERMELHO? (Ouro e Copas)");
                palpiteUsuario = leitor.nextInt();

                if (palpiteUsuario < 1 || palpiteUsuario > valorUsuario) {
                    throw new Exception("--- Quantas dessas cartas você acha que serão de NAIPE VERMELHO? (Ouro e Copas)");
                }
            } catch (Exception erro) {
                System.out.println("--- Valor inválido, tente novamente.");
            }
        } while (palpiteUsuario < 1 || palpiteUsuario > valorUsuario);

        //8
        int qtdOuro = 0, qtdCopas = 0;

        for (int i = 0; i < valorUsuario; i++) {
            Carta carta = baralho.virarCarta();
            String naipe = carta.getNaipe();
            System.out.println(carta);

            if (naipe.equalsIgnoreCase("ouros")) {
                qtdOuro++;
            } else if (naipe.equalsIgnoreCase("copas")) {
                qtdCopas++;
            }
        }

        //9
        if (qtdCopas + qtdOuro == palpiteUsuario) {
            System.out.println("YOU WIN!");
        } else {
            System.out.println("YOU LOSE :(");
        }


    }
}
