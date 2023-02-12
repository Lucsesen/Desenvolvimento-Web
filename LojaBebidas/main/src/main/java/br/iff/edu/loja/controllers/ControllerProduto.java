package br.iff.edu.loja.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.iff.edu.loja.Produto;

@RestController
@RequestMapping("/loja/produto")
public class ControllerProduto {
    @PostMapping("/")
    public void postProduto(
            @RequestParam(name = "nome") String nome,
            @RequestParam(name = "codBarras") String codBarras,
            @RequestParam(name = "precoVenda") double precoVenda,
            @RequestParam(name = "precoCusto") double precoCusto){
        Produto produto = new Produto(nome, codBarras, precoCusto, precoVenda);
    }

    @GetMapping("/{id}")
    public String page(@PathVariable("id") int id) {
        return "Olá Mundo" + id;
    }
}
