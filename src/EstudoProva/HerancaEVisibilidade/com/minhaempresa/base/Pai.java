package EstudoProva.HerancaEVisibilidade.com.minhaempresa.base;

public class Pai {
    public String publico = "Acessível em todo lugar.";
    protected String protegido = "Acessível no pacote e por subclasses.";
    String padrao = "Acessível apenas no pacote."; // default/package-private
    private String privado = "Acessível apenas nesta classe.";

    public void metodoPublico() {
        System.out.println("Método público do Pai.");
    }

    protected void metodoProtegido() {
        System.out.println("Método protegido do Pai.");
    }

    void metodoPadrao() {
        System.out.println("Método padrão do Pai.");
    }

    private void metodoPrivado() {
        System.out.println("Método privado do Pai.");
    }

    public void acessarPrivado() {
        metodoPrivado(); // Só pode ser acessado aqui
    }
}
