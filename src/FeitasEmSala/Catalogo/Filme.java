package FeitasEmSala.Catalogo;

public class Filme extends Item {
    private String diretor;

    public Filme(String titulo, int duracao, String comentario, String diretor){
        super(titulo, duracao, comentario);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public boolean setDiretor(String diretor) {
        if (!diretor.isEmpty()){
            this.diretor = diretor;
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        return super.toString()+ ", Diretor: " + this.diretor;
    }
}
