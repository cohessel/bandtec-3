public class Urna {
    private final int QUANT_CANDIDATOS = 10;

    private String[] nomeCandidatos = new String[QUANT_CANDIDATOS];
    private int[] votosCandidatos = new int[QUANT_CANDIDATOS];

    private int indiceAtual = 0;


    public void registrar(String nome, int votos) {
        nomeCandidatos[indiceAtual] = nome;
        votosCandidatos[indiceAtual] = votos;
        indiceAtual++;
    }

    public void exibir() {
        System.out.println("Nome\t\t\t\t Quantidade de votos");
        for(int i=0; i<indiceAtual; i++){
            String msg = String.format("%s\t\t\t\t\t\t\t\t%d", nomeCandidatos[i], votosCandidatos[i]);
            System.out.println(msg);
        }
    }

    public int buscarVotos(String nomeDoCandidato) {
        for(int i=0; i<indiceAtual; i++){
            String nome = nomeCandidatos[i];
            int votos = votosCandidatos[i];
            if(nomeDoCandidato.equalsIgnoreCase(nome))
                return votos;
        }
        return -1;
    }

    public int totalDeVotos() {
        int total = 0;
        for(int i=0; i<indiceAtual; i++){
            total += votosCandidatos[i];
        }
        return total;
    }

    public String maisVotado() {
        int indiceMaior =0;
        for(int i=0; i<indiceAtual; i++){
            if(votosCandidatos[i] > votosCandidatos[indiceMaior])
                indiceMaior = i;
        }
        return nomeCandidatos[indiceMaior];
    }
}
