package EstudoProva.HierarquiaDeHeranca;

public class Poodle extends Cachorro{
    public void passear() {
        System.out.println("Poodle passeando.");
    }

    public static void main(String[] args) {
        Poodle meuPoodle = new Poodle();
        meuPoodle.respirar(); // Herda de Animal
        meuPoodle.latir();    // Herda de Cachorro
        meuPoodle.passear();  // Metodo próprio
    }
}
