import java.lang.ref.SoftReference;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        String[] nomes = new String[10];

        Scanner leitor = new Scanner(System.in);

        for(int contador = 0; contador < nomes.length; contador++){
            System.out.println("Digite um nome...");
            nomes[contador] = leitor.next();
        }

        System.out.println("Pesquise por um nome...");
        String inputUsuario = leitor.next();
        int indiceEncontrado = -1;

        for(int contador = 0; contador < nomes.length; contador++) {
            if(inputUsuario.equals(nomes[contador])){
                indiceEncontrado = contador;
                break;
            }
        }

        if(indiceEncontrado != -1){
            System.out.println("Nome encontrado no índice "+ indiceEncontrado);
        }else{
            System.out.println("Nome não encontrado :(");
        }

    }
}
