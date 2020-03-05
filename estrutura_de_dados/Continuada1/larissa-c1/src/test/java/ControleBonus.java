import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    public List <Empresa> funcionario = new ArrayList<Empresa>();

    public void adicionarFuncionario(Funcionario f){
        funcionario.add(f);
    }

    public double calculaTotalGastos(){
        double valorTotal = 0;
        for(Empresa funcionario : funcionario){
            valorTotal += funcionario.getBonus();
        }
        return valorTotal;
    }

    public void exibirTodos(){
        for(Empresa funcionario : funcionario){
            System.out.println(funcionario);
        }
    }
}
