package com.example.demo.init;

import com.example.demo.service.CountryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {
  private final CountryService countryService;

    public CommandLineRunnerImpl(CountryService countryService) {
        this.countryService = countryService;
    }

    @Override
    public void run(String... args) throws Exception {
        seedData();
    }

    private void seedData() throws IOException {
        countryService.seedCountries();
    }
}
