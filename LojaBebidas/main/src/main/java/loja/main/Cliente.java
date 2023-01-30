package loja.main;

public class Cliente extends Usuario {
    Endereco endereco;

    public Cliente(String nome, String nasc, String rg, String cpf, String rua, int numero, String bairro, String cep, String cidade) {
        super(nome, nasc, rg, cpf);
        endereco = new Endereco (rua, numero, bairro, cep, cidade);
    }
}
