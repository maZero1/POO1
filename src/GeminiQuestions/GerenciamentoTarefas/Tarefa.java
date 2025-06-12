package GeminiQuestions.GerenciamentoTarefas;

import java.util.Date;

public class Tarefa {
    private String id;
    private String titulo;
    private String descricao;
    private String status;
    private Usuario responsavel;
    private Date dataLimite;

    public Tarefa(String id, String titulo, String descricao
                ,Date dataLimite){
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataLimite = dataLimite;
    }
    public String getId(){
        return this.id;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getDescricao(){
        return this.descricao;
    }
    public String getStatus() {
        return status;
    }
    public Usuario getResponsavel() {
        return this.responsavel;
    }
    public Date getDataLimite() {
        return dataLimite;
    }
    public void setStatus(String status){
        if(!status.isEmpty()){
            this.status = status;
        }else{
            System.out.println("Status nulo ou inválido");
        }
    }
    public void setResponsavel(Usuario responsavel) {
        //Faltou a verificação do metodo
    }
}
