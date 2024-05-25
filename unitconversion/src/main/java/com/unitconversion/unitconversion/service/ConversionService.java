package com.unitconversion.unitconversion.service;

import com.unitconversion.unitconversion.dto.ConversionResponse;

public interface ConversionService
{
    ConversionResponse convertKilometersToMiles(double kilometers);
    ConversionResponse convertCelsiusToFahrenheit(double celsius);
    ConversionResponse convertKgToPounds(double kilograms);

}
