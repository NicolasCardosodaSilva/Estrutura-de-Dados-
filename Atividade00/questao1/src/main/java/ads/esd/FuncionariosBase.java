package ads.esd;

public class FuncionariosBase extends Funcionario{


    public FuncionariosBase(String nome, double salario) {
        super(nome, salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionarios: " + nome + '\n' +
                "salario =" + salario;
    }
}
