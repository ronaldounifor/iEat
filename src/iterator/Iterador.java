package iterator;

import model.Produto;

public interface Iterador {
    boolean temProximo();
    Produto proximo();
}
