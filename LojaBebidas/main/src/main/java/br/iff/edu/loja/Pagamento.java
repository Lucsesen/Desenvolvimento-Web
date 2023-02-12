package br.iff.edu.loja;

public class Pagamento {
    private double valor;
    private int nf;
    private String descricao;
    
    public Pagamento(double valor, int nf, String descricao) {
        this.valor = valor;
        this.nf = nf;
        this.descricao = descricao;
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
