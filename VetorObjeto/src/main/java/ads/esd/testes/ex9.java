package ads.esd.testes;

import ads.esd.Caixa;

public class ex9 {
    static void main() {
        Caixa<String> caixaTexto = new Caixa<>();
        caixaTexto.guardar("Figueirense");
        System.out.println(caixaTexto.abrir());

        Caixa<Integer> caixaNumero = new Caixa<>();
        caixaNumero.guardar(50);
        System.out.println(caixaNumero.abrir());
    }
}
