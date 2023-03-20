package br.iff.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.iff.edu.entities.Cliente;

@Repository
public interface ClientesRepository extends JpaRepository<Cliente, Integer > {


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