package com.example.demo.model.dto;

import com.google.gson.annotations.Expose;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CountryDto {
    @Expose
    private String ID;
    @Expose
    private String Country;
    @Expose
    private String CountryCode;
    @Expose
    private String Slug;
    @Expose
    private Integer NewConfirmed;
    @Expose
    private Integer TotalConfirmed;
    @Expose
    private Integer NewDeaths;
    @Expose
    private Integer TotalDeaths;
    @Expose
    private Integer NewRecovered;
    @Expose
    private Integer TotalRecovered;
    @Expose
    private String Date;
//    private Object premium;

    public CountryDto() {
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getSlug() {
        return Slug;
    }

    public void setSlug(String slug) {
        Slug = slug;
    }

    public Integer getNewConfirmed() {
        return NewConfirmed;
    }

    public void setNewConfirmed(Integer newConfirmed) {
        NewConfirmed = newConfirmed;
    }

    public Integer getTotalConfirmed() {
        return TotalConfirmed;
    }

    public void setTotalConfirmed(Integer totalConfirmed) {
        TotalConfirmed = totalConfirmed;
    }

    public Integer getNewDeaths() {
        return NewDeaths;
    }

    public void setNewDeaths(Integer newDeaths) {
        NewDeaths = newDeaths;
    }

    public Integer getTotalDeaths() {
        return TotalDeaths;
    }

    public void setTotalDeaths(Integer totalDeaths) {
        TotalDeaths = totalDeaths;
    }

    public Integer getNewRecovered() {
        return NewRecovered;
    }

    public void setNewRecovered(Integer newRecovered) {
        NewRecovered = newRecovered;
    }

    public Integer getTotalRecovered() {
        return TotalRecovered;
    }

    public void setTotalRecovered(Integer totalRecovered) {
        TotalRecovered = totalRecovered;
    }
}
