package DetranVeiculos;

public class Veiculo {
    protected String modelo;
    protected int ano;
    protected String placa;
    protected double valor;

    public String getModelo(){
        return this.modelo;
    }
    public int getAno(){
        return this.ano;
    }
    public String getPlaca(){
        return this.placa;
    }
    public double getValor(){
        return this.valor;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAno(int ano) {
        if(ano > 1886 && ano < 2025){
            this.ano = ano;
        }
    }
    public void setPlaca(String placa) {
        if(!placa.isEmpty()){
            this.placa = placa;
        }
    }
    public void setValor(double valor) {
        if(valor >= 0) {
            this.valor = valor;
        }
    }
    public double calcularIPVA(){
        double ipva;
        ipva = valor * 0.02;
        return ipva;
    }
    @Override
    public String toString() {
        return "Carro Modelo: " + getModelo() + ", Ano: " + getAno() + ", Placa: " + getPlaca() + ", Valor: " + getValor() +
                "Moto Modelo: " + getModelo() + ", Placa: " + getPlaca() + ", Valor: " + getValor();
    }
}
