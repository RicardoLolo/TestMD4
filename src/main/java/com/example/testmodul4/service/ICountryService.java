package com.example.testmodul4.service;


import com.example.testmodul4.model.Country;

public interface ICountryService {
    Iterable<Country> findAll();
}
