import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        Scanner leitor = new Scanner(System.in);

        for(int contador = 0; contador < numeros.length; contador++){
            System.out.println("Digite um número...");
            numeros[contador] = leitor.nextInt();
        }

//        for(int i= 0; i < numeros.length; i++){
//
//        }
//        double media = total / qtd;
    }

}
