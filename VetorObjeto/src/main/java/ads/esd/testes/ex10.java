package ads.esd.testes;

import ads.esd.Produto;
import ads.esd.Vetor;

public class ex10 {
    static void main() {
        Vetor<Produto> estoque = new Vetor<>(10);

        estoque.inserir(new Produto(1,1000, "Monitor"));
        estoque.inserir(new Produto(2,1500, "Cadeira"));
        estoque.inserir(new Produto(3,1200, "Mouse"));

        estoque.imprimir();
    }


}
