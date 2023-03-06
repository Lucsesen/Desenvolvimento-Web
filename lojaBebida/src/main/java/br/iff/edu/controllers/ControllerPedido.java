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
import br.iff.edu.entities.Pedido;
import br.iff.edu.repository.PedidosRepository;

@RestController
@RequestMapping("/loja/pedido")
public class ControllerPedido {
	
	@Autowired
	private PedidosRepository rep;
	
    @PostMapping("/")
    public String addPedido(
            @RequestParam(name = "statusPedido") String statusPedido,
            @RequestParam(name = "valorTotal") double valorTotal,
            @RequestParam(name = "qtdProduto") int qtdProduto) {
        Pedido pedido = new Pedido(statusPedido, valorTotal, qtdProduto);
        rep.save(pedido);
        return "O pedido foi adicionado.";
    }

    @GetMapping("/{id}") 
    public String getPedido(@PathVariable("id") int id) {
    	Optional<Pedido> ped = rep.findById(id);
        return "Pedido: " + ped;
    }
    
    @PutMapping("/{id}")  
    public String updatePedido( // Existe necessidade?
    	@RequestParam(name = "id") int id,
    	@RequestParam(name = "statusPedido") String statusPedido,
        @RequestParam(name = "valorTotal") double valorTotal,
        @RequestParam(name = "qtdProduto") int qtdProduto) {
    	Optional<Pedido> ped = rep.findById(id);
    	 if (ped.isPresent()) {
    	        Pedido pedido = ped.get();
    	        pedido.setStatusPedido(statusPedido);
    	        pedido.setValorTotal(valorTotal);
    	        pedido.setQtdProdutos(qtdProduto);
    	        return "Pedido " + id + " atualizado";
    	    } else {
    	        return "Pedido " + id + " não encontrado";
    	    }
    }
    
    @DeleteMapping("/{id}")
    public String deletarPedido(@RequestParam (name = "id") int id) {
    	rep.deleteById(id);
    	return "Pedido " + id + " deletado";
    }
}
