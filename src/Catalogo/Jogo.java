package Catalogo;
import java.util.*;

public class Jogo {
    private int qtdJogadores;
    private String plataforma;


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
}
