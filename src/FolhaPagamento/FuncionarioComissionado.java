package FolhaPagamento;

public class FuncionarioComissionado extends Funcionario{
    private int totalVendas;
    private double percentualComissao;

    public int getTotalVendas(){
        return this.totalVendas;
    }
    public double getPercentualComissao(){
        return this.percentualComissao;
    }
    public boolean setTotalVendas(int totalVendas){
        if(totalVendas > 0){
            this.totalVendas = totalVendas;
            return true;
        }else{
            return false;
        }
    }
    public boolean setPercentualComissao(double percentualComissao){
        if (percentualComissao > 0){
            this.percentualComissao = percentualComissao;
            return true;
        }else{
            return false;
        }
    }
    public double calculaSalario(){
        return getTotalVendas()*getPercentualComissao();
    }
}
