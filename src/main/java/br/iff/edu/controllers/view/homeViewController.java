package br.iff.edu.controllers.view;

import br.iff.edu.service.PedidoService;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/")

public class homeViewController {

    @GetMapping
    public String home(){
        return "homeFuncionario";
    }

    @GetMapping(path="/adicionarProduto")
    public String addProduto(){
        return "adicionarProduto";
    }

    @GetMapping(path="/alterarProduto")
    public String altProduto(){
        return "alterarProduto";
    }

    @GetMapping(path="/cadastrarUsuario")
    public String cadastrarFuncionario(){ return "cadastrarUsuario"; }

    @GetMapping(path="/alterarUsuario")
    public String alterarUsuario(){
        return "alterarUsuario";
    }


    @GetMapping(path="/adicionarPedido")
    public String adicionarPedido(){ return "adicionarPedido"; }
    @GetMapping(path="/alterarPedido")
    public String alterarPedido(){
        return "alterarPedido";
    }

    @GetMapping(path="/sair")
    public String sair(){
        return "login";
    }


    }