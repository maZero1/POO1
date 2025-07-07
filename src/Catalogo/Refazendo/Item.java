package Catalogo.Refazendo;

public class Item {
    private String titulo;
    private double duracao;
    private String comentario;

    public Item(String titulo, double duracao, String comentario) {
        setTitulo(titulo);
        setDuracao(duracao);
        setComentario(comentario);
    }

    public String getTitulo(){
        return this.titulo;
    }
    public double getDuracao(){
        return this.duracao;
    }
    public String getComentario(){
        return this.comentario;
    }
    public void setTitulo(String titulo){
        if(titulo != null && titulo.isEmpty()){
            this.titulo = titulo;
        }
    }
    public void setDuracao(double duracao){
        if(duracao > 0){
            this.duracao = duracao;
        }
    }
    public void setComentario(String comentario){
        if(comentario != null && comentario.isEmpty()){
            this.comentario = comentario;
        }
    }
    @Override
    public String toString() {
        return  "Titulo: " + titulo +
                ", Duração: " + duracao +
                ", Comentario: " + comentario ;
    }
}
