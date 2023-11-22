package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity(name = "Funcionario")
@Table(name = "funcionarios")
//A classe funcionarios é uma subclasse de pessoa
public class Funcionario extends Pessoa {
    private String matricula;

    //Construtores
    public Funcionario() {
    }

    public Funcionario(Long id, String nome, LocalDate dataNascimento, String cpf, Sexo sexo, String matricula) {
        super(id, nome, dataNascimento, cpf, sexo);
        this.matricula = matricula;
    }

    //Getters e Setters
    public Funcionario(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}