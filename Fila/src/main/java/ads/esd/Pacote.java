package ads.esd;

public class Pacote implements Comparable<Pacote> {
    private int numero;
    private String origem;
    private String destino;
    private String dados;

    public Pacote(String destino, String dados, String origem, int numero) {
        this.destino = destino;
        this.dados = dados;
        this.origem = origem;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Pacote{" +
                "numero=" + numero +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", dados='" + dados + '\'' +
                '}';
    }

    @Override
    public int compareTo(Pacote o) {
        return 0;
    }
}
