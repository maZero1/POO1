package Catalogo;
import java.util.ArrayList;

public class Catalogo {
    private String colecionador;
    private ArrayList<Item> itens;

    public Catalogo(String colecionador){
        this.colecionador = colecionador;
        this.itens = new ArrayList<Item>();
    }
    public void addItem(Item umItem){
        this.itens.add(umItem);
    }
    public String toString(){
        String texto = "Colecionador: "+this.colecionador+"\n";
        texto += "Itens: \n";

        for(Item it: itens) {
            texto += it.toString();
            System.out.println();
        }
        return texto;
    }
}
