package EstudoProva.HenracaEPolimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        // Lista de Animais, mas pode conter Cachorros e Gatos (polimorfismo)
        List<Animal> animaisNoZoo = new ArrayList<>();
        animaisNoZoo.add(new Cachorro("Buddy"));
        animaisNoZoo.add(new Gato("Luna"));
        animaisNoZoo.add(new Cachorro("Max"));

        System.out.println("Sons dos animais no zoo:");
        for (Animal a : animaisNoZoo) {
            a.fazerSom(); // Cada objeto chama sua própria implementação de fazerSom()
            // mesmo a variável sendo do tipo Animal.
        }
        /* Saída:
         * Buddy late: Au Au!
         * Luna mia: Miau!
         * Max late: Au Au!
         */
    }
}
