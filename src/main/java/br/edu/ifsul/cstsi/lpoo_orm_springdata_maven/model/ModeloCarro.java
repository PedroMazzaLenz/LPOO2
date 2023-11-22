package br.edu.ifsul.cstsi.lpoo_orm_springdata_maven.model;

import jakarta.persistence.*;
import java.util.*;

@Entity(name = "ModeloCarro")
@Table(name = "Modelos")
public class ModeloCarro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;

    //Um modelo de carro pode estar associados a vários carros
    @OneToMany(mappedBy = "modeloCarro")
    private List<Carro> carros;

    //Contrutores
    public ModeloCarro() {
    }

    public ModeloCarro(Long id, String descricao, List<Carro> carros) {
        this.id = id;
        this.descricao = descricao;
        this.carros = carros;
    }

    //Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
}
