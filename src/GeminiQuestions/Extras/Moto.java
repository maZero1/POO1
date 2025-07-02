package GeminiQuestions.Extras;

public class Moto extends Veiculo {

    private int cilindradas;
    private boolean temPartidadeEletrica;

    public Moto(int id, String marca, String modelo, int anoFabricacao,double velocidadeAtual, int cilindradas, boolean temPartidadeEletrica){
        super(id, marca, modelo, anoFabricacao, velocidadeAtual);
        this.cilindradas = cilindradas;
        this.temPartidadeEletrica = temPartidadeEletrica;
    }
    @Override
    public void ligar() {

    }

    @Override
    public void desligar() {

    }
}
