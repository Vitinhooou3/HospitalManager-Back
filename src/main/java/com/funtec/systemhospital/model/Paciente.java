package com.funtec.systemhospital.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Table(name="Pacientes")
@Component
public class Paciente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nome")
    private String nome;

    @Column(name="idade")
    private int idade;

    @Column(name="cpf",unique = true)
    private String cpf;

    @Column(name = "convenio")
    private boolean convenio;

    @Column(name = "sexo")
    private String sexo;
    public Paciente(){

    }

    public Paciente(String nome, int idade, String cpf, boolean convenio, String sexo){
        super();
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.convenio = convenio;
        this.sexo = sexo;

    }

    public long getId() {
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

    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public void getSexo(String sexo){
        this.sexo = sexo;
    }
}
