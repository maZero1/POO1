package FolhaPagamento;

public class FuncionarioHorista {

    private int horasTrabalhadas;
    private double valorHora;

    public int getHorasTrabalhadas(){
        return horasTrabalhadas;
    }
    public double getValorHora() {
        return valorHora;
    }
    public boolean setHorasTrabalhadas(int horasTrabalhadas){
        if (horasTrabalhadas > 0 && horasTrabalhadas < 220){
            this.horasTrabalhadas = horasTrabalhadas;
            return true;
        }
        return false;
    }
    public boolean setValorHora(double valorHora){
        if (valorHora > 0){
            this.valorHora = valorHora;
            return true;
        }
        return false;
    }
    public double calculoSalario(){
        double salario;
        salario = getHorasTrabalhadas() + getValorHora();
        return salario;
    }
}
