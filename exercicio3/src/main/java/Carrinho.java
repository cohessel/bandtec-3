import java.util.ArrayList;
import java.util.List;

public class Carrinho  {
    public List <Vendavel> produtos = new ArrayList<Vendavel>();

    public void adicionaVendavel(Vendavel v){
        produtos.add(v);
        //Variável | Método | Paramêtro
    }

    public double calculaTotalVenda(){
        double valorTotal = 0;
        for(Vendavel produto : produtos){
            valorTotal += produto.getValorVenda();
        }
        return valorTotal;
    }

    public void exibirTodos(){
        for(Vendavel produto : produtos){
            System.out.println(produto);
        }
    }
}
