package ads.esd.Exemplos;

import ads.esd.Fila;
import ads.esd.Pacote;
import ads.esd.Produtor;

public class teste2 {
    static void main() {
        Fila<Pacote> fila = new Fila<Pacote>(10);

        Produtor pr1 = new Produtor("Produtor 2  ", "PC-A");
        Produtor pr2 = new Produtor("Produtor 1  ", "PC-B");

        pr1.produzirPacote(fila,1,"login", "Servidor 1", "AAAA");
        pr1.produzirPacote(fila,2,"imagem", "Servidor 2 ", "AAAA");
        pr2.produzirPacote(fila,3,"imagem", "Servidor 2 ", "AAAA");

        System.out.println("FILA DE PACOTES");
        fila.imprimir();
        fila.desenfileirar();
        fila.imprimir();

    }
}
