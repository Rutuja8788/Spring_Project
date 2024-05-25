package com.unitconversion.unitconversion.controller;

import com.unitconversion.unitconversion.dto.ConversionResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionException;
import com.unitconversion.unitconversion.service.ConversionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class     ConversionController
{
    @Autowired
    private ConversionService conversionService;

    @GetMapping("kilometersToMiles")
    public ResponseEntity<?> convertKilometersToMiles(@RequestParam double kilometers)
    {

        try
        {
            ConversionResponse response = conversionService.convertKilometersToMiles(kilometers);
            return ResponseEntity.ok(response);

        }
        catch (ConversionException e)
        {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping("celsiusToFahrenheit")
    public ResponseEntity<?> convertCelsiusToFahrenheit(@RequestParam double celsius)
    {
        ConversionResponse response = conversionService.convertCelsiusToFahrenheit(celsius);
        return ResponseEntity.ok(response);
    }

    @GetMapping("kgToPounds")
    public ResponseEntity<?> convertKgToPounds(@RequestParam double kilograms)
    {
        ConversionResponse response = conversionService.convertKgToPounds(kilograms);
        return ResponseEntity.ok(response);
    }
}
