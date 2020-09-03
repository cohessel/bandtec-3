import java.util.Random;

public class Baralho {

    private PilhaObj<Carta> baralho;

    public Baralho() {
        baralho = new PilhaObj<Carta>(52);
        String faces[] = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        String naipes[] = {"Copas", "Paus", "Ouros", "Espadas"};

        int cont = 0;
        while (!baralho.isFull()) {
            baralho.push(new Carta(faces[cont % 13],cont % 13 + 1, naipes[cont / 13]));

            cont++;
        }
    }

    public Carta removeCarta(int ind){

        PilhaObj<Carta> aux = new PilhaObj<Carta>(ind);

        for(int i = 0; i< ind; i++){
            aux.push(baralho.pop());
        }

        Carta alvo = baralho.pop();

        while (!aux.isEmpty()){
            baralho.push(aux.pop());
        }

        return alvo;
    }

    public void embaralhar(){

        Random nroAleatorio = new Random();

        for(int i = 0; i < 52; i++){
            int indice = nroAleatorio.nextInt(52);

            if(indice != 0){
                Carta carta = removeCarta(indice);
                baralho.push(carta);
            }
        }
    }

    public Carta virarCarta(){

        return baralho.pop();

    }

    public void exibirCartas(){
        baralho.exibe();
    }

}