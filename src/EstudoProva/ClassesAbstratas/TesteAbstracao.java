package EstudoProva.ClassesAbstratas;

public class TesteAbstracao {
    public static void main(String[] args) {
        // FormaGeometrica f = new FormaGeometrica("Genérica"); // ERRO: Não pode instanciar classe abstrata

        Circulo c = new Circulo("Círculo Vermelho", 5.0);
        c.exibirInfo();
        System.out.println("Área do " + c.getNome() + ": " + c.calcularArea());

        Retangulo r = new Retangulo("Retângulo Azul", 4.0, 6.0);
        r.exibirInfo();
        System.out.println("Área do " + r.getNome() + ": " + r.calcularArea());

        // Polimorfismo com classes abstratas:
        FormaGeometrica forma1 = new Circulo("Círculo Pequeno", 2.0);
        FormaGeometrica forma2 = new Retangulo("Retângulo Grande", 10.0, 5.0);

        System.out.println("\nÁrea da forma 1: " + forma1.calcularArea());
        System.out.println("Área da forma 2: " + forma2.calcularArea());
    }
}
