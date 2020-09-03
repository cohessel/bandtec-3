public class Aluno {
    private int ra;
    private String nome;
    private double nota;

    public Aluno(int ra, String nome, double nota) {
        this.ra = ra;
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return String.format("RA: %d | Aluno: %s | nota: %.2f", ra, nome, nota);
    }
}
