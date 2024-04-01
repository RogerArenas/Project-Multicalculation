package com.seguradora.multicalculo.controller;

import com.seguradora.multicalculo.dto.InsuredDTO;
import com.seguradora.multicalculo.dto.InsuredResponse;
import com.seguradora.multicalculo.model.Insured;
import com.seguradora.multicalculo.service.InsuredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/insured")
public class InsuredController {

    @Autowired
    private InsuredService insuredService;

    @PostMapping()
    public ResponseEntity<InsuredResponse> createdInsured(@RequestBody Insured insured) throws Exception {
        Insured createdInsured = insuredService.createInsured(insured);
        String message = "Segurado criado com sucesso!";
        InsuredResponse response = new InsuredResponse(message, createdInsured);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")

    public ResponseEntity<Insured> getInsuredById(@PathVariable Long id) {
        Insured insured = insuredService.getInsuredById(id);
        if (insured != null) {
            return new ResponseEntity<>(insured, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Insured> updateInsured(@PathVariable Long id, @RequestBody Insured insuredDTO) {
        Optional<Insured> existingInsured = Optional.ofNullable(insuredService.getInsuredById(id));
        if (!existingInsured.isEmpty()) {
            insuredDTO.setId(id);
            Insured updateInsured = insuredService.updateInsured(insuredDTO);
            return new ResponseEntity<>(updateInsured, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Insured> deleteInsured(@PathVariable Long id) {
        Insured existingInsure = insuredService.getInsuredById(id);
        if (existingInsure != null) {
            insuredService.deleteInsured(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
