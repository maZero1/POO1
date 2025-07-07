package EstudoProva.Composicao;

public class Carro {
    private String modelo;
    private Motor motor; // Composição: Um Carro POSSUI um Motor (o motor é parte essencial do carro)

    public Carro(String modelo, String tipoMotor, int cilindradasMotor) {
        this.modelo = modelo;
        // O motor é criado junto com o carro, e não existiria sem ele
        this.motor = new Motor(tipoMotor, cilindradasMotor);
        System.out.println("Carro " + modelo + " criado com seu motor.");
    }

    public void iniciar() {
        System.out.println("Iniciando o " + modelo + "...");
        motor.ligar(); // O carro controla seu motor
    }
    // Não há um setter para o Motor, pois ele é parte integrante do Carro
    public Motor getMotor() {
        return motor;
    }
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Sedan XPTO", "Gasolina", 2000);
        meuCarro.iniciar();
        // Se meuCarro for destruído (se sair do escopo), o objeto Motor também será
        // Não faz sentido um Motor existir sem um Carro específico aqui
        // (a menos que seja um motor de reposição, o que mudaria o relacionamento para agregação)
    }
}
