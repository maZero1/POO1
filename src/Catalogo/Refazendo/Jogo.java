package Catalogo.Refazendo;

public class Jogo extends Item{
     private int jogadores;
     private String plataforma;

     public Jogo(String titulo, double duracao, String comentario, int jogadores, String plataforma){
         super(titulo, duracao, comentario);
         this.jogadores = jogadores;
         this.plataforma = plataforma;
     }
     public int getJogadores(){
         return this.jogadores;
     }
     public void setJogadores(int jogadores){
         if(jogadores > 0){
             this.jogadores = jogadores;
         }else{
             System.out.println("Tentativa de inserir N° jogadores negativo");
         }
     }
     public String getPlataforma(){
         return this.plataforma;
     }
     public void setPlataforma(String plataforma){
         if(plataforma != null && plataforma.isEmpty()){
             this.plataforma = plataforma;
         }else{
             System.out.println("Tentativa de inserir plataforma vazia");
         }
     }
     @Override
     public String toString(){
         return super.toString() + " N° Jogadores: " + jogadores + ", Plataforma: " + plataforma;
     }
}
