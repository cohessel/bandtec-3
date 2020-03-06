import java.util.Scanner;

public class ExemploVetor {

    public static void exibeVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("v[" + i + "]=" + v[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        int tamanho, soma =0, contaPar =0;
//        // Declara um vetor de inteiros, de tamanho 5
//        int[] vet = new int[5];
//        Scanner leitor = new Scanner(System.in);
//
//        // Solicita que o usuário digite os valores para preencher o vetor
//        // Lê os valores e armazena os valores lidos no vetor
//        for (int i = 0; i < vet.length; i++) {
//            System.out.println("Digite um número");
//            vet[i] = leitor.nextInt();
//        }
//
//        // Exibe os valores do vetor usando for
//        exibeVetor(vet);
//
//        // Declara outro vetor, mas dessa vez, já inicializa com valores
//        int[] vet2 = {100,200,300,400};
//        // Exibe os valores do vetor vet2
//        exibeVetor(vet2);
//
//
//        // Solicita que o usuário digte um valor positivo
//        // que vai ser usado como o tamanho de um 3o vetor
//        do {
//            System.out.println("Digite o tamanho do vetor");
//            tamanho = leitor.nextInt();
//        } while (tamanho <= 0);
//
//        // Cria um vetor vet3 com o tamanho digitado pelo usuário
//        String[] vet3 = new String[tamanho];
//
//        for(int i=0; i < tamanho; i++){
//            System.out.println("Digite um nome");
//            vet3[i] = leitor.next();
//        }
//
//        for (String nome : vet3){
//            System.out.println(nome);
//        }
//
//        //Exibe a soma dos valores inseridos em vet
//        for(int valor : vet){
//            soma += valor;
//        }
//        System.out.println("A soma dos valores de vet é " +soma);
//
//
//        //Exibe a quantidade de valores pares que estão inseridos em vet
//        for(int valor : vet){
//            if(valor %2 == 0){
//                contaPar++;
//            }
//        }
//
//        System.out.println("No vetor vet, existem " + contaPar + "número pares");
//
        //Criar um vetor de String com os nomes do ano
        //Solicitar que o usuário digite um número de 1 à 12
        //Ficar num loop enquanto o valor não estiver entre 1 e 12
        //Exibir o nome do mês correspondente

        String[] mesAno = {"Janeiro", "Fevereiro", "Março", "Abril", "Março" +
                "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro",
                "Novembro", "Dezembro"};

        Scanner leitor = new Scanner(System.in);

        int inputUsuario = 0;
        do {
            System.out.println("Digite um número de um à 12");
            inputUsuario = leitor.nextInt();

            if (inputUsuario > 0 && inputUsuario <= 12) {
                System.out.println(mesAno[inputUsuario - 1]);
            } else {
                System.out.println("mês inválido");
            }
        } while(inputUsuario <= 0 || inputUsuario > 12);


    }
}
