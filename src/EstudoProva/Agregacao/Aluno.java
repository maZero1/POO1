package EstudoProva.Agregacao;

public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return "Aluno: " + nome + " (Mat: " + matricula + ")";
    }
}
