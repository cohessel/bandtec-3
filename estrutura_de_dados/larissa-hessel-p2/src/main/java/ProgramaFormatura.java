/*
A professora Vera esta organizando a formatura de uma turma de 4o semestre.
A formatura foi dividida pelos alunos por conta do espaço fisico que temos.
Ocorreu alguns emprevistos devido a pandemia do COVID-19 e atrasou todo
o planejamento. Então ela precisa de uma solução mais rápida para finalizar
o que falta.

Para isso, a Vera sabe que você é aluno da Célia, assim aprendeu
muito e pode ajuda-la. Então ela pediu para você criar um programa
que:

- Armazenar uma lista dos alunos formandos;
- Pesquisar na lista algum nome de aluno;
- Saber quantos convidados cada aluno vai trazer e exibir;
- Exibir o total de convidados do evento;
- Exibir os alunos que mostra do menor para o maior a quantidade de
  convidado que cada um vai trazer;
*/

import java.util.Scanner;

public class ProgramaFormatura {
    public static void main(String[] args) {
        String[] nomesAlunos = new String[10];
        int[] qtdConvidados = new int[10];

        Scanner leitor = new Scanner(System.in);

        //Registra os alunos e seus convidados
        for (int contador = 0; contador < nomesAlunos.length; contador++) {
            System.out.println("Digite o nome de um aluno...");
            nomesAlunos[contador] = leitor.next();

            System.out.println("Digite o número de convidados do aluno");
            qtdConvidados[contador] = leitor.nextInt();
        }

        //Exibe os alunos e seus convidados
        for (int contador = 0; contador < nomesAlunos.length; contador++) {
            System.out.println(nomesAlunos[contador]);
            System.out.println(qtdConvidados[contador]);
        }

        //Pesquisa por um aluno
        System.out.println("Pesquise por um aluno...");
        String inputVera = leitor.next();
        int indiceEncontrado = -1;

        //Algoritmo faz a pesquisa
        for (int contador = 0; contador < nomesAlunos.length; contador++) {
            if (inputVera.equals(nomesAlunos[contador])) {
                indiceEncontrado = contador;
                break;
            }
        }

        //Exibe a pesquisa
        if (indiceEncontrado != -1) {
            System.out.println("O aluno " + nomesAlunos[indiceEncontrado] +
                    " irá trazer " + qtdConvidados[indiceEncontrado] +
                    " convidado(s)");
        }

        //Soma todos os convidados do evento
        int totalDeConvidados = 0;
        for(int contador = 0; contador < nomesAlunos.length; contador++){
            totalDeConvidados += qtdConvidados[contador];

        }

        //Exibe todos os convidados
        System.out.println("Verinha, aqui está todos os convidados" +
                " que vai comparecer \n no evento de formatura " +
                " para prestigiar seus lindos alunos. \n" +
                "Total de convidados: "+totalDeConvidados);

        //Trás o aluno que trará mais convidados
        int alunoComMaiorNumeroDeConvidados = 0;
        for (int contador = 0; contador < nomesAlunos.length; contador++){
            if(qtdConvidados[contador] >
                    qtdConvidados[alunoComMaiorNumeroDeConvidados]){
                alunoComMaiorNumeroDeConvidados = contador;
            }
        }

        //Printa o aluno com o maior número de convidado
        System.out.println("O aluno com" +
                "o maior número de " +
                "convidados é: " +nomesAlunos[alunoComMaiorNumeroDeConvidados]+
                " ,trazendo " +qtdConvidados[alunoComMaiorNumeroDeConvidados]+
                " convidados.");
    }



}
