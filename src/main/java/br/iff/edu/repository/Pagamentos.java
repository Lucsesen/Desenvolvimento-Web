package br.iff.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.iff.edu.entities.Pagamento;


@Repository
public interface Pagamentos extends JpaRepository<Pagamento, Integer > {


}