import java.util.Scanner;

/*
        Estamos nas eleições de 2020, como a urna eletrônica é um sistema duvidoso, neste ano, será realizado a votação
    através do nosso querido sistema de papel, mas como tudo hoje em dia precisa ser registrado on-line, foi pedido para
    que você desenvolvesse um sistema que armazene os votos de cada um dos 10 candidatos.

    Requisitos:
    - Usar um vetor do tipo int para armazenar os votos de cada candidato.
    - Usar um vetor do tipo String para armazenar o nome de cada candidato.
    - Não pode ser utilizado as listas da biblioteca padrão do Java (Ex. List, ArrayList, LinkedList, etc.)
    - Solicite que o usuário digite os dados.
    - Exibir todos os candidatos e seus respectivos votos.
    - Buscar um candidato na lista de nomes.
    - Usar o vetor para fazer o calculo do número total de votos.
    - Exibir o resultado do cálculo feito com os vetores.
    - Exibição do candidato mais votado.
 */
public class Program {

    public static void main(String[] args) {
        Urna urna = new Urna();
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo a urna eletrônica turbo 2000®.");
        System.out.println("Por favor, siga as orientações a seguir para cadastrar os votos de cada candidato:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Nome do candidato: ");
            String nome = scan.next();

            System.out.print("Número de votos do candidato: ");
            int votos = scan.nextInt();

            urna.registrar(nome, votos);
        }

        System.out.println("Os candidatos a seguir foram devidamente cadastrados:");
        urna.exibir();

        System.out.println("Busca pelo nome do candidato: ");
        String nomeDoCandidato = scan.next();
        int votosDoCandidato = urna.buscarVotos(nomeDoCandidato);
        if (votosDoCandidato == -1)
            System.out.println("Candidato não encontrado! :c");
        else
            System.out.println("Candidato " + nomeDoCandidato + " tem o total de " + votosDoCandidato + " votos.");

        System.out.println("Quantidade total de votos: " + urna.totalDeVotos());
        System.out.println("Candidato mais votado: " + urna.maisVotado());

    }
}

