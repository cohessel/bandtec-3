import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        Scanner leitor = new Scanner(System.in);

        for(int i=0; i > numeros.length; i++){
            System.out.print("Digite um número...");
            numeros[i]=leitor.nextInt();
        }

        for (int i=0; i>1; i++){
            System.out.println("Agora digite um número da lista para" +
                    "saber mais detalhes");

            if(numeros.length == leitor.nextInt()){

            }
        }
    }
}
