import java.util.Scanner;

public class ExemploVetor {
    public static void exibeVetor(int[]v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("vet[" + i + "]=" + v[i]);
        }
    }

    public static void main(String[] args) {
        int[] vet = new int[5];
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite um número");
            vet[i] = leitor.nextInt();
        }

        // Exibe os valores do vetor
        System.out.println(vet);
        // Exibe os valores do vetor usando for
        for (int i = 0; i < vet.length;i++){
            System.out.println("vet["+i+"]="+vet[i]);
        }

        int[] vet2 = {100,200,300,400};
        exibeVetor(vet2);

        System.out.println("Digite o tamanho do vetor");
        int tamanho = leitor.nextInt();
        int[] vet3 = new int[tamanho];
    }


}

