package com.example.demo.service.impl;

import com.example.demo.constants.GlobalConstants;
import com.example.demo.model.dto.CountryDto;
import com.example.demo.model.entity.Country;
import com.example.demo.repository.CountryRepository;
import com.example.demo.service.CountryService;
import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;

import static java.nio.file.Files.readString;

@Service
public class CountryServiceImpl implements CountryService {
    private static final String COUNTRIES_FILE_NAME="countries.json";

    private final Gson gson;
    private final CountryRepository countryRepository;
    private final ModelMapper modelMapper;


    public CountryServiceImpl(Gson gson, CountryRepository countryRepository, ModelMapper modelMapper) {
        this.gson = gson;
        this.countryRepository = countryRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void seedCountries() throws IOException {
        if(countryRepository.count()==0) {
            Arrays.stream(gson.fromJson(readString(Path.of(GlobalConstants.RESOURCE_FILE_PATH + COUNTRIES_FILE_NAME)),
                    CountryDto[].class))
                    .map(countryDto -> modelMapper.map(countryDto, Country.class))
                    .forEach(countryRepository::save);
        }

    }

    @Override
    public Country findByCountryCode(String countryCode) {
        if(countryCode.toUpperCase()==countryCode) {
            return countryRepository.findByCountryCode(countryCode).orElse(null);
        }
        return null;
    }
}
