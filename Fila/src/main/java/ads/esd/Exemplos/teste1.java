package ads.esd.Exemplos;

import ads.esd.Fila;

public class teste1 {
    static void main() {
        Fila<String> fila = new Fila<>(10);
        fila.enfileirar("A");
        fila.enfileirar("B");
        fila.enfileirar("C");
        fila.imprimir();
        fila.enfileirar("D");
        fila.enfileirar("E");
        fila.desenfileirar();
        fila.imprimir();
    }
}
