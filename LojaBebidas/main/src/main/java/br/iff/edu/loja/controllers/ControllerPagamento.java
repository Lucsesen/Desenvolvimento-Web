package br.iff.edu.loja.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.iff.edu.loja.Pagamento;
@RestController
@RequestMapping("loja/pagamento")
public class ControllerPagamento {

    @PostMapping("/")
    public void postPagamento(
            @RequestParam(name = "valor") double valor,
            @RequestParam(name = "nf") int nf,
            @RequestParam(name = "descricao") String descricao){
        Pagamento pagamento = new Pagamento(valor, nf, descricao);
    }

    @GetMapping("/{id}")
    public String page(@PathVariable("id") int id) {
        return "Olá Mundo" + id;
    }
    
}
