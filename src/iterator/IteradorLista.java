package iterator;

import java.util.ArrayList;

import model.Produto;

public class IteradorLista implements Iterador {
    private ArrayList<Produto> produtos;
    private int atual;

    public IteradorLista(ArrayList<Produto> produtos) {
        this.produtos = produtos;
        atual = -1;
    }

    @Override
    public boolean temProximo() {
        return (atual + 1) < produtos.size();
    }

    @Override
    public Produto proximo() {
        return produtos.get(++atual);
    }
}
