package FeitasEmSala.AulaPet;

public class Pet {

    private String nome;
    private int idade;
    private String raca;

    public Pet(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getRaca(){
        return this.raca;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(){
        this.idade = idade;
    }
    public String toString(){
        return "Nome: " + getNome() + ", Idade: " + getIdade();
    }
}
