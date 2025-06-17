package ReceitaFederal;

public abstract class Pessoa {
    protected String nome;
    protected String endereco;

    public Pessoa (String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "nome: " + nome + '\'' +
                ", endereco: " + endereco;
    }
    public abstract double calcularImposto();
    }
