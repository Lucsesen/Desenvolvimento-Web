package br.iff.edu.controllers;

import java.util.Optional;

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
	private ProdutosRepository rep;
	
    @PostMapping("/")
    public String addProduto(
            @RequestParam(name = "nome") String nome,
            @RequestParam(name = "codBarras") String codBarras,
            @RequestParam(name = "precoVenda") double precoVenda,
            @RequestParam(name = "precoCusto") double precoCusto){
        Produto produto = new Produto(nome, codBarras, precoCusto, precoVenda);
        rep.save(produto);
        return "Produto " + produto.getNome() + " adicionado.";
    }

    @GetMapping("/{id}") 
    public String getProduto(@PathVariable("id") int id) {
    	Optional<Produto> optionalProduto = rep.findById(id);
        return "Produto: " + optionalProduto;
    }
    
    @PutMapping("/{id}") 
    public String updatePagamento(
    	@RequestParam(name = "id") int id,
    	@RequestParam(name = "nome") String nome,
        @RequestParam(name = "codBarras") String codBarras,
        @RequestParam(name = "precoVenda") double precoVenda,
        @RequestParam(name = "precoCusto") double precoCusto) {
    	Optional<Produto> optionalProduto = rep.findById(id);
    	 if (optionalProduto.isPresent()) {
    	        Produto produto = optionalProduto.get();
    	        produto.setNome(nome);
    	        produto.setCodBarras(codBarras);
    	        produto.setPrecoCusto(precoCusto);
    	        produto.setPrecoVenda(precoVenda);        
    	        rep.save(produto);
    	        return "Produto " + id + " atualizado";
    	    } else {
    	        return "Produto " + id + " não encontrado";
    	    }
    }
    
    @DeleteMapping("/{id}")
    public String deletarProduto(@RequestParam (name = "id") int id) {
    	rep.deleteById(id);
    	return "Produto " + id + " deletado";
    }
    
}
