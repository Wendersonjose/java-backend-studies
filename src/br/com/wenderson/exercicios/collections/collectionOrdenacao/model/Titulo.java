package br.com.wenderson.exercicios.collections.collectionOrdenacao.model;

public class Titulo implements Comparable<Titulo> {
    public String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.getNome());
    }

    public String getNome() {
        return nome;
    }
}
