import java.util.Scanner;

public class exercicio_vetor {

    public static void main(String[] args) {
        String[] t1 = new String[10];
        String[] t2 = new String[10];

        Scanner input = new Scanner(System.in);

        String turma;
        String aluno;

        Integer contT1 = 0;
        Integer contT2 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome do aluno...");
            aluno = input.next();

            System.out.println("Digite a turma...");
            turma = input.next();

            if (turma.equalsIgnoreCase("t1")) {
                t1[contT1] = aluno;
                contT1++;
            } else if (turma.equalsIgnoreCase("t2")) {
                t2[contT2] = aluno;
                contT2++;
            }
        }

        System.out.println("A turma um tem " + contT1 + " alunos:");
//        for(int i=0;i<t1.length;i++){
//            String nome = t1[i];
//        }
        for (String nome : t1) {
            if (nome != null) {
                System.out.println(" - " + nome);
            }
        }

        System.out.println("A turma um tem " + contT2 + " alunos:");
        for (String nome : t2) {
            if (nome != null) {
                System.out.println(" - " + nome);
            }
        }


    }
}
