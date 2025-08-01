package EstudoProva.ClassesAbstratas;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<FormaGeometrica> geo;

    public void addGeo(FormaGeometrica geometrica){
        this.geo.add(geometrica);
    }
    public String toString(){
        String texto = "Formas: \n";
        for(FormaGeometrica g : geo){
            texto += g.toString();
        }
    }
}
