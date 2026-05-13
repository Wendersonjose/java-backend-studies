package br.com.wenderson.exercicios.collections.collectionOrdenacao.app;

import java.util.ArrayList;
import java.util.List;

import br.com.wenderson.exercicios.collections.collectionOrdenacao.model.Titulo;

public class CollectionsOrdenacaoMain {
    
    public static void main(String[] args) {
        
        List<Titulo> nomes = new ArrayList<>();
        nomes.add(new Titulo("Maria"));
        nomes.add(new Titulo("João"));
        nomes.add(new Titulo("Ana"));
        System.out.println("Nomes antes da ordenação:");

        for (Titulo nome : nomes) {
            System.out.println(nome.getNome());
        }

        nomes.sort(Titulo::compareTo);
        System.out.println("Nomes após a ordenação:");
        for (Titulo nome : nomes) {
            System.out.println(nome.getNome());
        }
    }
}
