package br.iff.edu.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.iff.edu.entities.Pedido;

@RestController
@RequestMapping("/loja/pedido")
public class ControllerPedido {
    @PostMapping("/")
    public void postPedido(
            @RequestParam(name = "statusPedido") String statusPedido,
            @RequestParam(name = "valorTotal") double valorTotal,
            @RequestParam(name = "qtdProduto") int qtdProduto) {
        Pedido pedido = new Pedido(statusPedido, valorTotal, qtdProduto);
    }

    @GetMapping("/{id}")
    public String page(@PathVariable("id") int id) {
        return "Olá Mundo" + id;
    }
}
