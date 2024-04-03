package com.seguradora.multicalculo.controller;

import com.seguradora.multicalculo.dto.InsuredResponse;
import com.seguradora.multicalculo.model.Insured;
import com.seguradora.multicalculo.service.InsuredService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class InsuredControllerTest {

    @Mock
    private InsuredService insuredService;

    @InjectMocks
    private InsuredController insuredController;

    @Test
    void createdInsured() throws Exception {
        // Mocking
        Insured insured = new Insured();

        Insured createdInsured = new Insured();

        String message = "Segurado criado com sucesso!";
        InsuredResponse response = new InsuredResponse(message, createdInsured, HttpStatus.CREATED);

        ResponseEntity<InsuredResponse> expectedResponse = new ResponseEntity<>(response, HttpStatus.CREATED);

        when(insuredService.createInsured(insured)).thenReturn(createdInsured);

        // Execution

        ResponseEntity<InsuredResponse> actualResponse = insuredController.createdInsured(insured);

        // Assertion
        assertEquals(expectedResponse, actualResponse);

        verify(insuredService, times(1)).createInsured(insured);
    }

    @Test
    void getInsuredById() {
    }

    @Test
    void updateInsured() {
    }

    @Test
    void deleteInsured() {
    }
}