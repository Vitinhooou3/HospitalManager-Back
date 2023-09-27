package com.funtec.systemhospital.Controller;

import com.funtec.systemhospital.model.Leito;
import com.funtec.systemhospital.repository.LeitoRepository;
import com.funtec.systemhospital.service.LeitoService;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leitos")
public class LeitoController {

    @Autowired
    private LeitoRepository leitoRepository;

    @Autowired
    private LeitoService leitoService;

    // Retorna lista de leitos
    @GetMapping()
    public List<Leito> getAllLeito() {
        return leitoRepository.findAll();
    }

    // Salva uma nova entidade no banco do mesmo tipo declarado

    // injeta uma instância do LeitoService.java na sua classe controladora
    @PostMapping("/post")
    public Leito salvar(@Validated @RequestBody Leito leito) {
        // Salva o leito no banco de dados
        return leitoService.salvar(leito);
    }


    // Atualiza um leito existente pelo ID
    @PutMapping("/update/{id}")
    public ResponseEntity<Leito> updateLeito(@PathVariable Long id, @RequestBody Leito leitoDetails) {
        Leito leito = leitoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Leito not found with id: " + id));
        leito.setDisponivel(leitoDetails.isDisponivel());
        leito.setPaciente(leitoDetails.getPaciente());
        Leito updatedLeito = leitoRepository.save(leito);
        return ResponseEntity.ok(updatedLeito);
    }
}
