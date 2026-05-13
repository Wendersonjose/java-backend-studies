package br.com.wenderson.exercicios.collections.desafiocomprascartao.model;

public class Compra implements Comparable<Compra> {
    
    private String descricao;
    private double valor;

    //construtor

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    //getters
    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    //compareTo para ordenar por valor

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.getValor()));
    }

    @Override
    public String toString() {
        return "Compra: " + descricao + ", Valor: " + valor;
    }
}
