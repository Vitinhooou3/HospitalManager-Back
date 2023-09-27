package com.funtec.systemhospital.service;

import com.funtec.systemhospital.exception.PacienteNaoEncontradoException;
import com.funtec.systemhospital.model.Leito;
import com.funtec.systemhospital.model.Paciente;
import com.funtec.systemhospital.repository.LeitoRepository;
import com.funtec.systemhospital.repository.PacienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeitoService {

    @Autowired
    private LeitoRepository leitoRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    public Leito salvar(Leito leito) {
        // Valida o leito
    
        // Verifica se o paciente existe
        Paciente paciente = pacienteRepository.findById(leito.getId_paciente())
                .orElseThrow(() -> new PacienteNaoEncontradoException(leito.getId_paciente()));
    
        // Define o paciente do leito
        leito.setPaciente(paciente);
    
        // Salva o leito no banco de dados
        return leitoRepository.save(leito);
    }

}
