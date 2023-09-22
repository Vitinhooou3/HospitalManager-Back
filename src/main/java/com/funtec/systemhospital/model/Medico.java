package com.funtec.systemhospital.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Medico")
public class Medico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nome")
    private String nome;

    @OneToMany(mappedBy = "medico")
    private List<Leito> leitos = new ArrayList<Leito>();

    @Column(name="Especialidade")
    private String especialidade;


    public Medico(){

    }

    public Medico(int id, String nome, String especialidade){
        super();
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    
}
