package DetranVeiculos;

import java.util.ArrayList;

public class Detran {
    private String estado;
    private ArrayList<Veiculo> veiculos;

    public String getEstado(){
        return this.estado;
    }
    public boolean setEstado(String estado){
        if(estado == "SC" || estado == "PR"){
            this.estado = estado;
            return true;
        }else{
            return false;
        }
    }
    public ArrayList<Veiculo> getVeiculos(){
        return this.veiculos;
    }
    public void addVeiculos(Veiculo umVeiculo){
        this.veiculos.add(umVeiculo);
    }

    @Override
    public String toString() {
        String texto = "Estado: " + this.estado +"\n";
        for(Veiculo veic : veiculos){
            texto += veic.toString()+"\n";
        }
        return texto;
    }
}
