package br.com.bandtec.projeto01;

public class Produto {
    public String nome;
    public int item;
    public double valor;
    public int quantidade;

    public Produto(int item, double valor) {
        this.item = item;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
