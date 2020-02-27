public class FuncionarioHoraExtra extends Funcionario {
    private int codigo;
    private String nome;
    private double salario;
    private int qtdHoraExtra;
    private double valorHoraExtra;

    public FuncionarioHoraExtra(int codigo, String nome, double salario, int qtdHoraExtra, double valorHoraExtra) {
        this.codigo = codigo;
        this.nome = nome;
        this.salario = salario;
        this.qtdHoraExtra = qtdHoraExtra;
        this.valorHoraExtra = valorHoraExtra;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getQtdHoraExtra() {
        return qtdHoraExtra;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    @Override
    public String toString() {
        return "FuncionarioHoraExtra{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                ", qtdHoraExtra=" + qtdHoraExtra +
                ", valorHoraExtra=" + valorHoraExtra +
                '}';
    }

    @Override
    public double getBonus() {
        salario = salario + (qtdHoraExtra * valorHoraExtra) * 0.15;
        return salario;
    }
}
