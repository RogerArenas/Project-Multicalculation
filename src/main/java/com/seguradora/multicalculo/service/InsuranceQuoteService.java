package com.seguradora.multicalculo.service;

import com.seguradora.multicalculo.model.InsuranceQuote;
import com.seguradora.multicalculo.repository.InsuranceQuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsuranceQuoteService {

    @Autowired
    private InsuranceQuoteRepository insuranceQuoteRepository;

    public InsuranceQuote createInsuredQuote(InsuranceQuote insuranceQuote){
        return insuranceQuoteRepository.save(insuranceQuote);
    }


}
