package com.funtec.systemhospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.funtec.systemhospital.model.Medico;
import com.funtec.systemhospital.repository.MedicoRepository;

@RestController
@RequestMapping("/medicos")
@CrossOrigin("*")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    // Retorna lista de médicos
    @GetMapping()
    public List<Medico> getAllMedico() {
        return medicoRepository.findAll();
    }

    // Cria um novo médico
    @PostMapping("/post")
    public ResponseEntity<Medico> createMedico(@RequestBody Medico medico) {
        try {
            Medico newMedico = medicoRepository.save(medico);
            return new ResponseEntity<>(newMedico, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
