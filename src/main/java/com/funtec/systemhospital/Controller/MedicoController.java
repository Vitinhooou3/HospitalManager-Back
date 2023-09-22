package com.funtec.systemhospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.funtec.systemhospital.model.Medico;
import com.funtec.systemhospital.repository.MedicoRepository;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    public List<Medico> getAllMedico(){
       
        return medicoRepository.findAll();

    }

}
