package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity(name = "Carro")
@Table(name = "carros")
public class Carro {
    //Id é a chave primária e é gerado um valor para ela atraves do autoincremento
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String placa;
    private String chassi;
    private String cor;
    private BigDecimal valorDiaria;

    //Um carro pode estar associados a vários alugueis
    @OneToMany(mappedBy = "carro")
    private List<Aluguel> alugueis;

    //Muitos carros podem estar associado a um unico modelo
    @ManyToOne
    @JoinColumn(name = "Modelo_id")
    private ModeloCarro modeloCarro;


    //Construtores
    public Carro(Long id, String placa, String chassi, String cor, BigDecimal valorDiaria, List<Aluguel> alugueis) {
        this.id = id;
        this.placa = placa;
        this.chassi = chassi;
        this.cor = cor;
        this.valorDiaria = valorDiaria;
        this.alugueis = alugueis;
    }

    public Carro() {

    }


    //Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public BigDecimal getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(BigDecimal valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public List<Aluguel> getAlugueis() {
        return alugueis;
    }

    public void setAlugueis(List<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }
}
