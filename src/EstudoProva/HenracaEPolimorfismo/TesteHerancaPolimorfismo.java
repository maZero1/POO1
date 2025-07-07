package EstudoProva.HenracaEPolimorfismo;

public class TesteHerancaPolimorfismo {
    public static void main(String[] args) {
        Animal meuAnimal = new Animal("Bicho");
        Cachorro meuCachorro = new Cachorro("Rex");
        Gato meuGato = new Gato("Frajola");

        meuAnimal.fazerSom();   // Saída: Bicho faz algum som.
        meuCachorro.fazerSom(); // Saída: Rex late: Au Au! (Polimorfismo em ação)
        meuGato.fazerSom();     // Saída: Frajola mia: Miau! (Polimorfismo em ação)

        // Polimorfismo de referências:
        // Uma variável do tipo da superclasse pode referenciar um objeto da subclasse
        Animal animalPolimorfico1 = new Cachorro("Bob");
        Animal animalPolimorfico2 = new Gato("Whiskers");

        animalPolimorfico1.fazerSom(); // Saída: Bob late: Au Au!
        animalPolimorfico2.fazerSom(); // Saída: Whiskers mia: Miau!
        // O metodo chamado é determinado em tempo de execução, baseado no tipo REAL do objeto.
    }
}
