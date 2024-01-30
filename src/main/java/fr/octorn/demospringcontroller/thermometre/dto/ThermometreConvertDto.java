package fr.octorn.demospringcontroller.thermometre.dto;

import lombok.Data;

@Data
public class ThermometreConvertDto {
    private double value;
    private String unit;
}
