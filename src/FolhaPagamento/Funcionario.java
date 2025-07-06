package FolhaPagamento;

public abstract class Funcionario{

    private double salarioBase;

    public Funcionario(double salarioBase){
        this.salarioBase = salarioBase;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public abstract double calcularSalario();
    public abstract void getTipo();
}


