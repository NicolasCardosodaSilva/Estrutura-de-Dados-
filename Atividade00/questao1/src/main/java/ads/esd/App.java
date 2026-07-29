package ads.esd;

import java.util.ArrayList;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {

    public HashMap< String, Projeto> projetos = new HashMap<>();

    public String cadastrarProjeto () {
        String nome = IO.readln("Digite o nome do projeto: ");
        String id = IO.readln("Digite o id do projeto: ");
        Gerente g = new Gerente(IO.readln("Digite o nome do gerente: "), Integer.parseInt(IO.readln("Digite o salario do gerente: ")));
        String status = IO.readln("Escreva o status do projeto: ");
        Projeto p = new Projeto(nome,g,status);
        projetos.put(id,p);
        return "Projeto cadastrado" + '\n';
    }

    public String associarFuncionarios() {
        String id = IO.readln("Digite a id do projeto que você deseja associar funcionarios: ");
        if (projetos.containsKey(id)) {
            Projeto p = projetos.get(id);
            String nomeF = IO.readln("Diga o nome do funcionario: ");
            double salarioF = Double.parseDouble(IO.readln("Digite o salario do funcionario: "));
            FuncionariosBase f = new FuncionariosBase(nomeF, salarioF);
            p.adicionarFuncionario(f);
            return "funcionario adicionado" + '\n';
        } else {
            return "Projeto não encontrado" + '\n';
        }
    }


    public String exibirDados(){

//        //TESTE
//        Projeto a = new Projeto("Projeto Almanaque", new Gerente("joao", 1000), "incompleto");
//        a.adicionarFuncionario(new FuncionariosBase("cleber", 500));
//        a.adicionarFuncionario(new FuncionariosBase("mateus", 500));
//        a.adicionarFuncionario(new FuncionariosBase("jorge", 500));
//        projetos.put("111", a);
//        Projeto b = new Projeto("Projeto x", new Gerente("joao", 1000), "incompleto");
//        a.adicionarFuncionario(new FuncionariosBase("cleber", 500));
//        a.adicionarFuncionario(new FuncionariosBase("mateus", 500));
//        a.adicionarFuncionario(new FuncionariosBase("jorge", 500));
//        projetos.put("222", b);

            final StringBuilder sb = new StringBuilder();
                String id = IO.readln("Digite o id do seu projeto:" + '\n');
                if (projetos.containsKey(id)) {
                    Projeto p = projetos.get(id);
                    sb.append(p.toString()).append('\n');
                    return sb.toString();
                } else return "Projeto não encontrado";
    }

    public void menu (int opcao){
        switch (opcao) {
            case 1 -> {
                System.out.println(cadastrarProjeto());
            }
            case 2 -> {
                System.out.println(associarFuncionarios());
            }
            case 3 -> {
                System.out.println(exibirDados());;
            }
        }
    }


    static void main() {
        App app = new App();

        int opcao = 0;
        do {
            System.out.println("-----MENU-----\n" +
                    "1 - Cadastrar Projeto" + '\n' +
                    "2 - Associar Funcionarios" + '\n' +
                    "3 - Exibir dados do projeto" + '\n' +
                    "4 - Sair"
            );
            opcao = Integer.parseInt(IO.readln("Selecione uma opcao:  \n"));
            app.menu(opcao);
        } while (opcao != 4);

    }
}