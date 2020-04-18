import java.util.Scanner;

public class Exercicio1 {

    public static void exibeMatriz(int[][] m) {

        // Loop para exibir os valores da matriz
        for (int linha= 0; linha < m.length; linha++ ) {
            for (int coluna=0; coluna < m[linha].length; coluna++){
                System.out.print(m[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int[][] matriz = new int[2][3];

        for (int coluna= 0; coluna < matriz.length; coluna++ ) {
            for (int linha=0; linha < matriz[0].length; linha++){
                System.out.println("Digite o valor de matriz[" + coluna +
                        "][" + linha + "]");
                matriz[coluna][linha] = leitor.nextInt();
            }
        }


//        System.out.println(exibeMatriz);
    }


}
