package br.iff.edu.service;

import br.iff.edu.entities.Funcionario;
import br.iff.edu.entities.Pedido;
import br.iff.edu.repository.PedidosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {
    @Autowired
    private PedidosRepository rep;

    public String addPedido(String statusPedido, double valorTotal, String dataPedido) {
        Pedido pedido = new Pedido(statusPedido, valorTotal, dataPedido);
        rep.save(pedido);
        return "O pedido foi adicionado.";
    }

    public String updatePedido(int id, String statusPedido, double valorTotal, String dataPedido) {
        Optional<Pedido> f = rep.findById(id);
        if (f.isPresent()) {
            Pedido pedido = f.get();
            pedido.setStatusPedido(statusPedido);
            pedido.setValorTotal(valorTotal);
            pedido.setDataPedido(dataPedido);
            rep.save(pedido);
            return "Pedido " + id + " atualizado";
        } else {
            return "Pedido " + id + " não encontrado";
        }
    }
    public Pedido getPedido(int id) {
        Pedido pedido = rep.findById(id).get();
        return pedido;
    }
    public List<Pedido> getPedidos(){
        return rep.findAll();
    }

    public String deletarPedido(int id) {
        rep.deleteById(id);
        return "Pedido deletado";
    }

}
