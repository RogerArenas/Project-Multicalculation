package com.seguradora.multicalculo.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class InsuredDTO {

        private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String fullName;
        private String dateOfBirth;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public Address getAddress() {
        return address;
    }

    private Gender gender;

    public InsuredDTO(Long id, String fullName, String dateOfBirth, Gender gender, MaritalStatus maritalStatus, Address address) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.address = address;
    }

    private MaritalStatus maritalStatus;
    private Address address;

}
