package ads.esd;

import java.util.Arrays;

public class Agenda {
    private Contato[] contatos = new Contato[20];
    private int tamanho = 0;

    public Agenda(Contato[] contatos) {
        this.contatos = contatos;
    }

    public void addContato(Contato c) {
        if (tamanho < contatos.length && !contatos.equals(c)) {
            for (Contato contato : contatos) {
                if (c.getNome().equalsIgnoreCase(contato.getNome())) {
                    System.out.println("Nome ja existente");
                } else if (c.getTelefone().equalsIgnoreCase(contato.getTelefone())) {
                    System.out.println("Telefone ja existente");
                } else {
                    contatos[tamanho] = c;
                    tamanho++;
                }
            }
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

    public void removerContato(Contato c) {
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].equals(c)) {
                remover(i);
            } else {
                System.out.println("Contato inexistente");
            }
        }
    }

    public String ListarContatos() {
        final StringBuilder sb = new StringBuilder("Lista de Contatos: \n");
        for (Contato c : contatos) {
            sb.append(c.toString());
        }
        return sb.toString();
    }

    public String BuscarContato(String nome) {
        final StringBuilder sb = new StringBuilder();
        for (Contato c : contatos) {
            if (c.getNome().equals(nome)) {
                 sb.append(c.toString());
            } else {
                return "Contato inexistente";
            }
        } return sb.toString();
    }
        public String BuscarContato (String telefone){
            final StringBuilder sb = new StringBuilder();
            for (Contato c : contatos) {
                if (c.getTelefone().equals(telefone)) {
                    sb.append(c.toString());
                } else {
                    return "Contato inexistente";
                }
            } return sb.toString();

        }
    }
