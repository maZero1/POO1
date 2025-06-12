package DetranVeiculos;

public class Carro extends Veiculo {
    private int portas;

    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        if(portas > 0) {
            this.portas = portas;
        }
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Portas: " + getPortas();
    }
}
