package EstudoProva.HenracaEPolimorfismo;

public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    // Metodo que será sobrescrito pelas subclasses
    public void fazerSom() {
        System.out.println(nome + " faz algum som.");
    }
}
