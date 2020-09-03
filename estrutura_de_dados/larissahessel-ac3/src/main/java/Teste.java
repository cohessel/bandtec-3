import java.util.Scanner;

public class Teste {


    public static void main(String[] args) {
        int[] v = new int[10];

        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < v.length; i++) {
            System.out.println("Digite 10 valores inteiros...");
            v[i] = leitor.nextInt();
        }

        FilaPilha filapilha = new FilaPilha(10);

        for (int i = 0; i < v.length; i++) {
            if (v[i] <= 18) {
                filapilha.push(v[i]);
            } else {
                filapilha.insert(v[i]);
            }
        }

        while (!filapilha.isPilhaEmpty()) {
            System.out.printf("%d\t", filapilha.pop());
        }

        while (!filapilha.isFilaEmpty()) {
            System.out.printf("%d\t", filapilha.poll());
        }

    }
}
