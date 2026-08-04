package ads.esd.testes;

import ads.esd.VetorEstatico;

public class ex3 {
    static void main (){
        VetorEstatico vetor = new VetorEstatico(10);
        vetor.inserir("A");
        vetor.inserir("B");
        vetor.inserir("C");
        vetor.inserir("D");
        vetor.inserir("F");

        vetor.imprimir();

        //removendo
        System.out.println("Removendo na posição 2 ");
        vetor.remover(2);
        System.out.println("Arranjo após a remoção");
        vetor.imprimir();
    }
}

