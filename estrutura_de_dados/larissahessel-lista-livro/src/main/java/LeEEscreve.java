import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LeEEscreve {

    public static void gravaLista(ListaObj<Livro> lista) {
        FileWriter arquivo = null;
        Formatter saida = null;
        boolean ferrou = false;
        String nomeArquivo = "livro.txt";

        try {
            arquivo = new FileWriter(nomeArquivo, true);
            saida = new Formatter(arquivo);
        } catch (IOException erro) {
            System.err.println("Erro ao abrir arquivo");
            System.exit(1);
        }

        try {
            for (int i = 0; i < lista.getTamanho(); i++) {
                Livro l = lista.getElemento(i);

                saida.format("%d %s %s %.2f %d%n", l.getIdLivro(), l.getTitulo(),
                        l.getAutor(), l.getPreco(), l.getQtdPagina());
            }
        } catch (FormatterClosedException erro) {
            System.err.println("Erro ao gravar arquivo");
            ferrou = true;
        } finally {
            saida.close();
            try {
                arquivo.close();
            } catch (IOException erro) {
                System.err.println("Erro ao fechar arquivo.");
                ferrou = true;
            }
            if (ferrou) {
                System.exit(1);
            }
        }

    }

    public static void leExibeArquivo() {
        FileReader arquivo = null;
        Scanner entrada = null;
        String nomeArquivo;
        boolean ferrou = false;

        nomeArquivo = "livro.txt";

        try {
            arquivo = new FileReader(nomeArquivo);
            entrada = new Scanner(arquivo);

        } catch (FileNotFoundException erro) {
            System.err.println("Arquivo não encontrado :(");
            System.exit(1);
        }

        try {
            System.out.printf("%-8s%-10s%10s\n", "ID", "TITULO", "AUTOR", "PREÇO", "QTD PAGS");

            while (entrada.hasNext()) {
                int idLivro = entrada.nextInt();
                String titulo = entrada.next();
                String autor = entrada.next();
                double preco = entrada.nextDouble();
                int qtdPagina = entrada.nextInt();
                System.out.printf("%-8d%-10s%7.2f\n", idLivro, titulo, autor,
                        preco, qtdPagina);
            }
        } catch (NoSuchElementException erro) {
            System.err.println("Arquivo com problemas.");
            ferrou = true;
        } catch (IllegalStateException erro) {
            System.err.println("Erro na leitura do arquivo.");
            ferrou = true;
        } finally {
            entrada.close();
            try {
                arquivo.close();
            } catch (IOException erro) {
                System.err.println("Erro ao fechar arquivo.");
                ferrou = true;
            }
            if (ferrou) {
                System.exit(1);
            }
        }
    }
}


