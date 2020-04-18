import sun.lwawt.macosx.CSystemTray;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;

public class TesteLivro {

    public static void main(String[] args) {

        ListaObj<Livro> lista = new ListaObj<Livro>(5);
        Scanner leitor = new Scanner(System.in);

        int idLivro;
        String titulo;
        String autor;
        double preco;
        int qtdPagina;

        boolean fim = false;

        while (!fim) {
            System.out.println("Escolha uma das opções abaixo");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Exibir a lista");
            System.out.println("3. Gravar a lista em arquivo");
            System.out.println("4. Ler e exibir o arquivo gravado na opção 3");
            System.out.println("5. Gravar apenas livros de um determinado autor em arquivo");
            System.out.println("6. Ler e exibir o arquivo gravado na opção 4");
            System.out.println("7. Sair");

            int opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(" -> Digite a ID do livro...");
                    idLivro = leitor.nextInt();

                    System.out.println(" -> Digite o título do livro");
                    titulo = leitor.next();

                    System.out.println(" -> Digite o autor do livro");
                    autor = leitor.next();

                    System.out.println(" -> Digite o preço do livro");
                    preco = leitor.nextDouble();

                    System.out.println(" -> Digite a quantidade de páginas do livro");
                    qtdPagina = leitor.nextInt();

                    lista.adiciona(new Livro(idLivro, titulo, autor, preco, qtdPagina));
                    System.out.printf("---> Livro %s adicionado! \n", titulo);

                    break;

                case 2:
                    if (lista.getTamanho() == 0) {
                        System.out.println("Você não tem nenhum livro cadastrado :( \n");
                    } else {
                        lista.exibe();
                    }

                case 3:
                    if (lista.getTamanho() == 0) {
                        System.out.println("Você não tem nenhum livro cadastrado. Nada para gravar :(\n");
                    } else {
                        LeEEscreve.gravaLista(lista);
                        lista.limpa();
                    }
                    break;

                case 4:
                    LeEEscreve.leExibeArquivo();
                    break;

                case 5:
                case 6:
                case 7:
                    fim = true;
                    System.out.println("Até mais :D");
                    break;

                default:
                    System.out.println("Opção inválida :( !");
                    break;
            }
        }
    }
}
