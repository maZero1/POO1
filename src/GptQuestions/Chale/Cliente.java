package GptQuestions.Chale;

public class Cliente {
    private int id;
    private String email;
    private String nome;
    private String telefone;

    public Cliente(int id, String email, String nome, String telefone){
        this.id = id;
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId(){
        return this.id;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        if(email != null){
            this.email = email;
        }
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        if(nome != null){
            this.nome = nome;
        }
    }
    public String getTelefone(){
        return this.telefone;
    }
    public void setTelefone(){
        if(telefone != null && telefone.length() == 11){
            this.telefone = telefone;
        }
    }
}
