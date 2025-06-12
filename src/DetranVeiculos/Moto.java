package DetranVeiculos;

public class Moto extends Veiculo{
    private int cilindradas;

    public int getCilindradas(){
        return this.cilindradas;
    }
    public void setCilindradas() {
        if(cilindradas > 0){
            this.cilindradas = cilindradas;
        }
    }
    @Override
    public double calcularIPVA() {
        if(this.cilindradas > 200) {
            return super.calcularIPVA();
        }
        return 0;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", Cilindradas: " + getCilindradas();
    }
}
