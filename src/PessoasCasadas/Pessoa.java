package PessoasCasadas;

import static sun.util.locale.LocaleUtils.isEmpty;

public class Pessoa {
    private int anoNascimento;
    private String nome;
    private double peso;
    private double altura;
    private Pessoa conjuge;

    public Pessoa(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }
    public boolean setNome(String nome){
        if(!nome.equals("")){
            this.nome = nome;
            return true;
        }else{
            return false;
        }
    }
    public String getNome(){
        return this.nome;
    }
    public boolean setPeso(double peso){
        if(peso > 0){
            this.peso = peso;
            return true;
        }else{
            return false;
        }
    }
    public double getPeso(){
        return this.peso;
    }
    public boolean setAltura(double altura){
        if(altura >= 0){
            this.altura = altura;
            return true;
        }else{
            return false;
        }
    }
    public double getAltura(){
            return this.altura;
    }
    public void casar(Pessoa outraPessoa){
        this.conjuge = outraPessoa;
    }
    public boolean ehCasado(){
        if(this.conjuge != null){
            return true;
        }else{
            return false;
        }
    }
    public String getNomeConjuge(){
        return this.conjuge.getNome();
    }

}
