package com.funtec.systemhospital.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.funtec.systemhospital.model.Leito;
import com.funtec.systemhospital.repository.LeitoRepository;

import jakarta.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/leitos")
public class LeitoController {

    @Autowired
    private LeitoRepository leitoRepository;

    // Retorna lista de leitos
    @GetMapping()
    public List<Leito> getAllLeito() {
        return leitoRepository.findAll();
    }

    // Salva uma nova entidade no banco do mesmo tipo declarado
    @PostMapping("/post")
    public Leito createLeito(@RequestBody Leito leito) {
        return leitoRepository.save(leito);
    }

    // Atualiza um leito existente pelo ID
    @PutMapping("/update/{id}")
    public ResponseEntity<Leito> updateLeito(@PathVariable Long id, @RequestBody Leito leitoDetails) {
        Leito leito = leitoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Leito not found with id: " + id));
        leito.setDisponivel(leitoDetails.isDisponivel());
        Leito updatedLeito = leitoRepository.save(leito);
        return ResponseEntity.ok(updatedLeito);
    }
}
