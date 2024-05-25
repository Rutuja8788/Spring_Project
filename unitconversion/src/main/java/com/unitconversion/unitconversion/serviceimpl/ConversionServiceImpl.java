package com.unitconversion.unitconversion.serviceimpl;


import com.unitconversion.unitconversion.dto.ConversionResponse;
import com.unitconversion.unitconversion.service.ConversionService;
import org.springframework.core.convert.ConversionException;
import org.springframework.stereotype.Service;

@Service
public class ConversionServiceImpl implements ConversionService
{

    @Override
    public ConversionResponse convertKilometersToMiles(double kilometers)
    {
        if (kilometers < 0)
        {
            throw new ConversionException("Kilometers cannot be negative") {
            };
        }
        double miles = kilometers * 0.621371;
        return new ConversionResponse(kilometers, miles);
    }

    @Override
    public ConversionResponse convertCelsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return new ConversionResponse(celsius, fahrenheit);
    }

    @Override
    public ConversionResponse convertKgToPounds(double kilograms) {
        double pounds = kilograms * 2.20462;
        return new ConversionResponse(kilograms, pounds);
    }


}