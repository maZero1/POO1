package FeitasEmSala.PortalAnuncios;

import java.util.ArrayList;

public class Portal {
    private String nome;
    private String url;
    private ArrayList<Anuncio> anuncios;

    public Portal(String nome, String url){
        this.nome = nome;
        this.url = url;
        this.anuncios = new ArrayList<>();
    }
    public void addAnuncio(Anuncio anuncio){
        if(anuncio != null){
            this.anuncios.add(anuncio);
        }else{
            System.out.println("Tentativa de adicionar um anuncio nulo");
        }
    }
    public boolean removeAnuncio(Anuncio anuncio){
        if(anuncio != null){
            return this.anuncios.remove(anuncio);
        }
            return false;
    }

    @Override
    public String toString() {
        return "Portal{" +
                "nome='" + nome + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
