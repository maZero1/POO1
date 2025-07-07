package Catalogo.Refazendo;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class testeCatalogo {
    @Test
    public void caso1(){
        Catalogo cat1 = new Catalogo("Matheus");

        Jogo jg1 = new Jogo("Clash of Clans", 9999, "Pay to win", 1, "Mobile");
        Jogo jg2 = new Jogo("Hero wars", 9999, "Divertido", 1, "Mobile");
        cat1.addItens(jg1);
        cat1.addItens(jg2);
        ArrayList<Item> colecao = cat1.getItens();
        assertEquals(2, colecao.size());
    }
    @Test
    public void caso2(){
        Catalogo cat2 = new Catalogo("Marlon");
        Filme fil1 = new Filme("Blade", 90, "Muito bom", "BigJeff");
        Jogo jg1 = new Jogo("Ghost", 100, "Muito bom", 4, "Ps5");
        cat2.addItens(fil1);
        cat2.addItens(jg1);
        ArrayList<Item> itens = cat2.getItens();
        assertEquals("Titulo: Blade, Duração: 90.0, Comentario: Muito bom, Diretor: BigJeff", fil1.toString());
        assertEquals("Titulo: Ghost, Duração: 100.0, Comentario: Muito bom, N° Jogadores: 4, Plataforma: Ps5", jg1.toString());
    }
}
