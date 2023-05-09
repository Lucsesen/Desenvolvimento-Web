package br.iff.edu.controllers.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import br.iff.edu.service.ProdutoService;

@Controller
@RequestMapping(path = "/Produto")
public class ProdutoViewController {

    @Autowired
    ProdutoService service;

    @PostMapping(path="/cadastrar")
    public String cadastrar(
            @RequestParam(name = "nome") String nome,
            @RequestParam(name = "codBarras") String codBarras,
            @RequestParam(name = "precoVenda") double precoVenda,
            @RequestParam(name = "precoCusto") double precoCusto){
            ResponseEntity.ok().body(service.addProduto(nome, codBarras, precoVenda, precoCusto));
        return "homeFuncionario";
    }

    @PutMapping(path="/update")
    public String atualizar(
        @RequestParam(name = "id") int id,
    	@RequestParam(name = "nome") String nome,
        @RequestParam(name = "codBarras") String codBarras,
        @RequestParam(name = "precoVenda") double precoVenda,
        @RequestParam(name = "precoCusto") double precoCusto ){
        ResponseEntity.ok().body(service.updateProduto(id, nome, codBarras, precoVenda, precoCusto));
        return "homeFuncionario";
    }

    @GetMapping(path="/excluir")
    public String excluir(@RequestParam (name = "id") int id){
        ResponseEntity.ok().body(service.deletarProduto(id));
        return "homeFuncionario";
    }
    @GetMapping(path="/listaProdutos")
    public String listaProdutos(Model model){
        model.addAttribute("produtos",  service.getProdutos());
        return "listaProdutos";
    }
}
