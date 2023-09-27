package com.funtec.systemhospital.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "leito")
public class Leito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Usar GenerationType.IDENTITY para autoincremento em Postgres
    private Long id;

    private boolean disponivel;

    // Chaves estrangeiras

    @OneToOne
    @JoinColumn(name = "id_paciente", referencedColumnName = "id")
    private Paciente paciente;

    @OneToOne
    @JoinColumn(name = "id_medico", referencedColumnName = "id")
    private Medico medico;

    // Construtor vazio necessário para JPA
    public Leito() {
    }

    // Construtor com parâmetros
    public Leito(boolean disponivel, Paciente paciente, Medico medico) {
        this.disponivel = disponivel;
        this.paciente = paciente;
        this.medico = medico;
    }

    // Métodos Getters and Setters
    public Long getId_leito() {
        return id;
    }

    public void setId_leito(Long id_leito) {
        this.id = id_leito;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
