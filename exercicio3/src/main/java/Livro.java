public class Livro extends Produto {
    private String nome;
    private String autor;
    private String isbn;

    public double getValorVenda(){
        return 0;
    }

    @Override
    public String toString() {
        return "Livro -> " +
                "nome:'" + nome + '\'' +
                ", autor:'" + autor + '\'' +
                ", isbn:'" + isbn + '\''
                ;
    }

    public Livro(String nome, String autor, String isbn) {
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
    }
}
