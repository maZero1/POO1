package TimesFutebolComTreinador;

public class Treinador {
    private String cpf;
    private String nome;
    private double salarioMensal;

    public Treinador(String cpf, String nome, double salarioMensal){
        this.cpf = cpf;
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }
    public String getTreinadorNome(){
        return this.nome;
    }
    public boolean setSalarioMensal(double salarioMensal){
        if (salarioMensal > 1.518){
            this.salarioMensal = salarioMensal;
            return true;
        }else {
            return false;
        }
    }
        public String toString(){
        String.format("%.2f", this.salarioMensal);
        return "CPF: " + this.cpf + ", Nome: " + this.nome + ", Salario Mensal: " + this.salarioMensal;
    }
}
