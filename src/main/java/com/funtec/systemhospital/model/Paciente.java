package com.funtec.systemhospital.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Use GenerationType.IDENTITY para autoincremento em Postgres
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private int idade;

    @Column(name = "cpf", unique = true)
    @NotNull
    private String cpf;

    @Column(name = "convenio")
    private boolean convenio;

    @Column(name = "sexo")
    private String sexo;

    @OneToOne(mappedBy = "paciente", cascade = CascadeType.ALL)
    @JoinColumn(name = "paciente_id")
    private Leito leito;

    // Construtor vazio necessário para JPA
    public Paciente() {
    }

    // Construtor com parâmetros
    public Paciente(String nome, int idade, String cpf, boolean convenio, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.convenio = convenio;
        this.sexo = sexo;
    }

    // Métodos Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id_paciente) {
        this.id = id_paciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isConvenio() {
        return convenio;
    }

    public void setConvenio(boolean convenio) {
        this.convenio = convenio;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
