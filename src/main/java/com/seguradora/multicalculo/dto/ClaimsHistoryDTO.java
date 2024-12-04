package com.seguradora.multicalculo.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ClaimsHistoryDTO {
    private Long insuredId;

    private String description;

    private Date occurrenceDate;

    // Getters and setters
}