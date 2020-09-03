import java.sql.SQLOutput;
import java.util.Scanner;

public class TesteListaAluno {

    public static void main(String[] args) {

        boolean fim = false;
        int ra;
        String nome;
        Double nota;

        Scanner leitor = new Scanner(System.in);

        ListObj<Aluno> lista = new ListObj<Aluno>(5);

        while (!fim) {
            System.out.println("Escolha uma opção digitando o seu número...");
            System.out.println("1. Adicionar um aluno");
            System.out.println("2. Exibir lista");
            System.out.println("3. Limpar lista");
            System.out.println("4. Fim");

            int opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("> Digite o primeiro nome do aluno...");
                    nome = leitor.next();

                    System.out.println("> Digite o RA do aluno...");
                    ra = leitor.nextInt();

                    System.out.println("> Digite a nota do aluno...");
                    nota = leitor.nextDouble();

                    lista.adiciona(new Aluno(ra, nome, nota));
                    System.out.println("Adicionado!\n");
                break;

                case 2:
                    System.out.println("Aqui está sua lista: \n");
                    lista.exibe();
                    break;

                case 3:
                    lista.limpa();
                    System.out.println("Lista limpa! \n");
                     break;

                case 4:
                    System.out.println("Até mais! \n");
                    fim = true;
                    break;
            }


        }

    }
}
