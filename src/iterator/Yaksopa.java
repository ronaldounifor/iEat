package iterator;

import java.util.ArrayList;

import model.Produto;

public class Yaksopa implements Agregado {
    private ArrayList<Produto> produtos;

    public Yaksopa() {
        produtos = new ArrayList<>();
        produtos.add(new Produto(0, "Coca-cola", 20));
        produtos.add(new Produto(1, "Yakisoba", 80));
        produtos.add(new Produto(2, "Brigadeiro 1kg", 120));
    }

    @Override
    public Iterador criarIterador() {
        return new IteradorLista(produtos);
    }
    
}
