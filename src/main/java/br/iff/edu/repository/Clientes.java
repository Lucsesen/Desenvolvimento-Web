package br.iff.edu.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.iff.edu.entities.Cliente;
import jakarta.persistence.EntityManager;

@Repository
public interface Clientes extends JpaRepository<Cliente, Integer > {


}

/*	@Autowired
private EntityManager adm;


@Transactional
public Cliente  salvar(Cliente cliente) {
	adm.persist(cliente);
	return cliente;
}

@Transactional
public Cliente atualizar(Cliente cliente) {
	adm.merge(cliente);
	return cliente;
}

*/