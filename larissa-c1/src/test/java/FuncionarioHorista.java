public class FuncionarioHorista extends Funcionario {
    private int codigo;
    private String nome;
    private int qtdHora;
    private double valorHora;

    public FuncionarioHorista(int codigo, String nome, int qtdHora, double valorHora) {
        this.codigo = codigo;
        this.nome = nome;
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdHora() {
        return qtdHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    @Override
    public double getBonus() {
        double pagamentoDoHorista = qtdHora * valorHora * 0.10;
        return pagamentoDoHorista;
    }

    @Override
    public String toString() {
        return "FuncionarioHoraExtra{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", qtdHoraExtra=" + qtdHora +
                ", valorHoraExtra=" + valorHora +
                '}';
    }
}
