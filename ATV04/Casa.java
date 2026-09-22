package atividade;

public class Casa {
    Posicao valor;
    Casa proximo;

    Casa(Posicao valor, Casa proximo) {
        this.valor = valor;
        this.proximo = proximo;
    }
}
