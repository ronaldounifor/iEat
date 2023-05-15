import java.util.ArrayList;
import java.util.Iterator;

import iterator.Iterador;
import iterator.Salata;
import iterator.Yaksopa;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Iterador> iteradores = new ArrayList<>(); 
        iteradores.add(new Yaksopa().criarIterador());
        iteradores.add(new Salata().criarIterador());

        for (Iterador iterador : iteradores)
            while(iterador.temProximo())
                System.out.println(iterador.proximo());


    }
}
