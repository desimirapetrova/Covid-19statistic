package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class RestSpringBootController {

    @GetMapping(value = "/countries")
    public String getCountries(){
        String url="https://api.covid19api.com/summary";
        RestTemplate restTemplate=new RestTemplate();

        String countries=restTemplate.getForObject(url,String.class) ;
    return countries;
    }
}
