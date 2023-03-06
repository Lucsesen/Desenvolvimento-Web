package br.iff.edu.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
import br.iff.edu.entities.Funcionario;
import br.iff.edu.repository.FuncionariosRepository;

@RestController
@RequestMapping("/loja/funcionario")
public class ControllerFuncionario {

	@Autowired
	private FuncionariosRepository rep;

   @PostMapping("/")
   @ResponseStatus(HttpStatus.OK)
   public String addFuncionario(
         @RequestParam(name = "nome") String nome,
         @RequestParam(name = "salario") double salario,
         @RequestParam(name = "setor") String setor) {
      Funcionario funcionario = new Funcionario(nome, salario, setor);
      rep.save(funcionario);
      return "Funcionário " + funcionario.getNome() + " foi adicionado";
   }

   @GetMapping("/{nome}")
   public String page(@PathVariable("nome") String nome) {
		return "Olá, " + nome;
	}
   
   @GetMapping("/{id}")
   public String getFuncionario(@PathVariable("id") int id) {
   	Optional<Funcionario> f = rep.findById(id);
       return "Funcionário: " + f;
   }
   
   @PutMapping("/{id}")
   public String updateFuncionario(
   		@RequestParam(name = "id") int id,
	   	@RequestParam(name = "nome") String nome,
	    @RequestParam(name = "salario") double salario,
	    @RequestParam(name = "setor") String setor) {
   	Optional<Funcionario> f = rep.findById(id);
   	 if (f.isPresent()) {
   	        Funcionario funcionario = f.get();
   	        funcionario.setNome(nome);
   	        funcionario.setSalario(salario);
   	        funcionario.setSetor(setor);
   	        rep.save(funcionario);
   	        return "Funcionário " + id + " atualizado";
   	    } else {
   	        return "Funcionário " + id + " não encontrado";
   	    }
   }
   
   @DeleteMapping("/{id}")
   public String deletarFuncionario(@RequestParam (name = "id") int id) {
   	rep.deleteById(id);
   	return "Funcionário " + id + " deletado";
   }

   }
