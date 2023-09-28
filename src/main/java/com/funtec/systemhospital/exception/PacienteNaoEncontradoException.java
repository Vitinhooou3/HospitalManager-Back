package com.funtec.systemhospital.exception;

public class PacienteNaoEncontradoException extends RuntimeException {

    private Long idPaciente;

    public PacienteNaoEncontradoException(Long idPaciente) {
        super("Paciente com ID " + idPaciente + " não encontrado");
        this.idPaciente = idPaciente;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

}
