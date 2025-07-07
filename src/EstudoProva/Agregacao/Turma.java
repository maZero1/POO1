package EstudoProva.Agregacao;

import java.util.ArrayList;
import java.util.List;

public class Turma {private String nomeDisciplina;
    private List<Aluno> alunos; // Agregação: Uma Turma TEM ALUNOS

    public Turma(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.alunos = new ArrayList<>(); // Inicializa a coleção de alunos
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        System.out.println(aluno.getNome() + " adicionado à turma de " + nomeDisciplina);
    }

    public void listarAlunos() {
        System.out.println("\nAlunos da turma de " + nomeDisciplina + ":");
        if (alunos == null) {
            System.out.println("Nenhum aluno nesta turma.");
        } else {
            for (Aluno aluno : alunos) {
                System.out.println("- " + aluno);
            }
        }
    }
}
