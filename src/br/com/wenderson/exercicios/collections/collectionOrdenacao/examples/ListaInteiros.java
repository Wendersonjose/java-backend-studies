package br.com.wenderson.exercicios.collections.collectionOrdenacao.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ListaInteiros {

    public static void main(String[] args) {
        

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(3);
        numeros.add(8);
        numeros.add(1);
        System.out.println("Números antes da ordenação:");

        Collections.sort(numeros);

        System.out.println("Números após a ordenação:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
    
}
