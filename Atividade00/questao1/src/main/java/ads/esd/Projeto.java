package ads.esd;

import java.util.ArrayList;
import java.util.Objects;

public class Projeto {
    private String nome;
    private Gerente gerente;
    private ArrayList<FuncionariosBase> funcionarios = new ArrayList<>();
    private String status;
    private double custoTotal;


    public Projeto(String nome, Gerente gerente, String status) {
        this.gerente = gerente;
        this.status = status;
        this.nome = nome;
    }

    public void adicionarFuncionario(FuncionariosBase f){
        funcionarios.add(f);
        calcularSalarioGerente();
        calcularBonusProjeto();
        calcularCustoTotal();
    }

    public void calcularBonusProjeto(){
            if (status.equalsIgnoreCase("finalizado")) {
                double salarioG = gerente.getSalario() + gerente.getSalario() * 0.1;
                gerente.setSalario(salarioG);
                for (FuncionariosBase f : funcionarios) {
                    double salarioF = f.getSalario() + f.getSalario() * 0.1;
                    f.setSalario(salarioF);
                };
            }
    }

    public void calcularSalarioGerente(){
        double funcionariosSupervisionados = funcionarios.size();
        double novoSalario= gerente.getSalario() + gerente.getSalario() * (funcionariosSupervisionados / 100);
        gerente.setSalario(novoSalario);
    }


    public void calcularCustoTotal(){
        double salarioG = gerente.getSalario();
        double salarioF = 0;
        for (FuncionariosBase f : funcionarios) {
            salarioF = salarioF + f.getSalario();
        }
        custoTotal = salarioF + salarioG;
    }

    public Gerente getGerente() {
        return gerente;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getCustoTotal() {
        return custoTotal;
    }

    @Override
    public String toString() {
        return "Projeto{" + '\n' +
                "nome: " + nome + '\n' +
                "gerente: " + gerente + '\n' +
                "funcionarios: " + funcionarios + '\n' +
                "custoTotal: " + custoTotal + '\n' +
                '}';
    }
}
