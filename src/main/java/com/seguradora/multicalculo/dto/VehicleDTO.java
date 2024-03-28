package com.seguradora.multicalculo.dto;

import lombok.Data;

@Data
public class VehicleDTO {
    private String brand;
    private String model;
    private int manufactureYear;
    private String plate;
    private String chassis;
    private double marketValue;

}