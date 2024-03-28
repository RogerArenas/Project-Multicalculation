package com.seguradora.multicalculo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "TB_Insured")
public class Insured {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getAddress() {
        return address;
    }

    private String fullName;

    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    private String gender;

    @Column(name = "marital_status")
    private String maritalStatus;

    private String address;
}
