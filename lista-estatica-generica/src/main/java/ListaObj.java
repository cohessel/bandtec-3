public class ListaObj <T> {

    private T[] vetor;
    int nroElemento;

    //Construtor
    public ListaObj (int nroElemento) {
        this.vetor = (T[])new Object[nroElemento];
    }

    //Método
    public boolean adiciona(T valor) {
        if (nroElemento < vetor.length) {
            vetor[nroElemento] = valor;
            nroElemento++;
            return false;
        } else {
            return true;
        }
    }

    public void exibe() {
       for(int i = 0; i < nroElemento; i++){
           System.out.println(vetor[i]);
       }
    }

    public int busca(T n) {
        for (int i = 0; i < nroElemento; i++) {
            if (n == vetor[i]) {
                return i;
            }
        }
        return -1;
    }

    public boolean removePeloIndice(int index) {
        if (index >= nroElemento || index < 0) {
            return false;
        }

        for (int i = index; i < nroElemento - 1; i++) {
            vetor[i] = vetor[i + 1];
        }
        nroElemento--;
        return true;
    }

    public boolean removeElemento(T n) {
        return removePeloIndice(busca(n));
    }

    public int getTamanho(){
        return nroElemento;
    }

    public T getElemento(int indice){
        if(indice < 0 ||indice >= nroElemento ){
            return null;
        }

        return vetor[indice];
    }

    public void limpa(){
        nroElemento = 0;
    }

}
