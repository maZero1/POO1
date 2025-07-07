package EstudoProva.HenracaEPolimorfismo;

public class PolimorfismoMetodos {
    // Metodo que aceita qualquer tipo de Animal (ou subclasse de Animal)
    public static void exibirComportamento(Animal animal) {
        System.out.print(animal.getNome() + ": ");
        animal.fazerSom(); // O metodo fazerSom() será chamado de acordo com o tipo REAL do objeto
    }

    public static void main(String[] args) {
        Animal a1 = new Animal("Genericão");
        Cachorro c1 = new Cachorro("Totó");
        Gato g1 = new Gato("Mimi");

        exibirComportamento(a1); // Chama fazerSom() de Animal
        exibirComportamento(c1); // Chama fazerSom() de Cachorro (sobrescrito)
        exibirComportamento(g1); // Chama fazerSom() de Gato (sobrescrito)

        // Mesmo que você crie um array de Animal, o polimorfismo funciona
        Animal[] meusBichos = new Animal[3];
        meusBichos[0] = new Cachorro("Snoopy");
        meusBichos[1] = new Gato("Garfield");
        meusBichos[2] = new Animal("Desconhecido");

        for (Animal bicho : meusBichos) {
            bicho.fazerSom(); // Comportamento polimórfico
        }
    }
}
