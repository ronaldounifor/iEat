package iterator;

import model.Produto;

public class Salata implements Agregado {
    private Produto[] produtos;

    public Salata() {
        produtos = new Produto[3];
        produtos[0] = new Produto(3, "Caesar Salad", 1);
        produtos[1] = new Produto(4, "Mediterranean Salad", 2);
        produtos[2] = new Produto(5, "Bacon Salad", 200);

    }

    @Override
    public Iterador criarIterador() {
        return new IteradorVetor(produtos);
    }
    
}
