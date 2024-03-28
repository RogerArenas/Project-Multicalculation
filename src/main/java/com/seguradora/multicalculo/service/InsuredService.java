package com.seguradora.multicalculo.service;

import com.seguradora.multicalculo.exception.dataNotFoundException;
import com.seguradora.multicalculo.model.Insured;
import com.seguradora.multicalculo.repository.InsuredRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Log4j2
public class InsuredService {

    @Autowired
    private InsuredRepository insuredRepository;

    public InsuredService(InsuredRepository insuredRepository) {
        this.insuredRepository = insuredRepository;
    }

    public Insured createInsured(Insured insured) throws Exception {
        if(insured == null){
                throw new Exception("Dados não podem ser nullos!!");
            }
            insuredRepository.save(insured);

            return insured;
    }

    public Insured getInsuredById(Long id) {
        Optional<Insured> optionalInsured = insuredRepository.findById(id);
        return optionalInsured.orElse(null);
    }

    public Insured updateInsured(Insured insured) {
        if(insuredRepository.existsById(insured.getId())){
            return insuredRepository.save(insured);
        }else {
            throw new dataNotFoundException("Insured not found in the database");
        }
    }
}
