package br.com.wenderson.exercicios.collectionOrdenacao.examples;
import java.util.ArrayList;
import java.util.Collections;

import br.com.wenderson.exercicios.collectionOrdenacao.model.Titulo;

public class ListaTitulo {
    public static void main(String[] args) {
        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(new Titulo("D"));
        listaTitulos.add(new Titulo("C"));
        listaTitulos.add(new Titulo("A"));
        listaTitulos.add(new Titulo("B"));
        

        Collections.sort(listaTitulos);

        for (Titulo titulo : listaTitulos) {
            System.out.println(titulo.getNome());
        }
    }
}
