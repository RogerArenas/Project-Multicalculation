package com.seguradora.multicalculo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
@Entity
@Table(name = "TB_ClaimsHistory")
public class ClaimsHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private Insured insured;
    private String description;
    private Date occurrenceDate;
}
