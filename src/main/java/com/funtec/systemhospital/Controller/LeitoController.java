package com.funtec.systemhospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.funtec.systemhospital.model.Leito;
import com.funtec.systemhospital.repository.LeitoRepository;

import jakarta.persistence.EntityNotFoundException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RequestMapping("/leitos")
@RestController
public class LeitoController {

    @Autowired
    private LeitoRepository leitoRepository;


    //Retorna lista de leitos
    @GetMapping("/lista-leitos")
    public List<Leito> getAllLeito(){
        return leitoRepository.findAll();
    }

    //Salva uma nova entidade no banco do mesmo tipo declarado
    @PostMapping("/post-leito")
    public Leito createLeito(@RequestBody Leito leito) {
        return leitoRepository.save(leito);
    }

    @PutMapping("/update-leito")
    public ResponseEntity<Leito> updateLeito(@PathVariable Long id, @RequestBody Leito leitoDetails){
        Leito leito = leitoRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Employee not exist with id :" + id));
        leito.setDisponivel(leitoDetails.getDisponivel());
        Leito updateLeito = leitoRepository.save(leito);
        return ResponseEntity.ok(updateLeito);
    }


}
