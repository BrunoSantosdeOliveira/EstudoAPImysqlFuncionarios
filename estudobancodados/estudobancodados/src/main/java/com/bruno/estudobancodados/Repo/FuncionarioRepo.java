package com.bruno.estudobancodados.Repo;

import com.bruno.estudobancodados.Model.Funcionario;
import org.springframework.data.repository.CrudRepository;

public interface FuncionarioRepo extends CrudRepository<Funcionario, Integer> {

}
