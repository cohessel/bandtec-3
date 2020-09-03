public class FilaPilha {

    private int[] vetorInteiros;
    private int topoFila1;
    private int topoPilha2;

    public FilaPilha(int capacidade) {
        topoFila1 = -1;
        vetorInteiros = new int[capacidade];
    }

    public boolean isFilaEmpty() {
        return topoFila1 == -1;
    }

    public boolean isPilhaEmpty() {
        return topoPilha2 == -1;
    }

    public boolean isFull() {
        return topoPilha2 - topoFila1 == - 1;
    }

    public void push(int numeroTop) {
        if (isFull()) {
            System.out.println("Pilha cheia!");
        } else {
            vetorInteiros[++topoPilha2] = numeroTop;
        }
    }

    public int pop() {
        if (!isPilhaEmpty()) {
            return vetorInteiros[topoPilha2--];
        } else {
            return -1;
        }
    }

    public void insert(int numeroTop) {
        if (!isFull()) {
            vetorInteiros[++topoFila1] = numeroTop;
        }
    }

    public int poll() {
        int primeiroIndice = vetorInteiros[0];

        if (!isFilaEmpty()) {

            for (int i = 0; i < vetorInteiros.length - 1; i++) {
                vetorInteiros[i] = vetorInteiros[i + 1];
            }
            topoFila1--;
        }

        return primeiroIndice;
    }

    public void exibePilha() {
        if (isPilhaEmpty()) {
            System.out.println("Sua pilha está vazia");
        } else {
            for(int i = 0; i <= topoPilha2; i++){
                System.out.println(vetorInteiros[i]);
            }
        }
    }

    public void exibeFila(){
        if (isFilaEmpty()) {
            System.out.println("Sua fila está vazia");
        } else {
            for(int i = 0; i <= topoFila1; i++){
                System.out.println(vetorInteiros[i]);
            }
        }
    }

    //push e pop - pilha
    //insert e pool - fila ok!

}
