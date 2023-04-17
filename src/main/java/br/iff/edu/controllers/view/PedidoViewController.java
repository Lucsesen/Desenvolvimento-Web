package br.iff.edu.controllers.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/Pedido")
public class PedidoViewController {

    @GetMapping(path="/realizar")
    public String realizarPedido(){
        return "realizarPedido";
    }


}
