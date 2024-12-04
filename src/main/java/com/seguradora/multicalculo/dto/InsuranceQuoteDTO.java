package com.seguradora.multicalculo.dto;

import lombok.Data;

import java.util.Date;

@Data
public class InsuranceQuoteDTO {
    private Long insuredId;

    private Long vehicleId;

    private Date quoteDate;
    private char theftCoverage;
    private char collisionCoverage;
    private char thirdPartyCoverage;
    private char fireCoverage;
    private String paymentMethod;
    private Date startDate;
    private Date endDate;

    // Getters and setters
}