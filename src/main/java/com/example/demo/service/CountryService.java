package com.example.demo.service;

import com.example.demo.model.entity.Country;

import java.io.IOException;

public interface  CountryService {
    void seedCountries() throws IOException;

    Country findByCountryCode(String countryCode);
}
