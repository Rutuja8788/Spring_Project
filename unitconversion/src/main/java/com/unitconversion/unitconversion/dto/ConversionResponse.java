package com.unitconversion.unitconversion.dto;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class ConversionResponse
{
    private double input;
    private double output;
}