package EstudoProva.Composicao;

public class Motor {
    private String tipo;
    private int cilindradas;

    public Motor(String tipo, int cilindradas) {
        this.tipo = tipo;
        this.cilindradas = cilindradas;
        System.out.println("Motor " + tipo + " (" + cilindradas + "cc) criado.");
    }
    public void ligar() {
        System.out.println("Motor " + tipo + " ligando...");
    }
}
