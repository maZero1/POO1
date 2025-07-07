package EstudoProva.HenracaEPolimorfismo;

public class Cachorro extends Animal{
    public Cachorro(String nome) {
        super(nome); // Chama o construtor da superclasse
    }
    // Sobrescrita de metodo (Polimorfismo)
    @Override // Boa prática para indicar que o metodo está sendo sobrescrito
    public void fazerSom() {
        System.out.println(getNome() + " late: Au Au!");
    }
}
