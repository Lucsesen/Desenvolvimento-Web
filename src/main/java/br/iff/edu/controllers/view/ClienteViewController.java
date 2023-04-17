package br.iff.edu.controllers.view;

import br.iff.edu.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/cliente")
public class ClienteViewController {

    @Autowired
    private ClienteService service;

    @GetMapping(path = "/{id}")
    public String buscarClienteByID(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("cliente", service.getCliente(id));
        return "cliente";
    }

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


