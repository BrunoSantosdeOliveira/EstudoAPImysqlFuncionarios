package com.bruno.estudobancodados.Model;

import jakarta.persistence.*;


@Entity
@Table(name="Funcionario")
public class Funcionario {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;


    @Column(name="nome")
    private String nome;


    @Column(name="profissao")
    private String profissao;



}


