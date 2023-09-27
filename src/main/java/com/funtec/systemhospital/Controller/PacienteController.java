package com.funtec.systemhospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.funtec.systemhospital.model.Paciente;
import com.funtec.systemhospital.repository.PacienteRepository;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRepository;

    // Retorna lista de pacientes
    @GetMapping()
    public List<Paciente> getAllPaciente() {
        return pacienteRepository.findAll();
    }

    // Cria um novo paciente
    @PostMapping("/post")
    public ResponseEntity<Paciente> createPaciente(@RequestBody Paciente paciente) {
        try {
            Paciente newPaciente = pacienteRepository.save(paciente);
            return new ResponseEntity<>(newPaciente, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
