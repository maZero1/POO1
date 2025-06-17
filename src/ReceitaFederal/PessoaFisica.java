package ReceitaFederal;

public class PessoaFisica extends Pessoa{
    private String rg;
    private String cpf;
    private double salarioMensal;
    private int dependentes;

    public PessoaFisica (String nome, String endereco,String rg, String cpf, double salarioMensal, int dependentes){
        super(nome, endereco);
        this.rg = rg;
        this.cpf = cpf;
        this.salarioMensal = salarioMensal;
        this.dependentes = dependentes;
    }
    public double calcularImposto(){
        double imposto = 0;
        if (this.salarioMensal > 500 && this.salarioMensal < 1001){
            imposto = salarioMensal * 0.05;
        }else if(this.salarioMensal > 1000){
            imposto = salarioMensal * 0.07;
        }
        return imposto;
    }

    @Override
    public String toString() {
        return super.toString();
        //FINALIZAR
    }
}
