package br.iff.edu.controllers;

import java.util.List;
import java.util.Optional;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.iff.edu.service.ClienteService;
import br.iff.edu.entities.Cliente;
import br.iff.edu.entities.Endereco;
import br.iff.edu.repository.ClientesRepository;

@RestController
@RequestMapping("/loja/cliente")
public class ControllerCliente {
	
	@Autowired
	private ClienteService service;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public String  save(
		@RequestParam(name = "nome") String nome,
		@RequestParam(name = "cpf") String cpf,
		@RequestParam(name = "rua") String rua,
		@RequestParam(name = "numero") int numero,
		@RequestParam(name = "bairro") String bairro,
		@RequestParam(name = "cep") String cep,
		@RequestParam(name = "cidade") String cidade){
		service.addCliente(nome, cpf, rua, numero, bairro, cep, cidade);
	return "ok";
    }

    @GetMapping("/{id}")
	public Cliente findById(@PathVariable("id") int id){
		return service.getCliente(id);
	}
    
    @GetMapping
    public List<Cliente> getClientes(){
    	return service.getClientes();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity update(
    		@PathVariable(name = "id") int id,
    		@RequestParam(name = "nome") String nome,
            @RequestParam(name = "cpf") String cpf,
            @RequestParam(name = "rua") String rua,
            @RequestParam(name = "numero") int numero,
            @RequestParam(name = "bairro") String bairro,
            @RequestParam(name = "cep") String cep,
            @RequestParam(name = "cidade") String cidade) {
			return ResponseEntity.ok(service.updateCliente(id, nome, cpf, rua, numero, bairro, cep, cidade));
    }
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity delete(@RequestParam (name = "id") int id) {
    	return ResponseEntity.ok(service.deletarCliente(id));
    }
}
