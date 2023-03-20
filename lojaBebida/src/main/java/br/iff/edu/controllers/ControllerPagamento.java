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
import br.iff.edu.entities.Pagamento;
import br.iff.edu.repository.PagamentosRepository;
@RestController
@RequestMapping("loja/pagamento")
public class ControllerPagamento {

	@Autowired
	private PagamentosRepository rep;
	
    @PostMapping("/")
    public String addPagamento(
            @RequestParam(name = "valor") double valor,
            @RequestParam(name = "nf") int nf,
            @RequestParam(name = "descricao") String descricao){
        Pagamento pagamento = new Pagamento(valor, nf, descricao);
        rep.save(pagamento);
        return "Funcionário " + pagamento.getDescricao() + " foi adicionado";
    }
    
    @GetMapping("/{id}")  // Existe mesmo a necessidade neste caso?
    public String getPagamento(@PathVariable("id") int id) {
    	Optional<Pagamento> pag = rep.findById(id);
        return "Pagamento: " + pag;
    }
    
    @PutMapping("/{id}")  // Existe mesmo a necessidade neste caso?
    public String updatePagamento(
    	@RequestParam(name = "id") int id,
    	@RequestParam(name = "valor") double valor,
        @RequestParam(name = "nf") int nf,
        @RequestParam(name = "descricao") String descricao) {
    	Optional<Pagamento> pag = rep.findById(id);
    	 if (pag.isPresent()) {
    	        Pagamento pagamento = pag.get();
    	        pagamento.setValor(valor);
    	        pagamento.setNf(nf);
    	        pagamento.setDescricao(descricao);
    	        rep.save(pagamento);
    	        return "Pagamento " + id + " atualizado";
    	    } else {
    	        return "Pagamento " + id + " não encontrado";
    	    }
    }
    
    @DeleteMapping("/{id}")
    public String deletarPagamento(@RequestParam (name = "id") int id) {
    	rep.deleteById(id);
    	return "Pagamento " + id + " deletado";
    }
    
}
