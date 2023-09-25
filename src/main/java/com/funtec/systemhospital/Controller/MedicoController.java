package com.funtec.systemhospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.funtec.systemhospital.model.Medico;
import com.funtec.systemhospital.repository.MedicoRepository;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @GetMapping("/medicos")
    public List<Medico> getAllMedico(){
        return medicoRepository.findAll();
    }

    @PostMapping("/medicos")
    public Medico createMedico(@RequestBody Medico medico){
        return medicoRepository.save(medico);
    }


}
