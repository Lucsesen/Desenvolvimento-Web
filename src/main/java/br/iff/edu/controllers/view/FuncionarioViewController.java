package br.iff.edu.controllers.view;

import br.iff.edu.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@Controller
@RequestMapping(path = "/Funcionario")
public class FuncionarioViewController {

    @Autowired
    FuncionarioService service;

    @PostMapping(path = "/cadastrar")
    public String cadastrar(@RequestParam(name = "nome") String nome,
                            @RequestParam(name = "salario") double salario,
                            @RequestParam(name = "setor") String setor) {
        ResponseEntity.ok().body(service.addFuncionario(nome, salario, setor));
        return "homeFuncionario";

    }

    @PutMapping(path = "/update")
    public String update(@RequestParam(name = "id") int id,
                         @RequestParam(name = "nome") String nome,
                         @RequestParam(name = "salario") double salario,
                         @RequestParam(name = "setor") String setor) {
        ResponseEntity.ok().body(service.updateFuncionario(id, nome, salario, setor));
        return "homeFuncionario";
    }

    @GetMapping(path = "/excluir")
    public String excluir(@RequestParam(name = "id") int id) {
        ResponseEntity.ok().body(service.deletarFuncionario(id));
        return "homeFuncionario";
    }

    @GetMapping(path = "/listaUsuarios")
    public String listaUsuarios(Model model) {
        model.addAttribute("funcionarios", service.getFuncionarios());
        return "listaUsuarios";
    }
}

