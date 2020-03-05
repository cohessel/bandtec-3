package br.com.bandtec.projeto02;

public class Eleicao {
    private int votosCandidatos1;
    private int votosCandidatos2;
    private int votosInvalidos;
    private int totalVotos;

    public int getVotosCandidatos1() {
        return votosCandidatos1;
    }

    public int getVotosCandidatos2() {
        return votosCandidatos2;
    }

    public int getVotosInvalidos() {
        return votosInvalidos;
    }

    public int getTotalVotos() {
        return totalVotos;
    }

    @Override
    public String toString() {
        return "Eleicao{" +
                "votosCandidatos1=" + votosCandidatos1 +
                ", votosCandidatos2=" + votosCandidatos2 +
                ", votosInvalidos=" + votosInvalidos +
                ", totalVotos=" + totalVotos +
                '}';
    }
}
