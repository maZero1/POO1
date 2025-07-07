package FeitasEmSala.PortalAnuncios;

public class AnuncioPago extends Anuncio {
    private int quantidadeDias;
    private double valorPago;

    public AnuncioPago(String produto, double valorVenda, String cidade, String estado, int quantidadeDias, double valorPago){
        super(produto, valorVenda, cidade, estado);
        this.quantidadeDias = quantidadeDias;
        this.valorPago = valorPago;
    }
}
