public class Servico implements Vendavel{
    private String descricao;
    private int codigo;
    private int qntHora;
    private double valorHora;

    public Servico(String descricao, int codigo, int qntHora, double valorHora) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.qntHora = qntHora;
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "descricao='" + descricao + '\'' +
                ", codigo=" + codigo +
                ", qntHora=" + qntHora +
                ", valorHora=" + valorHora +
                '}';
    }

    public double getValorVenda() {
        return qntHora * valorHora;
    }
}
