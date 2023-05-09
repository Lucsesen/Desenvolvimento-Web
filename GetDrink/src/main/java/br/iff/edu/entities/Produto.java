package br.iff.edu.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="nome", nullable = false)
    private String nome;
	
	@Column(name="codBarras", nullable = false)
    private String codBarras;
	
	@Column(name="precoDeVenda", nullable = false)
    private double precoVenda;
	
	@Column(name="precoDeCusto", nullable = false)
    private double precoCusto;
	

    public Produto(String nome, String codBarras, double precoVenda, double precoCusto) {
        this.nome = nome;
        this.codBarras = codBarras;
        this.precoVenda = precoVenda;
        this.precoCusto = precoCusto;
    }

    public Produto() {

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCodBarras() {
        return codBarras;
    }
    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }
    public double getPrecoVenda() {
        return precoVenda;
    }
    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
    public double getPrecoCusto() {
        return precoCusto;
    }
    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    
}
