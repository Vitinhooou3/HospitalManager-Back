package com.funtec.systemhospital.model;

import jakarta.persistence.*;

@Entity
public class Leito {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private boolean disponivel;

  
    @OneToOne(targetEntity = Paciente.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private Paciente paciente;


    @ManyToOne(targetEntity = Medico.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    private Medico medico;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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


    public boolean getDisponivel() {
        return false;
    }


}
