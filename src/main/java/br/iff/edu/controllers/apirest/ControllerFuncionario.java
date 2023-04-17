package br.iff.edu.controllers.apirest;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Controller;

import br.iff.edu.service.FuncionarioService;
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
@RequestMapping(path="/loja/funcionario")
public class ControllerFuncionario {

	@Autowired
	private FuncionarioService service;

    @GetMapping(path="/base")
    public String base(){
        return "layoutBase";
    }

   @PostMapping("/")
   @ResponseStatus(HttpStatus.OK)
   public String save(
         @RequestParam(name = "nome") String nome,
         @RequestParam(name = "salario") double salario,
         @RequestParam(name = "setor") String setor) {
      service.addFuncionario(nome, salario, setor);
      return "Funcionário criado";
   }
   
   @GetMapping("/{id}")
   public Funcionario getById(@PathVariable("id") int id) {
       return service.getFuncionario(id);
   }
   
   @GetMapping
   public List<Funcionario> getFuncionarios(){
	   return service.getFuncionarios();
   }
   
   @PutMapping("/update/{id}")
   public String update(
   		@RequestParam(name = "id") int id,
	   	@RequestParam(name = "nome") String nome,
	    @RequestParam(name = "salario") double salario,
	    @RequestParam(name = "setor") String setor) {
	   	return service.updateFuncionario(id, nome, salario, setor);
   }
   
   @DeleteMapping("/deletar/{id}")
   public String deleteById(@PathVariable int id) {
   	return service.deletarFuncionario(id);
   }

}
