public abstract class Funcionario implements Empresa{
    private int codigo;
    private double salario;


    @Override
    public String toString() {
        return "Funcionário{" +
                "codigo=" + codigo +
                ", getBonus=" + salario +
                '}';
    }

    public double getBonus() {
        return salario;
    }
}
