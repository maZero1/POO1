package EstudoProva.HerancaContrutores;

public class Aluno extends Pessoa{
    private int matricula;

    public Aluno(String nome, int matricula) {
        super(nome); // Chama o construtor de Pessoa(String nome)
        this.matricula = matricula;
        System.out.println("Construtor de Aluno chamado: " + nome + " (Mat: " + matricula + ")");
    }

    public int getMatricula() {
        return matricula;
    }

    public static void main(String[] args) {
        Aluno a = new Aluno("Joana", 12345);
        System.out.println("Aluno criado: " + a.getNome() + ", Matrícula: " + a.getMatricula());
        /* Saída:
         * Construtor de Pessoa chamado: Joana
         * Construtor de Aluno chamado: Joana (Mat: 12345)
         * Aluno criado: Joana, Matrícula: 12345
         */
    }
}
