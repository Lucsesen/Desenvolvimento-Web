package br.iff.edu.service;

import br.iff.edu.entities.Produto;
import br.iff.edu.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Service
public class ProdutoService {
    @Autowired
    private ProdutosRepository rep;

    public String addProduto(String nome, String codBarras, double precoVenda, double precoCusto){
        Produto produto = new Produto(nome, codBarras, precoCusto, precoVenda);
        rep.save(produto);
        return "Produto " + nome + " adicionado.";
    }

    public Produto getProduto(int id) {
        Produto produto = rep.findById(id).get();
        return produto;
    }

    public String updateProduto(int id, String nome, String codBarras, double precoVenda, double precoCusto) {
        Optional<Produto> optionalProduto = rep.findById(id);
        if (optionalProduto.isPresent()) {
            Produto produto = optionalProduto.get();
            produto.setNome(nome);
            produto.setCodBarras(codBarras);
            produto.setPrecoCusto(precoCusto);
            produto.setPrecoVenda(precoVenda);
            rep.save(produto);
            return "Produto " + id + " atualizado";
        } else {
            return "Produto " + id + " não encontrado";
        }
    }

    public String deletarProduto(int id) {
        rep.deleteById(id);
        return "Produto " + id + " deletado";
    }
}
