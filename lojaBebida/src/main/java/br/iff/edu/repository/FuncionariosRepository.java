package br.iff.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.iff.edu.entities.Funcionario;


@Repository
public interface FuncionariosRepository extends JpaRepository<Funcionario, Integer > {


}