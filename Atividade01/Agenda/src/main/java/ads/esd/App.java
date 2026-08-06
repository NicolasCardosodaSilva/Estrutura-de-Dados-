package ads.esd;

public class App {
    Agenda agenda = new Agenda();
    public void menu (int opcao){
        switch (opcao) {
            case 1 -> {
                Contato c = new Contato(IO.readln("Nome: "), IO.readln("Telefone: "), IO.readln("Email(se não quiser, deixe em branco): "));
                agenda.addContato(c);
            }
            case 2 -> {
                agenda.addVariosContatos(Integer.parseInt(IO.readln("Quantos contatos você quer adicionar? ")));
            }
            case 3 -> {
                System.out.println(agenda.listarContatos());;
            }
            case 4 -> {
                agenda.removerContato(IO.readln("Nome do contato a ser removido: "));
            }
            case 5 -> {
                System.out.println(agenda.buscarContato(IO.readln("Escreva o nome ou telefone do contato:")));
            }
            case 6 -> {
                Contato c = new Contato(IO.readln("Nome do contato a ser atualizado : "), IO.readln("telefone do contato a ser atualizado: "));
                agenda.atualizarContato(c);
            }

            case 7 -> {
                System.out.println(agenda.buscarPorPrefixo(IO.readln("Primeiro nome dos contatos que você quer buscar: ")));;
            }

        }
    }


    static void main() {
        App app = new App();

        int opcao = 0;
        do {
            System.out.println("-----MENU-----\n" +
                    "1 - Adicionar um contato" + '\n' +
                    "2 - Adicionar vários contatos" + '\n' +
                    "3 - Listar Contatos" + '\n' +
                    "4 - Remover Contato\n" +
                    "5 - Buscar Contato\n" +
                    "6 - Atualizar Contato\n" +
                    "7 - Buscar por prefixo\n" +
                    "8 - Sair"
            );
            opcao = Integer.parseInt(IO.readln("Selecione uma opcao:  \n"));
            if (opcao > 7 && opcao != 8) {
                System.out.println("Opção inválida");
            } else {app.menu(opcao);}
        } while (opcao != 8);

    }
}
