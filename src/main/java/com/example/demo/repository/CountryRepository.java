package com.example.demo.repository;

import com.example.demo.model.dto.CountryDto;
import com.example.demo.model.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {
    @Query("select c from Country c where c.countryCode=:countryCode")
    Optional<Country> findByCountryCode(String countryCode);
}
