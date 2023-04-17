package br.iff.edu.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="pagamento")
public class Pagamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="valor")
    private double valor;
	
	@Column(name="notaFiscal")
    private int nf;
	
	@Column(name="descricao")
    private String descricao;
	
	@OneToOne
	private Pedido pedido;
    
    public Pagamento(double valor, int nf, String descricao) {
    	this.descricao = descricao;
    	this.valor = valor;
    	this.nf = nf;
    }

    public Pagamento() {

    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public int getNf() {
        return nf;
    }
    public void setNf(int nf) {
        this.nf = nf;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
