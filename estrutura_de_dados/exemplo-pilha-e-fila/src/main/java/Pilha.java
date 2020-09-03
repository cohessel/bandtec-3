import java.util.Random;
import java.util.Stack;

public class Pilha {

    private Integer[] pilha;

    public Pilha(int pilha) {
        this.pilha = new Integer[10];
    }

    Integer topo = -1;

    public boolean isEmpty(){
        if (topo == -1) {
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if(topo == pilha.length -1) {
            return true;
        }else {
            return false;
        }
    }

    public void push(Integer info) {
        if (!isFull()){
            topo++;
            pilha[topo] = info;
        }
    }

    public Integer peek(){
        if(!isEmpty()){
            return pilha[topo];
        }else {
            return -1;
        }
    }

    public Integer pop(){
        if(!isEmpty()){
            return pilha[topo--];
        }else{
            return -1;
        }
    }

    public void exibe(){
        if(isEmpty()){
            System.out.println("A pilha está fazia");
        }else {
           for(int i = 0; i <= topo; i++){
               System.out.println(pilha[i]);
           }
        }
    }

}
