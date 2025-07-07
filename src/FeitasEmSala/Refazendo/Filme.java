package FeitasEmSala.Refazendo;

public class Filme extends Item{
    private String diretor;

    public Filme(String titulo, double duracao, String comentario, String diretor){
        super(titulo, duracao, comentario);
        this.diretor = diretor;
    }
    public String getDiretor(){
        return this.diretor;
    }
    public void setDiretor(String diretor){
        if(diretor != null){
            this.diretor = diretor;
        }else{
            System.out.println("Tentativa de inserir diretor vazio");
        }
    }
    @Override
    public String toString(){
        return super.toString() + ", Diretor: " + this.diretor;
    }
}
