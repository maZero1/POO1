package Catalogo.Refazendo;

public class Item {
    private String titulo;
    private double duracao;
    private String comentario;

    public Item(String titulo, double duracao, String comentario) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.comentario = comentario;
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
        }else{
            System.out.println("Tentativa de inserir titulo vazio");
        }
    }
    public void setDuracao(double duracao){
        if(duracao > 0){
            this.duracao = duracao;
        }else{
            System.out.println("Tentativa de inserir duração negativa");
        }
    }
    public void setComentario(String comentario){
        if(comentario != null && comentario.isEmpty()){
            this.comentario = comentario;
        }else{
            System.out.println("Tentativa de inserir comentario vazio");
        }
    }

    @Override
    public String toString() {
        return  "Titulo: " + titulo +
                ", Duração: " + duracao +
                ", Comentario: " + comentario ;
    }
}
