package com.seguradora.multicalculo.dto;

import lombok.Data;

@Data
public class InsuredDTO {
    private String fullName;
    private String dateOfBirth;
    private Gender gender;
    private MaritalStatus maritalStatus;
    private Address address;

}
