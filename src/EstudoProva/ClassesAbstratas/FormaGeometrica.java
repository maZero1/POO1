package EstudoProva.ClassesAbstratas;

abstract class FormaGeometrica {
    private String nome;

    public FormaGeometrica(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    // Metodo abstrato: subclasses DEVEM implementá-lo
    public abstract double calcularArea();

    // Metodo concreto: pode ou não ser sobrescrito
    public void exibirInfo() {
        System.out.println("Nome da forma: " + nome);
    }
}
