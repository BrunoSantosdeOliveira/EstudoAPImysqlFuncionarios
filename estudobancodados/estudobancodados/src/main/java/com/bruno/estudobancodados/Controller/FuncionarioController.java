package com.bruno.estudobancodados.Controller;

import com.bruno.estudobancodados.Model.Funcionario;
import com.bruno.estudobancodados.Repo.FuncionarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuncionarioController {
    @Autowired
    private FuncionarioRepo repo;

    public FuncionarioController(FuncionarioRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/funcionarios")
    public java.util.List<Funcionario> recuperarTudo(){
        return (java.util.List<Funcionario>) repo.findAll();
    }
    @GetMapping("/teste")
    public String exibir() {
        return "Meu Springboot funciona";

    }
}






