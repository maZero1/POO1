package FeitasEmSala.AulaPet;

import java.util.ArrayList;

public class Dono {
    private String nome;
    private ArrayList<Pet> pets = new ArrayList<>();
    public Dono(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void addPet(Pet pet){
        this.pets.add(pet);
    }
    public void removerPetByNome(String nomePet){
        this.pets.remove(nomePet);
    }
    private void removerPet(Pet pet){
        this.pets.remove(pet);
    }
    public String toString(){
        return "Se de certo foi com ajuda do Nicolas";
    }
}
