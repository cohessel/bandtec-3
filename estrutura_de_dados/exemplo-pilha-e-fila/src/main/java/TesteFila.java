import java.sql.SQLOutput;

public class TesteFila {
    public static void main(String[] args) {

        //criando fila
        Fila f = new Fila (3);

        //Inserir valores
        f.insert("Lala");
        f.insert("Fan");
        f.insert("Cidade Hessiu :3");



        //Exibe
        System.out.println(">>Toda a sua fila:");
        f.exibe();p

        System.out.println();

        //Primeiro da fila
        System.out.println(">>Primeiro da fila:");
        f.peek();
        System.out.println(f.peek());

        //removendo
        System.out.println();
        System.out.println(">>Removendo");
        System.out.println(f.poll());

        System.out.println();

        //exibindo novamente
        f.exibe();

    }
}
