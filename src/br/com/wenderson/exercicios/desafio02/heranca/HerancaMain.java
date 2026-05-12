package heranca;

import java.util.ArrayList;

public class HerancaMain {

    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();

        // Criando objetos usando o construtor
        Produto p1 = new Produto("Notebook", 3500.00, 5);
        Produto p2 = new Produto("Mouse", 80.00, 20);
        Produto p3 = new Produto("Teclado", 150.00, 10);

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        System.out.println(produtos);
    }
}