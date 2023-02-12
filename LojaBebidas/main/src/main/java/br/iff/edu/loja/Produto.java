package br.iff.edu.loja;

public class Produto {
    private String nome;
    private String codBarras;
    private double precoVenda;
    private double precoCusto;

    public Produto(String nome, String codBarras, double precoVenda, double precoCusto) {
        this.nome = nome;
        this.codBarras = codBarras;
        this.precoVenda = precoVenda;
        this.precoCusto = precoCusto;
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
    public int getPrecoCusto() {
        return precoCusto;
    }
    public void setPrecoCusto(int precoCusto) {
        this.precoCusto = precoCusto;
    }

    
}
