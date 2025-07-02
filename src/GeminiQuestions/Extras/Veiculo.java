package GeminiQuestions.Extras;

public abstract class Veiculo {
    private int id;
    protected String marca;
    protected String modelo;
    private int anoFabricacao;
    private double velocidadeAtual;

    public Veiculo(int id, String marca, String modelo, int anoFabricacao, double velocidadeAtual){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.velocidadeAtual = velocidadeAtual;
    }
    public abstract void ligar();
    public abstract void desligar();
    public void acelerar(double incremento){
        if(incremento > 0){
            this.velocidadeAtual =  incremento;
            System.out.println("O " + this.modelo + " acelerou para " + this.velocidadeAtual + " km/h.");
        }
        else {
            System.out.println("O incremento deve ser um valor positivo para acelerar.");
        }
    }
    public void frear(double decremento){
        if(decremento > 0 && decremento < velocidadeAtual) {
            this.velocidadeAtual = -decremento;
            System.out.println("O " + this.modelo + " desacelerou para " + this.velocidadeAtual + " km/h.");
        }else{
            System.out.println("O decremento deve ser um valor positivo e menor que a velocidade atual que é de "+this.velocidadeAtual+"km/h");
        }
    }
    public void exibirDetalhes(){
        System.out.println("--- Detalhes do Veículo ---");
        System.out.println("ID: " + this.id);
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano de Fabricação: " + this.anoFabricacao);
        System.out.println("Velocidade Atual: " + this.velocidadeAtual + " km/h");
        System.out.println("---------------------------");
    }
    
}
