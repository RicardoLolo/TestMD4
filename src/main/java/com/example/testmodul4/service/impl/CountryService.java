package com.example.testmodul4.service.impl;


import com.example.testmodul4.model.Country;
import com.example.testmodul4.repository.ICountryRepository;
import com.example.testmodul4.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService implements ICountryService {
    @Autowired
    private ICountryRepository ICountryRepository;

    @Override
    public Iterable<Country> findAll() {
        return ICountryRepository.findAll();
    }
}
