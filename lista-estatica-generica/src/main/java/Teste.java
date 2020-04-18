public class Teste {
    public static void main(String[] args) {
         ListaObj<String> lista = new ListaObj<String>(5);


          lista.adiciona("0 Saudade do mozão");

        //Adicionando valores na lista
        lista.adiciona("1 Fan e Lala :3");
        lista.adiciona("2 SOU UMA STRING DO MAL");
        lista.adiciona("3 SOU UM ELEMENTO DO MAL");

        lista.exibe();
        lista.busca("0 Saudade do mozão");

        lista.removePeloIndice(1);
        lista.removeElemento("2 SOU UMA STRING DO MAL");

        lista.exibe();

        lista.getTamanho();
        lista.getElemento(2);

        lista.limpa();

        lista.exibe();
    }

}
