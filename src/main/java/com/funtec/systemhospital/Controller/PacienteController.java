package com.funtec.systemhospital.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.funtec.systemhospital.model.Paciente;
import com.funtec.systemhospital.repository.PacienteRepository;



@RestController
@RequestMapping("api/paciente")
public class PacienteController {
    @Autowired
    private PacienteRepository pacienteRepository;


    //Retorna lista de pacientes no banco
    @GetMapping("/pacientes")
    public List<Paciente> getAllPaciente(){
        return pacienteRepository.findAll();
    }

    
    @PostMapping("/pacientes")
    public Paciente createPaciente(@RequestBody Paciente paciente){
        return pacienteRepository.save(paciente);
    }





}
