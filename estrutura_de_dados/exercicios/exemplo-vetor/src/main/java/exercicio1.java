import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        int[] numero = new int[6];
        Scanner leitor = new Scanner(System.in);

        for(int contador =0; contador <numero.length; contador++){
            System.out.println("Digite um número");
            numero[contador] = leitor.nextInt();
        }

        for(int contador2 = 0; contador2 < numero.length; contador2++)
            System.out.println(numero[contador2]);

        for(int contador3 = numero.length - 1; contador3>=0; contador3--){
            System.out.println(numero[contador3]);
        }
    }
}
