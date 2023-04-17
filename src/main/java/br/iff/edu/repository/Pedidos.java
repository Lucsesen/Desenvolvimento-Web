package br.iff.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.iff.edu.entities.Pedido;


@Repository
public interface Pedidos extends JpaRepository<Pedido, Integer > {


}