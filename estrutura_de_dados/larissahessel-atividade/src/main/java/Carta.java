public class Carta {

    private String face;
    private Integer valor;
    private String naipe;

    public Carta (String face, Integer valor, String naipe){
        this.face = face;
        this.valor = valor;
        this.naipe = naipe;

    }

    @Override
    public String toString() {
        return ">> Sua carta é: \n    "+face+ " de " +naipe+ ". \n" ;
    }

    public String getFace() {
        return face;
    }

    public Integer getValor() {
        return valor;
    }

    public String getNaipe() {
        return naipe;
    }
}
