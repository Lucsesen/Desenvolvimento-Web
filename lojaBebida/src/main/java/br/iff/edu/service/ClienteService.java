package br.iff.edu.service;

import br.iff.edu.entities.Cliente;
import br.iff.edu.entities.Endereco;
import br.iff.edu.repository.ClientesRepository;
import br.iff.edu.repository.EnderecosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClientesRepository rep;
    @Autowired
    private EnderecosRepository endRep;

    public Cliente addCliente(String nome, String cpf, String rua, int numero, String bairro, String cep, String cidade){
        Endereco endereco = new Endereco(rua, numero, bairro, cep, cidade);
        endRep.save(endereco);
        Cliente cliente = new Cliente(nome, cpf, endereco);
        return rep.save(cliente);
    }

    public Cliente getCliente(int id) {
        Cliente c = rep.findById(id).get();
        return c;
    }

    public String updateCliente(int id, String nome, String cpf, String rua, int numero, String bairro, String cep, String cidade) {
        Optional<Cliente> c = rep.findById(id);
        if (c.isPresent()) {
            Cliente cliente = c.get();
            cliente.setNome(nome);
            cliente.setCpf(cpf);
            Endereco endereco = cliente.getEndereco();
            endereco.setRua(rua);
            endereco.setNumero(numero);
            endereco.setBairro(bairro);
            endereco.setCep(cep);
            endereco.setCidade(cidade);
            rep.save(cliente);
            return "Cliente " + id + " atualizado";
        } else {
            return "Cliente " + id + " não encontrado";
        }
    }

    public String deletarCliente(int id) {
        rep.deleteById(id);
        return "Cliente" + id + " deletado";
        
    }
    
    public List<Cliente> getClientes(){
    	return rep.findAll();
    }
}
