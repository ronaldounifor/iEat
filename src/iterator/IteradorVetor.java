package iterator;

import model.Produto;

public class IteradorVetor implements Iterador {
    private Produto[] produtos;
    private int atual;

    public IteradorVetor(Produto[] produtos) {
        this.produtos = produtos;
        atual = -1;
    }

    @Override
    public boolean temProximo() {
        return (atual + 1) < produtos.length;
    }

    @Override
    public Produto proximo() {
        return produtos[++atual];
    }
}
