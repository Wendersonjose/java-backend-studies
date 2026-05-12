package collections;

import java.util.ArrayList;

public class Compras {

    private String nome;

    public Compras(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        
        ArrayList<Compras> compras = new ArrayList<>();

        Compras c1 = new Compras("Arroz");
        Compras c2 = new Compras("Feijão"); 
        compras.add(c1);
        compras.add(c2);

        for (Compras compra : compras) {
            System.out.println(compra.nome);
        }
    }
    
}
