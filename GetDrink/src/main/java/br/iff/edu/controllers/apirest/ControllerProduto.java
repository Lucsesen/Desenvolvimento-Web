package br.iff.edu.controllers.apirest;

import java.util.List;
import java.util.Optional;

import br.iff.edu.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.iff.edu.entities.Produto;
import br.iff.edu.repository.ProdutosRepository;

@RestController
@RequestMapping("/loja/produto")
public class ControllerProduto {
	
	@Autowired
	private ProdutoService service;
	
    @PostMapping("/")
    public String save(
            @RequestParam(name = "nome") String nome,
            @RequestParam(name = "codBarras") String codBarras,
            @RequestParam(name = "precoVenda") double precoVenda,
            @RequestParam(name = "precoCusto") double precoCusto){
        return service.addProduto(nome, codBarras, precoVenda, precoCusto);
    }

    @GetMapping("/{id}") 
    public Produto getProduto(@PathVariable("id") int id) {
    	return service.getProduto(id);
    }
    
    @PutMapping("/update/{id}")
    public String update(
    	@RequestParam(name = "id") int id,
    	@RequestParam(name = "nome") String nome,
        @RequestParam(name = "codBarras") String codBarras,
        @RequestParam(name = "precoVenda") double precoVenda,
        @RequestParam(name = "precoCusto") double precoCusto) {
    	return service.updateProduto(id, nome, codBarras, precoVenda, precoCusto);
    }
    
    @DeleteMapping("/deletar/{id}")
    public String deletarProduto(@PathVariable (name = "id") int id) {
    	return service.deletarProduto(id);
    }
    
    @GetMapping
   public List<Produto> getProdutos(){
	   return service.getProdutos();
   }
}
