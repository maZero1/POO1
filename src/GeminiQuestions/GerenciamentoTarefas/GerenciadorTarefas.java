package GeminiQuestions.GerenciamentoTarefas;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> todasTarefas;
    private List<Usuario> usuariosCadastrados;

    public GerenciadorTarefas(){
        this.todasTarefas = new ArrayList<>();
        this.usuariosCadastrados = new ArrayList<>();
    }
}
