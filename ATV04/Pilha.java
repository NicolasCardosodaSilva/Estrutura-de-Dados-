package atividade;

public class Pilha {
    private Casa topo;

    public Posicao desempilhar() {
        if (isVazia()) {
            return null;
        }
        Posicao valor = topo.valor;
        topo = topo.proximo;
        return valor;
    }

    public boolean isVazia() {
        return topo == null;
    }

    public void empilhar(Posicao posicao) {
        topo = new Casa(posicao, topo);
    }

}
