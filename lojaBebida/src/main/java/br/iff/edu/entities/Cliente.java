package br.iff.edu.entities;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="nome", nullable = false, length = 50)
	private String nome;
	
	@Column(name="cpf", nullable = false, length = 50)
	private String cpf;

	@ManyToOne
	@JoinColumn(name="fk_endereco", referencedColumnName = "id")
	private Endereco endereco;
	
	@OneToMany
	@JoinColumn(name="id_cliente")
	private List<Pedido> pedidos;
	

	public Cliente(String nome, String cpf, String rua, int numero, String bairro, String cep, String cidade) {
	    this.nome = nome;
	    this.cpf = cpf;
//	    this.endereco = new Endereco(rua, numero, bairro, cep, cidade);
	}

	public Cliente() {

	}

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public long getId() {
		return this.id;
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

}
