package ads.esd;

import java.util.ArrayList;

public class Gerente extends Funcionario{


    public Gerente(String nome, double salario) {
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
        return "Gerente: " +
                "nome: " + nome + '\n' +
                "salario: " + salario;
    }
}
