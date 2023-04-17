package br.iff.edu.controllers.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.iff.edu.service.ProdutoService;

@Controller
@RequestMapping(path = "/Produto")
public class ProdutoViewController {

    ProdutoService service;

    @GetMapping(path="/cadastrar")
    public String cadastrar(
            @RequestParam(name = "nomeProduto") String nome,
            @RequestParam(name = "codBarras") String codBarras,
            @RequestParam(name = "precoVenda") double precoVenda,
            @RequestParam(name = "precoCusto") double precoCusto){
            service.addProduto(nome, codBarras, precoVenda, precoCusto);
        return "homeFuncionario";
    }

    @GetMapping(path="/update")
    public String atualizar(
        @RequestParam(name = "id") int id,
    	@RequestParam(name = "nome") String nome,
        @RequestParam(name = "codBarras") String codBarras,
        @RequestParam(name = "precoVenda") double precoVenda,
        @RequestParam(name = "precoCusto") double precoCusto ){
        service.updateProduto(id, nome, codBarras, precoVenda, precoCusto);
        return "homeFuncionario";
    }

    @GetMapping(path="/excluir")
    public String excluir(@PathVariable (name = "id") int id){
        service.deletarProduto(id);
        return "homeFuncionario";
    }
}
