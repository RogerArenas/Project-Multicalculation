package com.seguradora.multicalculo.dto;

import com.seguradora.multicalculo.model.Insured;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class InsuredResponse {

    private String message;
    private Insured insured;

    public InsuredResponse(String message, Insured createdInsured, HttpStatus created) {
        this.message = message;
        this.insured = createdInsured;
    }
}
