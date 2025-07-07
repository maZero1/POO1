package FeitasEmSala.BancoAgencia;

public class Agencia {
    private int numero;
    private String cidade;
    private int anoDeAbertura;

    public Agencia(int numero, String cidade, int anoDeAbertura){
        this.numero = numero;
        this.cidade = cidade;
        this.anoDeAbertura = anoDeAbertura;
    }
    public int getNumero(){
        return this.numero;
    }
    public String getCidade(){
        return this.cidade;
    }
    public int getAnoDeAbertura(){
        return this.anoDeAbertura;
    }
    public String toString(){
        return "Numero: " + this.numero + ", Cidade: " + this.cidade +
                ", Ano de Abertura: " + this. anoDeAbertura;
    }
}
