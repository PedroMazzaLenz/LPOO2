package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.List;

@Entity(name = "Motorista")
@Table(name = "Motoristas")
public class Motorista extends Pessoa {
    private String numeroCNH;

    //Um Motorista de carro pode estar associados a vários alugueis
    @OneToMany(mappedBy = "motorista")
    private List<Aluguel> alugueis;

    public Motorista(Long id, String nome, LocalDate dataNascimento, String cpf, Sexo sexo, String numeroCNH, List<Aluguel> alugueis) {
        super(id, nome, dataNascimento, cpf, sexo);
        this.numeroCNH = numeroCNH;
        this.alugueis = alugueis;
    }
    public Motorista() {

    }

    public String getNumeroCNH() {
        return numeroCNH;
    }

    public void setNumeroCNH(String numeroCNH) {
        this.numeroCNH = numeroCNH;
    }

    public List<Aluguel> getAlugueis() {
        return alugueis;
    }

    public void setAlugueis(List<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }
}
