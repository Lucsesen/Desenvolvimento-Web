package br.iff.edu.loja;

public class Funcionario extends Usuario {
    private String setor;
    private String salario;

    public Funcionario(String nome, String nasc, String rg, String cpf, String salario, String setor) {
        super(nome, nasc, rg, cpf);
        this.setor = setor;
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public String getSalario() {
        return salario;
    }
    public void setSalario(String salario) {
        this.salario = salario;
    }
}
