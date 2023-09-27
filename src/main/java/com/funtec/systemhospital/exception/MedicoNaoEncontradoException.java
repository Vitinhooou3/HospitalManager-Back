package com.funtec.systemhospital.exception;

public class MedicoNaoEncontradoException extends RuntimeException {

    private Long idMedico;

    public MedicoNaoEncontradoException(Long idMedico) {
        super("Médico com ID " + idMedico + " não encontrado");
        this.idMedico = idMedico;
    }

    public Long getIdMedico() {
        return idMedico;
    }

}

