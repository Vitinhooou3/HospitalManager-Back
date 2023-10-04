package com.funtec.systemhospital.model;

import jakarta.persistence.*;

@Entity
@Table(name = "leito")
public class Leito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Usar GenerationType.IDENTITY para autoincremento em Postgres
    private Long id;

    private boolean disponivel;

    // Chaves estrangeiras

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_id_paciente", referencedColumnName = "id",unique = true)
    private Paciente paciente;

    @Column(name = "fk_id_paciente", insertable = false, updatable = false)
    private Long id_paciente;


    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_id_medico", referencedColumnName = "id", unique = true)
    private Medico medico;

    @Column(name = "fk_id_medico", insertable = false, updatable = false)
    private Long id_Medico;


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
    public Long getId() {
        return id;
    }

    public void setId(Long id_leito) {
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

    public Long getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Long id_paciente) {
        this.id_paciente = id_paciente;
    }

    public Long getId_Medico() {
        return id_Medico;
    }

    public void setId_Medico(Long id_Medico) {
        this.id_Medico = id_Medico;
    }
    
}
