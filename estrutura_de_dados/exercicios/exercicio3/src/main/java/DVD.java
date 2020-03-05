public class DVD extends Produto {
    private String nome;
    private String gravadora;

    public double getValorVenda() {
        return getPrecoCusto()*1.2;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "nome='" + nome + '\'' +
                ", gravadora='" + gravadora + '\'' +
                '}';
    }

    public DVD(String nome, String gravadora) {
        this.nome = nome;
        this.gravadora = gravadora;
    }
}
