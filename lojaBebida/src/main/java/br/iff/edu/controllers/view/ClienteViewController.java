package br.iff.edu.controllers.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/cliente")

public class ClienteViewController {
    @GetMapping(path="/")
    public String home(){
        return "cliente";
    }

    @GetMapping(path="/cadastrar")
    public String cadastrar(){
        return "cadastrarCliente";
    }

    @GetMapping(path="/atualizar")
    public String atualizar(){
        return "atualizarCliente";
    }

    @GetMapping(path="/excluir")
    public String excluir(){
        return "excluirCliente";
    }
}


