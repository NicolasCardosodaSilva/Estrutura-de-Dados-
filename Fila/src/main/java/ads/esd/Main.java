package ads.esd;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
     Servidor servidor = new Servidor(4,1000,10);
     servidor.executar(4);
    }
}
