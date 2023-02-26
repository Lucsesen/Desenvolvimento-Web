package br.iff.edu.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.iff.edu.entities.Cliente;

@RestController
@RequestMapping("/loja/cliente")
public class ControllerCliente {
    @PostMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public void postCliente(
            @RequestParam(name = "nome") String nome,
            @RequestParam(name = "cpf") String cpf,
            @RequestParam(name = "rua") String rua,
            @RequestParam(name = "numero") int numero,
            @RequestParam(name = "bairro") String bairro,
            @RequestParam(name = "cep") String cep,
            @RequestParam(name = "cidade") String cidade){
        Cliente cliente = new Cliente(nome, cpf, rua, numero, bairro, cep, cidade);
    }

    @GetMapping("/{id}")
    public String page(@PathVariable("id") int id) {
        return "Olá Mundo" + id;
    }
    
    @PutMapping("/{id}")
    public String putCliente(
    		@RequestParam(name = "id") int id) {
    	return "Cliente" + id + " atualizado";
    }
    
    @DeleteMapping("/{id}")
    public String deletarCliente(@RequestParam (name = "id") int id) {
    	return "Cliente" + id + " deletado";
    }
}
