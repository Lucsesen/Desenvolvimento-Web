package loja.main;

public abstract class Usuario {
    private String nome;
    private String nasc;
    private String rg;
    private String cpf;

    public Usuario(String nome, String nasc, String rg, String cpf) {
        this.nome = nome;
        this.nasc = nasc;
        this.rg = rg;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNasc() {
        return nasc;
    }
    public void setNasc(String nasc) {
        this.nasc = nasc;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
}
