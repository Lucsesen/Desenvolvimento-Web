package br.iff.edu.controllers.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/Produto")
public class ProdutoViewController {

    @GetMapping(path="/cadastrar")
    public String cadastrar(){
        return "cadastrarProduto";
    }

    @GetMapping(path="/atualizar")
    public String atualizar(){
        return "atualizarProduto";
    }

    @GetMapping(path="/excluir")
    public String excluir(){
        return "excluirProduto";
    }
}
