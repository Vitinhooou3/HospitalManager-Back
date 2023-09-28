package com.funtec.systemhospital.model;

import jakarta.persistence.*;

@Entity
@Table(name = "medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Use GenerationType.IDENTITY para autoincremento em Postgres
    private Long id;

    @Column(name = "nome")
    private String nome;

    @OneToOne(mappedBy = "medico", cascade = CascadeType.ALL)
    @JoinColumn(name = "medico_id")
    private Leito leito;

    @Column(name = "especialidade")
    private String especialidade;

    // Construtor vazio necessário para JPA
    public Medico() {
    }

    // Construtor com parâmetros
    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    // Métodos Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id_medico) {
        this.id = id_medico;
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
