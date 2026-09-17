package ads.esd;

public class MainEditor {
    static void main() {
        EditorTexto editor = new EditorTexto();
        editor.escrever("Ola" );
        editor.escrever("Mundo ");

        System.out.println("Conteudo atual: " + editor.getConteudo());

        editor.desfazer();
        System.out.println("Conteudo apos DESFAZER: " + editor.getConteudo());

        editor.refazer();
        System.out.println("Conteudo apos REFAZER: " + editor.getConteudo());
    }
}
