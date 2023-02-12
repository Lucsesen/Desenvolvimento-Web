package br.iff.edu.loja;

public class Pedido {
    private String statusPedido;
    private double valorTotal = 0;
    private int qtdProduto;

    public Pedido(String statusPedido, double valorTotal, int qtdProduto) {
        this.statusPedido = statusPedido;
        this.valorTotal = valorTotal;
        this.qtdProduto = qtdProduto;
    }

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

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }
}
