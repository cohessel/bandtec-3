import java.util.Scanner;

public class TestaCarrinho {

    public static void main(String[] args) {
        boolean rodando = true;
        Scanner scan = new Scanner(System.in);

        Carrinho carrinho = new Carrinho();


        while (rodando == true){
            System.out.println("" +
                    "1. Adicionar livro\n" +
                    "2. Adicionar DVD\n" +
                    "3. Adicionar serviço\n" +
                    "4. Exibir itens do carrinho\n" +
                    "5. Exibir total de vendas\n" +
                    "6. Fim\n");

            System.out.print("Digite sua opção: ");
            int opcao = scan.nextInt();
            switch (opcao){
                case 1:
                    carrinho.adicionaVendavel(
                            new Livro(
                                    "A vida da Lala",
                                    "Lala",
                                    "56789"
                            )
                    );
                    System.out.println("Adicionado");
                    break;

                case 2:
                    carrinho.adicionaVendavel(
                            new DVD(
                            "show foda",
                            "gravadora foda"));
                    break;

                case 3:
                    carrinho.adicionaVendavel(
                            new Servico(
                                    "SERVIÇO FODA",
                                    526723,
                                    134,
                                    100.0));
                    break;

                case 4:
                    carrinho.exibirTodos();
                    scan.next();
                    break;
                case 5:
                    System.out.println(carrinho.calculaTotalVenda());
                    break;
                case 6:
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

    }
}
