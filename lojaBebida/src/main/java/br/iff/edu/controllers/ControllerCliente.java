package br.iff.edu.controllers;

import java.util.Optional;

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

import br.iff.edu.entities.Cliente;
import br.iff.edu.entities.Endereco;
import br.iff.edu.repository.ClientesRepository;

@RestController
@RequestMapping("/loja/cliente")
public class ControllerCliente {
	
	@Autowired
	private ClientesRepository rep;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<HttpStatus> addCliente(
		@RequestParam(name = "nome") String nome,
		@RequestParam(name = "cpf") String cpf,
		@RequestParam(name = "rua") String rua,
		@RequestParam(name = "numero") int numero,
		@RequestParam(name = "bairro") String bairro,
		@RequestParam(name = "cep") String cep,
		@RequestParam(name = "cidade") String cidade){

		Cliente cliente = new Cliente(nome, cpf, rua, numero, bairro, cep, cidade);
		rep.save(cliente);
	return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public String getCliente(@PathVariable("id") int id) {
    	Optional<Cliente> c = rep.findById(id);
        return "Cliente: " + c;
    }
    
    @PutMapping("/{id}")
    public String updateCliente(
    		@RequestParam(name = "id") int id,
    		@RequestParam(name = "nome") String nome,
            @RequestParam(name = "cpf") String cpf, 
            @RequestParam(name = "rua") String rua,
            @RequestParam(name = "numero") int numero,
            @RequestParam(name = "bairro") String bairro,
            @RequestParam(name = "cep") String cep,
            @RequestParam(name = "cidade") String cidade) {
    	Optional<Cliente> c = rep.findById(id);
    	 if (c.isPresent()) {
    	        Cliente cliente = c.get();
    	        cliente.setNome(nome);
    	        cliente.setCpf(cpf);
    	        Endereco endereco = cliente.getEndereco();
    	        endereco.setRua(rua);
    	        endereco.setNumero(numero);
    	        endereco.setBairro(bairro);
    	        endereco.setCep(cep);
    	        endereco.setCidade(cidade);
    	        rep.save(cliente);
    	        return "Cliente " + id + " atualizado";
    	    } else {
    	        return "Cliente " + id + " não encontrado";
    	    }
    }
    
    @DeleteMapping("/{id}")
    public String deletarCliente(@RequestParam (name = "id") int id) {
    	rep.deleteById(id);
    	return "Cliente" + id + " deletado";
    }
}
