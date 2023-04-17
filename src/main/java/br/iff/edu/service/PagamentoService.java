package br.iff.edu.service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.iff.edu.entities.Pagamento;
import br.iff.edu.repository.PagamentosRepository;
@Service
public class PagamentoService {

    @Autowired
    private PagamentosRepository rep;

    public Pagamento addPagamento(double valor, int nf, String descricao){
        Pagamento pagamento = new Pagamento(valor, nf, descricao);
        return rep.save(pagamento);
    }
/*
    // Existe mesmo a necessidade neste caso?
    public Pagamento getPagamento(int id) {
        Pagamento p = rep.findById(id).get();
        return p;
    }

    @PutMapping("/{id}")  // Existe mesmo a necessidade neste caso?
    public String updatePagamento(
            @RequestParam(name = "id") int id,
            @RequestParam(name = "valor") double valor,
            @RequestParam(name = "nf") int nf,
            @RequestParam(name = "descricao") String descricao) {
        Optional<Pagamento> pag = rep.findById(id);
        if (pag.isPresent()) {
            Pagamento pagamento = pag.get();
            pagamento.setValor(valor);
            pagamento.setNf(nf);
            pagamento.setDescricao(descricao);
            rep.save(pagamento);
            return "Pagamento " + id + " atualizado";
        } else {
            return "Pagamento " + id + " não encontrado";
        }
    }*/

    @DeleteMapping("/{id}")
    public String deletarPagamento(int id) {
        rep.deleteById(id);
        return "Pagamento " + id + " deletado";
    }

}
