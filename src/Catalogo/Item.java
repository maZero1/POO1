package Catalogo;

public class Item {
    private String titulo;
    private double duracao;
    private String comentario;

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

    public boolean setDuracao(double duracao) {
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
}
