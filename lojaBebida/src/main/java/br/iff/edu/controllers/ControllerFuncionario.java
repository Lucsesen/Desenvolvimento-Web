package br.iff.edu.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.iff.edu.entities.Funcionario;

@RestController
@RequestMapping("/loja/funcionario")
public class ControllerFuncionario {


   @PostMapping("/")
   @ResponseStatus(HttpStatus.OK)
   public void postFuncionario(
         @RequestParam(name = "nome") String nome,
         @RequestParam(name = "salario") double salario,
         @RequestParam(name = "setor") String setor) {
      Funcionario funcionario = new Funcionario(nome, salario, setor);
   }

   @GetMapping("/{nome}")
   public String page(@PathVariable("nome") String nome) {
		return "Olá, " + nome;
	}

   }
