package FolhaPagamento;

public class FuncionarioHorista extends Funcionario{

    private int horasTrabalhadas;
    private double valorHora;

    public FuncionarioHorista(double salarioBase) {
        super(salarioBase);
    }

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
        }else{
            return false;
        }
    }
    public boolean setValorHora(double valorHora){
        if (valorHora > 0){
            this.valorHora = valorHora;
            return true;
        }else{
            return false;
        }
    }
    public double calculoSalario(){
        return getHorasTrabalhadas()* getValorHora();
    }

    @Override
    public double calcularSalario() {
        return 0;
    }

    @Override
    public void getTipo() {

    }
}
