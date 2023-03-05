package br.iff.edu.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;

@Embeddable
@Table(name="endereco")
public class Endereco {
	
	@Column(name="rua")
    private String rua;
	
	@Column(name="numero")
    private int numero;
	
	@Column(name="bairro")
    private String bairro;
	
	@Column(name="cep")
    private String cep;
	
	@Column(name="cidade")
    private String cidade;

    public Endereco(String rua, int numero, String bairro, String cep, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    
}
