package Catalogo.Refazendo;

public class Album extends Item{
    private String artista;
    private int faixas;

    public Album(String titulo, double duracao, String comentario, String artista, int faixas){
        super(titulo, duracao, comentario);
        this.artista = artista;
        this.faixas = faixas;
    }
    public String getArtista(){
        return this.artista;
    }
    public void setArtista(String artista){
        if(artista != null && artista.isEmpty()){
            this.artista = artista;
        }else{
            System.out.println("Tentativa de inserir artista vazio");
        }
    }
    public int getFaixas(){
        return this.faixas;
    }
    public void setFaixas(int faixas){
        if(faixas > 0){
            this.faixas = faixas;
        }else{
            System.out.println("Tentativa de inserir faixas negativas");
        }
    }
    @Override
    public String toString() {
        return super.toString() + ", Artista: " + artista + ", Faixas: " + faixas;
    }
}
