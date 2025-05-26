package Catalogo;

public class Filme extends Item{
    private String diretor;

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
}
