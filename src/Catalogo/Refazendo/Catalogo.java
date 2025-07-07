package Catalogo.Refazendo;

import java.util.ArrayList;

public class Catalogo {
    private String colecionador;
    private ArrayList<Item> itens;

    public Catalogo(String colecionador){
        this.colecionador = colecionador;
        this.itens = new ArrayList<>();
    }
    public void addItens(Item umItem){
        this.itens.add(umItem);
    }
    public ArrayList<Item> getItens(){
        return this.itens;
    }
    public void removeItens(Item umItem){
        if(umItem != null){
            this.itens.remove(umItem);
        }else{
            System.out.println("Tentativa de remover um item que não existe");
        }
    }
    public String toString() {
        String texto = "Colecionado: " + this.colecionador;
        texto += "Itens : \n";
        for(Item it: itens){
            texto += it.toString();
            System.out.println();
        }
        return texto;
    }
}
