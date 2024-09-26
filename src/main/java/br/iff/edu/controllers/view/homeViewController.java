package br.iff.edu.controllers.view;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/")

public class homeViewController {

    @GetMapping
    public String home(){
        return "home";
    }

    @GetMapping(path="/adicionarProduto")
    public String addProduto(){
        return "adicionarProduto";
    }

    @GetMapping(path="/alterarProduto")
    public String altProduto(){
        return "alterarProduto";
    }

    @GetMapping(path="/excluirProduto")
    public String excluirProduto(){
        return "excluirProduto";
    }

    @GetMapping(path="/alterarUsuario")
    public String alterarUsuario(){
        return "alterarUsuario";
    }

    @GetMapping(path="/excluirUsuario")
    public String excluirUsuario(){
        return "excluirUsuario";
    }

    @GetMapping(path="/historicoPedidos")
    public String historico(){
        return "historicoPedidos";
    }

    @GetMapping(path="/sair")
    public String sair(){
        return "sair";
    }


    @GetMapping(path="/login")
    public String login(){ return "login"; }
    }