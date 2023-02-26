package br.iff.edu.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pedidos")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="statusPedido")
    private String statusPedido;
	
	@Column(name="valorTotal")
    private double valorTotal = 0;
	
	@Column(name="qtdProduto")
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
