package br.iff.edu.loja.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.iff.edu.loja.Cliente;

@RestController
@RequestMapping("/loja/cliente")
public class ControllerCliente {
    @PostMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public void postCliente(
            @RequestParam(name = "nome") String nome,
            @RequestParam(name = "nasc") String nasc,
            @RequestParam(name = "rg") String rg,
            @RequestParam(name = "cpf") String cpf,
            @RequestParam(name = "rua") String rua,
            @RequestParam(name = "numero") String numero,
            @RequestParam(name = "bairro") String bairro,
            @RequestParam(name = "cep") String cep,
            @RequestParam(name = "cidade") String cidade){
        Cliente cliente = new Cliente(nome, nasc, rg, cpf, rua, numero, bairro, cep, cidade);
    }

    @GetMapping("/{id}")
    public String page(@PathVariable("id") int id) {
        return "Olá Mundo" + id;
    }
}
