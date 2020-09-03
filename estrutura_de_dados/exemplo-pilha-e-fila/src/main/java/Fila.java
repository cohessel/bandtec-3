public class Fila {

    public int tamanho;

    String[] fila;

    public Fila(int capacidade) {
        this.tamanho = 0;
        this.fila = new String[capacidade];
    }

    public boolean isEmpty() {
        if (tamanho == 0) {
            return true;
        } else return false;
    }

    public boolean isFull() {
        if (tamanho == fila.length) {
            return true;
        } else return false;
    }

    public void insert(String info) {
        if (!isFull()) {
            fila[tamanho] = info;
            tamanho++;
        }
    }

    public String peek() {

        return fila[0];

    }

    public String poll() {
        if (!isEmpty()) {
            String primeiroIndice = peek();

            for (int i = 0; i < tamanho -1; i++) {
                fila[i] = fila[i + 1];
            }
            tamanho--;
            return primeiroIndice;
        }
        return "";
    }

    public void exibe(){
        if(isEmpty()){
            System.out.println("Fila Vazia");
        } else {
            for (int i = 0; i < tamanho; i++){
                System.out.println(fila[i]);
            }
        }

    }


}
