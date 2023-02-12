package br.iff.edu.loja;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="/apirest/funcionario")

public class Cliente extends Usuario {
    Endereco endereco;

    public Cliente(String nome, String nasc, String rg, String cpf, String rua, int numero, String bairro, String cep, String cidade) {
        super(nome, nasc, rg, cpf);
        endereco = new Endereco (rua, numero, bairro, cep, cidade);
    }
}
