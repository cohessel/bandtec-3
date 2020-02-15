package br.com.bandtec.projeto01;

public class Conta {
    private double saldo;
    private int saques;
    private int depositos;

    public void depositar(double valor){
        saldo += valor;
        depositos++;
    }

    public void sacar (double valor){
        saldo -= valor;
        saques++;
    }

    public int getOperacoes(){
        return saques + depositos;
    }

    public double getSaldo(){
        return saldo;
    }

    public int getSaques(){
        return saques;
    }

    public int getDepositos(){
        return depositos;
    }


}
