package Catalogo;
import java.util.*;

public class Jogo extends Item {
    private int qtdJogadores;
    private String plataforma;

    public Jogo(String titulo, int duracao, String comentario, int qtdJogadores, String plataforma) {
        super(titulo, duracao, comentario);
        this.qtdJogadores = qtdJogadores;
        this.plataforma = plataforma;
    }

    public boolean setQtdJogadores(int jogadores){
        if (jogadores >= 0 ){
            this.qtdJogadores = jogadores;
            return true;
        }else{
            return false;
        }
    }
    public int getQtdJogadores(){
        return this.qtdJogadores;
    }
    public boolean setPlataforma(String plataforma) {
        if (!plataforma.isEmpty()) {
            this.plataforma = plataforma;
            return true;
        } else {
            return false;
        }
    }
    public String toString(){
        return super.toString() + ", Quantidade de Jogadores : "
                +this.qtdJogadores + ", Plataforma: " + this.plataforma;
    }
}
