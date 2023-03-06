package br.iff.edu.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
	
	@OneToOne
	@JoinColumn(name="fk_pagamento")
	private Pagamento pagamento;
	
	@OneToMany
	@JoinColumn(name="id_pedido")
	private List<Produto> produtos;
       
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
    public void setQtdProdutos(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }
    public Pagamento getPagamento() {
    	return pagamento;
    }
    public void setPagamento(Pagamento pagamento) {
    	this.pagamento = pagamento;
    }
    public List<Produto> getProdutos() {
    	return produtos;
    }
    public void setProduto(List<Produto> produtos) {
    	this.produtos = produtos;
    }
}
