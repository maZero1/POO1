package EstudoProva.HenracaEPolimorfismo;

public class Gato extends Animal{
    public Gato(String nome) {
        super(nome);
    }
    // Sobrescrita de método (Polimorfismo)
    @Override
    public void fazerSom() {
        System.out.println(getNome() + " mia: Miau!");
    }
}
