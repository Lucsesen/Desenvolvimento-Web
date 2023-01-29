package loja.main;

public class Pedido {
    private String statusPedido;
    private double valorTotal = 0;
    private String qtdProduto;
       
    public String getStatusPedido() {
        return statusPedido;
    }
    public void setStatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public String getQtdProduto() {
        return qtdProduto;
    }
    public void setQtdProduto(String qtdProduto) {
        this.qtdProduto = qtdProduto;
    }
}
