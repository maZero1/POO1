package PortalAnuncios;

public class Anuncio {
    private String produto;
    private double valorVenda;
    private String cidade;
    private String estado;

    public Anuncio(String produto, double valorVenda, String cidade, String estado) {
        this.produto = produto;
        this.valorVenda = valorVenda;
        this.cidade = cidade;
        this.estado = estado;
    }

    public void setProduto(String produto){
        if(produto.isEmpty() && produto != null){
            this.produto = produto;
        }
    }

    public void setCidade(String cidade) {
        if(cidade.isEmpty() && cidade != null){
            this.cidade = cidade;
        }
    }
    public void setValorVenda(double valorVenda){
        if(valorVenda > 0){
            this.valorVenda = valorVenda;
        }
    }
    public void setEstado(String estado){
        if(estado.isEmpty() && estado != null) {
            this.estado = estado;
        }
    }

    @Override
    public String toString() {
        return "Anuncio{" +
                "produto='" + produto + '\'' +
                ", valorVenda=" + valorVenda +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
