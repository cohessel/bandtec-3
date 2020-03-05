public abstract class Produto implements Vendavel{
    private int codigo;
    private double precoCusto;

    public double getPrecoCusto() {
        return precoCusto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", precoCusto=" + precoCusto +
                '}';
    }
}
