package com.seguradora.multicalculo.dto;

import com.seguradora.multicalculo.model.Insured;
import lombok.Data;

@Data
public class InsuredResponse {

    private String message;
    private Insured insured;

    public InsuredResponse(String message, Insured createdInsured) {
        this.message = message;
        this.insured = createdInsured;
    }
}
