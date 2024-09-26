package br.iff.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.iff.edu.entities.Produto;


@Repository
public interface ProdutosRepository extends JpaRepository<Produto, Integer > {


}