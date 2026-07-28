package ads.esd;

import java.util.ArrayList;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {

    private HashMap< String, Projeto> projetos = new HashMap<>();

    public void cadastrarProjeto (String id, Projeto p) {
        projetos.put(id, p);
    }

    public void associarFuncionarios(FuncionariosBase f){
        projetos.forEach((k , p) -> {

        });
    }

    public String exibirDados(){

    }







    static void main() {
        App app = new App();
    }
}