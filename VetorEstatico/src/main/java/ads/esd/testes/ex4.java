package ads.esd.testes;

import ads.esd.VetorEstatico;

public class ex4 {
    static void main (){
        VetorEstatico vetor = new VetorEstatico(10);
        vetor.inserir("A");
        vetor.inserir("B");
        vetor.inserir("C");
        vetor.inserir("D");
        vetor.inserir("F");


        //removendo
        System.out.println("Removendo o elemento C");
        vetor.imprimir();
        vetor.remover("C");
        vetor.imprimir();

    }
}

