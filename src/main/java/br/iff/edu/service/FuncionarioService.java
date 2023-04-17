package br.iff.edu.service;

import br.iff.edu.entities.Cliente;
import br.iff.edu.entities.Funcionario;
import br.iff.edu.repository.FuncionariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionariosRepository rep;

    public Funcionario addFuncionario(String nome, double salario, String setor) {
        Funcionario funcionario = new Funcionario(nome, salario, setor);
        return rep.save(funcionario);
    }

    public Funcionario getFuncionario(int id) {
        Funcionario f = rep.findById(id).get();
        return f;
    }
    public String updateFuncionario(int id, String nome, double salario, String setor) {
        Optional<Funcionario> f = rep.findById(id);
        if (f.isPresent()) {
            Funcionario funcionario = f.get();
            funcionario.setNome(nome);
            funcionario.setSalario(salario);
            funcionario.setSetor(setor);
            rep.save(funcionario);
            return "Funcionário " + id + " atualizado";
        } else {
            return "Funcionário " + id + " não encontrado";
        }
    }

    public String deletarFuncionario(int id) {
        rep.deleteById(id);
        return "Funcionário deletado";
    }
    
    public List<Funcionario> getFuncionarios(){
    	return rep.findAll();
    }
}
