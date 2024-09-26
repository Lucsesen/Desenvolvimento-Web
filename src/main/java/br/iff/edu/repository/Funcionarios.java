package br.iff.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.iff.edu.entities.Funcionario;


@Repository
public interface Funcionarios extends JpaRepository<Funcionario, Integer > {


}