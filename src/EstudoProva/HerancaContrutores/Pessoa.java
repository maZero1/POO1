package EstudoProva.HerancaContrutores;

public class Pessoa{
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Construtor de Pessoa chamado: " + nome);
    }

    public String getNome() {
        return nome;
    }
}
