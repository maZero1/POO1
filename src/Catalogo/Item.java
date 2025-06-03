package Catalogo;

public class Item {
    public String titulo;
    public int duracao;
    public String comentario;

    public Item(String titulo, int duracao, String comentario){
        this.titulo = titulo;
        this.duracao = duracao;
        this.comentario = comentario;
    }

    public String getTitulo() {
        return this.titulo;
    }
    public boolean setTitulo(String titulo) {
        if ( !titulo.isEmpty() ){
            this.titulo = titulo;
            return true;
        }else{
            return false;
        }
    }
    public double getDuracao() {
        return this.duracao;
    }
    public boolean setDuracao(int duracao) {
        if (duracao >= 0){
            this.duracao = duracao;
            return true;
        }else{
            return false;
        }
    }
    public String getComentario() {
        return this.comentario;
    }
    public boolean setComentario(String comentario) {
        if (!comentario.isEmpty()){
            this.comentario = comentario;
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        return "Titulo : " + this.titulo +
                ", Duracao: " + this.duracao +
                ", Comentario: " + this.comentario;
    }
}
