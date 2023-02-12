package br.iff.edu.loja.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.iff.edu.loja.Funcionario;

@RestController
@RequestMapping("/loja/funcionario")
public class ControllerFuncionario {


   @PostMapping("/")
   @ResponseStatus(HttpStatus.OK)
   public void postFuncionario(
         @RequestParam(name = "nome") String nome,
         @RequestParam(name = "nasc") String nasc,
         @RequestParam(name = "rg") String rg,
         @RequestParam(name = "cpf") String cpf,
         @RequestParam(name = "salario") String salario,
         @RequestParam(name = "setor") String setor) {
      Funcionario funcionario = new Funcionario(nome, nasc, rg, cpf, salario, setor);
   }

   @GetMapping("/{id}")
   public String page(@PathVariable("id") int id) {
		return "Olá Mundo" + id;
	}

   }
