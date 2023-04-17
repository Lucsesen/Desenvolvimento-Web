package br.iff.edu.service;

import br.iff.edu.entities.Pedido;
import br.iff.edu.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Service
public class PedidoService {
    @Autowired
    private PedidosRepository rep;

    public String addPedido(String statusPedido, double valorTotal, int qtdProduto) {
        Pedido pedido = new Pedido(statusPedido, valorTotal, qtdProduto);
        rep.save(pedido);
        return "O pedido foi adicionado.";
    }

    public Pedido getPedido(int id) {
        Pedido pedido = rep.findById(id).get();
        return pedido;
    }

    /*
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
    }*/

    @DeleteMapping("/{id}")
    public String cancelarPedido(int id) {
        rep.deleteById(id);
        return "Pedido " + id + " deletado";
    }
}
