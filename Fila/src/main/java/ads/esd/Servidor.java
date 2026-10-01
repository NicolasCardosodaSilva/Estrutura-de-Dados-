package ads.esd;

import java.util.Random;

public class Servidor {
    private int totalReqGeradas = 0;
    private int totalReqAtendidas = 0;
    private int totalReqPerdidas = 0;
    private double relacaoAtendidas;
    private double relacaoPerdidas;
    private Random aleatorio = new Random();
    private Fila <Integer> fila;
    private int numProcessadores;
    private int nMax;
    private int novasReq;


    public Servidor( int numProcessadores, int n, int capacidade) {
        this.numProcessadores = numProcessadores;
        this.nMax = n;
        fila = new Fila<>(capacidade);
    }

    public void executar(int ciclos ){
        for (int ciclo = 0; ciclo <= ciclos; ciclo++) {

            novasReq = aleatorio.nextInt(1, nMax);
            totalReqGeradas+= novasReq;

                for (int i = 0; i < novasReq; i++) {
                    if(!fila.isFull()) {
                        fila.enfileirar(i);
                    } else {
                        totalReqPerdidas++;
                    }
                }

                for (int j = 0; j < numProcessadores; j++) {
                    if(!fila.isEmpty()) {
                        fila.desenfileirar();
                        totalReqAtendidas++;
                    }
                }
        }
        if(totalReqGeradas != 0 ){
            relacaoAtendidas = ((double) totalReqAtendidas /totalReqGeradas) * 100;
            relacaoPerdidas = ((double) totalReqPerdidas /totalReqGeradas) * 100;
        } else {
            relacaoAtendidas = 0;
            relacaoPerdidas = 0;
        }
        System.out.println("Porcentagem de requisições perdidas: " + relacaoPerdidas + "%");
        System.out.println("Porcentagem de requisições atendidas: " + relacaoAtendidas + "%");
    }



}
