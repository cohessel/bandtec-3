import javax.xml.bind.SchemaOutputResolver;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int maxAluno = 0;

//        while (maxAluno < 5 || maxAluno > 15 ) {
//            try {
//                System.out.println("> Digite o quantos alunos você deseja registrar... (De 5 a 15)");
//                maxAluno = leitor.nextInt();
//            } catch (InputMismatchException e /*e = error*/) {
//                System.out.println("Valor inválido! >:D");
//                while(leitor.hasNext()) leitor.next();
//            }
//        }

        do {
            try {
                System.out.println("> Digite o quantos alunos você deseja registrar... (De 5 a 15)");
                maxAluno = leitor.nextInt();
                if (maxAluno < 5 || maxAluno > 15) {
                    throw new Exception("> Digite o quantos alunos você deseja registrar... (De 5 a 15");
                }
            } catch (Exception erro) {
                System.out.printf("Valor inválido! >:D\n");
            }
        } while (maxAluno < 5 || maxAluno > 15);


        String[] aluno = new String[maxAluno];
        double[][] notas = new double[maxAluno][2];
        double[] media = new double[2];

        for (int i = 0; i < aluno.length; i++) {
            try {
                System.out.println("> Digite o nomes do aluno...");
                aluno[i] = leitor.next();

                System.out.println(">Digite a nota da AC 1 ...");
                notas[i][0] = leitor.nextDouble();

                System.out.println(">Digite a nota da AC 2...");
                notas[i][1] = leitor.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println(">Valor inválido :(");
                i--;
                // ;--;
            }
        }

        double mediaAC1 = 0;
        double mediaAC2 = 0;

        //Pegando o total de cada nota
        for (int i = 0; i < aluno.length; i++) {
            mediaAC1 += notas[i][0];
            mediaAC2 += notas[i][1];
        }

        media[0] = mediaAC1 / aluno.length;
        media[1] = mediaAC2 / aluno.length;

        //Enfeitinho
        System.out.println("--------------------------------------------------------");

        //Título da tabela
        System.out.printf("%-30s %15s %15s\n", "NOME DO ALUNO", "NOTA AC1", "NOTA AC2");

        //Exibir os valores nome e nota AC1 e AC2 em forma de tabela
        for (int i = 0; i < aluno.length; i++) {
            System.out.printf("%-30s %15.1f %15.1f\n", aluno[i], notas[i][0], notas[i][1]);
        }

        System.out.printf("%-30s %15.1f %15.1f\n", "MÉDIA:", media[0], media[1]);
    }
}
