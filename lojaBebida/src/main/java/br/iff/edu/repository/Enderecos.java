package br.iff.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.iff.edu.entities.Endereco;


@Repository
public interface Enderecos extends JpaRepository<Endereco, Integer > {


}