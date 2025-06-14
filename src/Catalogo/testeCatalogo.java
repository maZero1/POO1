package Catalogo;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class testeCatalogo {
    @Test
    public void testeCenario1(){
        Catalogo cat1 = new Catalogo("Allan");
        Album alb1 = new Album("Pulse", 90, "Gostei", "Pink Floyd" , 10);
        Album alb2 = new Album("Abbey Road", 50, "Bom", "The Beatles" , 8);

        Filme fil1 = new Filme("Star Wars", 120, "Top", "George Lucas");
        Filme fil2 = new Filme("Toy Story", 100, "Show", "John Lasseter");

        Jogo jog1 = new Jogo("Returnal", 300, "Difícil", 2,"PS5");
        Jogo jog2 = new Jogo("Ghost Reacon", 40,"Bom demais",4,"PS5");

        assertEquals("Titulo : Pulse, Duracao: 90, Comentario: Gostei, Artista: Pink Floyd, Faixas: 10", alb1.toString());
        assertEquals("Titulo : Abbey Road, Duracao: 50, Comentario: Bom, Artista: The Beatles, Faixas: 8", alb2.toString());
        //FAZER DPS PARA JOGOS
        assertEquals("Titulo : Star Wars, Duracao: 120, Comentario: Top, Diretor: George Lucas",fil1.toString());
        assertEquals("Titulo : Toy Story, Duracao: 100, Comentario: Show, Diretor: John Lasseter",fil2.toString());

        assertEquals("Titulo : Returnal, Duracao: 300, Comentario: Difícil, Quantidade de Jogadores: 2, Plataforma: PS5", jog1.toString());
        assertEquals("Titulo : Ghost Reacon, Duracao: 40, Comentario: Bom demais, Quantidade de Jogadores: 4, Plataforma: PS5", jog2.toString());

        cat1.addItem(alb1);
        cat1.addItem(alb2);
        cat1.addItem(fil1);
        cat1.addItem(fil2);
        cat1.addItem(jog1);
        cat1.addItem(jog2);

        //obter os itens do catalogo
        ArrayList<Item> colecao = cat1.getItens();

        //verificar tamanho da lista
        assertEquals(6, colecao.size());

        //verificar conteudo da lista
        assertEquals(alb1, colecao.get(0));
        assertEquals(alb2, colecao.get(1));
        assertEquals(fil1, colecao.get(2));
        assertEquals(fil2, colecao.get(3));
        assertEquals(jog1, colecao.get(4));
        assertEquals(jog2, colecao.get(5));
    }
}
