package FeitasEmSala.BancoAgencia;

import java.util.ArrayList;

public class Banco {
    private int id;
    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(int id, String nome){
        this.id = id;
        this.nome = nome;
        this.agencias =  new ArrayList<>();;
    }
    public void addAgencia(Agencia umaAgencia){
        this.agencias.add(umaAgencia);
    }
    public String getNome(){
        return this.nome;
    }
    public boolean setNome(String nome){
        if(nome != null){
            this.nome = nome;
            return true;
        }
        return false;
    }
    public int getId(){
        return this.id;
    }
    public ArrayList<Agencia> getAgencias(){
        return this.agencias;
    }
    public ArrayList<Agencia> getAgencias(String cidade){
        ArrayList<Agencia> agenciasCidade = new ArrayList<Agencia>();
        for(Agencia index : this.agencias){
            if(index.getCidade().equals(cidade)) {
                agenciasCidade.add(index);
            }
        }
        return agenciasCidade;
    }
    public ArrayList<Agencia> getAgencias(int anoDeAbertura){
        ArrayList<Agencia> agenciasAno = new ArrayList<Agencia>();
        for(Agencia index : this.agencias) {
            if (index.getAnoDeAbertura() == anoDeAbertura) {
            agenciasAno.add(index);
            }
        }
        return agenciasAno;
    }
    public void imprimirAgencias(){
        System.out.println("Banco: " + this.id+ " - " + this.nome);
        this.agencias.forEach(index -> System.out.println(index));
    }
    public void imprimirAgencias(String cidade){
        System.out.println("Banco: " + this.id+ " - " + this.nome);
        ArrayList<Agencia> agenciasCidade = this.getAgencias(cidade);
        this.agencias.forEach(index -> System.out.println(index));
    }
    public void imprimirAgencias(int anoDeAbertura){
        System.out.println("Banco: " + this.id+ " - " + this.nome);
        ArrayList<Agencia> agenciasAno  = this.getAgencias(anoDeAbertura);
        this.agencias.forEach(index -> System.out.println(index));
    }
    public Agencia getAgencia(int numero){
        Agencia procurada = null;
        for(Agencia umaAgencia : agencias){
            if(umaAgencia.getNumero() == numero){
                procurada = umaAgencia;
            }
        }
        return procurada;
    }
}
