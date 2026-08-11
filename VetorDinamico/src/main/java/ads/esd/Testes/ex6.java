package ads.esd.Testes;

import ads.esd.VetorDinamico;

public class ex6 {
    static void main() {
        VetorDinamico vetor = new VetorDinamico(2);

        vetor.inserir("Ana");
        vetor.inserir("Ana");
        vetor.imprimir();

        //expandir
        vetor.inserir("Ana");
        vetor.imprimir();
        vetor.inserir("Ana");
        vetor.inserir("Ana");
        vetor.inserir("Ana");

        //expandir
        vetor.inserir("Ana");
        vetor.imprimir();

        vetor.remover(1);
        vetor.remover(1);
        vetor.remover(1);
        vetor.remover(1);
        vetor.remover(1);
        vetor.imprimir();
    }
}
