package Catalogo;

public class Album extends Item{
    private String artista;
    private int faixas;

    public String getArtista() {
        return artista;
    }
    public boolean setArtista(String artista) {
        if (!artista.isEmpty()){
            this.artista = artista;
            return true;
        }else{
            return false;
        }
    }
    public int getFaixas() {
        return faixas;
    }
    public boolean setFaixas(int faixas) {
        if (faixas > 0){
            this.faixas = faixas;
            return true;
        }else{
            return false;
        }
    }

    @Override //Diz que eu quero reemplementar um metodo
    //o proprio java faz uma teste de certa forma, vendo se faltou
    //alguma coisa no metodo, mesmo metodo da classe item
    public String toString(){
        return "Titulo: " + this.titulo +
                "Duracao: " + this.duracao +
                "Comentario: " + this.comentario +
                "Artista: " + this.artista +
                "Faixas: " + this.faixas;
    }
}
