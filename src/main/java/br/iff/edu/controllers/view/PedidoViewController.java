package br.iff.edu.controllers.view;

import br.iff.edu.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping(path = "/Pedido")
public class PedidoViewController {

    @Autowired
    PedidoService service;

    @PostMapping(path = "/adicionar")
    public String addPedido(@RequestParam(name = "statusPedido") String statusPedido,
                            @RequestParam(name = "valorTotal") double valorTotal,
                            @RequestParam(name = "dataPedido") String dataPedido) {
        ResponseEntity.ok().body(service.addPedido(statusPedido, valorTotal, dataPedido));
        return "homeFuncionario";
    }

    @PutMapping(path="/update")
    public String atualizar(
            @RequestParam(name = "id") int id,
            @RequestParam(name = "statusPedido") String statusPedido,
            @RequestParam(name = "valorTotal") double valorTotal,
            @RequestParam(name = "dataPedido") String dataPedido ){
        ResponseEntity.ok().body(service.updatePedido(id, statusPedido, valorTotal, dataPedido));
        return "homeFuncionario";
    }
    @GetMapping(path = "/excluir")
    public String excluir(@RequestParam(name = "id") int id) {
        ResponseEntity.ok().body(service.deletarPedido(id));
        return "homeFuncionario";


    }
    @GetMapping(path="/historicoPedidos")
    public String historico(Model model){
        model.addAttribute("pedidos",  service.getPedidos());
        return "historicoPedidos";
    }

}
