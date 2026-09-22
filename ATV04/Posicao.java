package atividade;

public class Posicao {
    Posicao anterior;
    int coluna;
    int linha;

    public Posicao(Posicao anterior, int coluna, int linha) {
        this.anterior = anterior;
        this.coluna = coluna;
        this.linha = linha;
    }
}
