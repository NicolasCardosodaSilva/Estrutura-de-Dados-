package ads.esd;


public class Agenda {
    private Contato[] contatos = new Contato[20];
    private int tamanho = 0;

    public Agenda() {

    }

    public void addContato(Contato c) {
        if (tamanho >= contatos.length) {
            System.out.println("Agenda cheia");
            return;
        }
        for (int i = 0; i < tamanho; i++) {
            if (c.getNome().equalsIgnoreCase(contatos[i].getNome())) {
                System.out.println("Nome ja existente");
                return;
            }
            if (c.getTelefone().equalsIgnoreCase(contatos[i].getTelefone())) {
                System.out.println("Telefone ja existente");
                return;
            }
        }
        contatos[tamanho] = c;
        tamanho++;
    }


    public void addVariosContatos(int nContatos){
        Contato[] listaContatos = new Contato[nContatos - 1];
        for (int i = 0; i <= listaContatos.length; i++) {
            System.out.println("Contato" + (i + 1) + ": ");
            Contato c = new Contato(IO.readln("Nome: "),IO.readln("Telefone: "),IO.readln("Email(se não quiser, deixe em branco): "));
            addContato(c);
        }
    }

    public void remover(int indice) {
        if (indice < 0 || indice >= tamanho) {
            System.out.println("indice invalido");
            return;
        }
        for (int i = indice; i < tamanho; i++) {
            contatos[i] = contatos[i + 1];
        }
        contatos[tamanho - 1] = null;
        tamanho--;
    }

    public void removerContato(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                remover(i);
                return;
            }
        }
        System.out.println("Contato inexistente");
    }

    public String listarContatos() {
        final StringBuilder sb = new StringBuilder("Lista de Contatos: \n");
        for (int i = 0; i < tamanho; i++) {
            sb.append(contatos[i].toString()).append("\n");
        }
        return sb.toString();
    }

    public String buscarContatoPorNome(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                return contatos[i].toString();
            }
        }
        return "Contato inexistente";
    }
    public String buscarContato (String nomeTelefone){
            for (int i = 0; i < tamanho; i++) {
                if (contatos[i].getTelefone().equalsIgnoreCase(nomeTelefone)) {
                    return contatos[i].toString();
                }
            } return buscarContatoPorNome(nomeTelefone);
    }


    public void atualizarContato(Contato c) {
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].getNome().equalsIgnoreCase(c.getNome())) {
                contatos[i].setNome(IO.readln("Escreva o novo nome: "));
                contatos[i].setTelefone(IO.readln("Escreva o novo telefone: "));
                if (contatos[i].getEmail() != null) {
                    contatos[i].setEmail(IO.readln("Escreva o novo email(opcional): "));
                }
                return;
            }
        }
        System.out.println("Contato inexistente");
    }
        public String buscarPorPrefixo(String nome){
            final StringBuilder sb = new StringBuilder();
            for (int i = 0; i < tamanho; i++) {
                    if(contatos[i].getNome().startsWith(nome)){
                        sb.append(contatos[i].toString() + '\n');
                    }
            }
            return sb.length() == 0 ? "Não há nenhum contato com esse nome" : sb.toString();
        }



}
