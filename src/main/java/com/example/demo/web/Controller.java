package com.example.demo.web;

import com.example.demo.model.entity.Country;
import com.example.demo.service.CountryService;
import com.google.gson.Gson;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final CountryService countryService;

    public Controller(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/country/{countryCode}")
    @ResponseStatus(HttpStatus.OK)
    public String getInfo(@PathVariable String countryCode){
        Country countryInfo=countryService.findByCountryCode(countryCode);
        if (countryInfo==null){
            return "Country with this country code doesn't exist.";
        }
        return  new Gson().toJson(countryInfo);
    }
}
