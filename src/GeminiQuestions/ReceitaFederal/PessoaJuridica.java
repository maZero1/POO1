package GeminiQuestions.ReceitaFederal;

public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private double faturamento;
    private int enquadramento;

    public PessoaJuridica(String nome, String endereco, String cnpj, double faturamento, int enquadramento){
        super(nome, endereco);
        this.cnpj = cnpj;
        this.faturamento = faturamento;
        this.enquadramento = enquadramento;
    }
    public double calcularImposto(){
        double imposto = 0;
        if(this.enquadramento == 1){
            imposto = faturamento * 0.02;
        }else if (this.enquadramento == 2) {
            imposto = faturamento * 0.05;
        }else if(this.enquadramento == 3){
            imposto = faturamento * 0.15;
        }
        return imposto;
    }

    @Override
    public String toString() {
        return super.toString();
        //FINALIZAR
    }
}
