package com.seguradora.multicalculo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name = "TB_InsuranceQuote")
public class InsuranceQuote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Vehicle vehicle;
    @Temporal(TemporalType.TIMESTAMP)
    private Date quoteDate;
    private char theftCoverage;
    private char collisionCoverage;
    private char thirdPartyCoverage;
    private char fireCoverage;
    private String paymentMethod;
    private Date startDate;
    private Date endDate;
}
