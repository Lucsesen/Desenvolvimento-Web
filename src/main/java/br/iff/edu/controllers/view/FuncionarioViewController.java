package br.iff.edu.controllers.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/funcionario")
public class FuncionarioViewController {
    @GetMapping(path="/")
    public String home(){
        return "homeFuncionario";
    }

    @GetMapping(path="/cadastrar")
    public String cadastrar(){
        return "cadastrarFuncionario";
    }

    @GetMapping(path="/atualizar")
    public String atualizar(){
        return "atualizarFuncionario";
    }

    @GetMapping(path="/excluir")
    public String excluir(){
        return "excluirFuncionario";
    }
}

