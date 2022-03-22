package com.example.testmodul4.service.impl;


import com.example.testmodul4.model.City;
import com.example.testmodul4.repository.ICityRepository;
import com.example.testmodul4.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CityService implements ICityService {
    @Autowired
    private ICityRepository iCityRepository;

    @Override
    public Page<City> findAll(Pageable pageable) {
        return iCityRepository.findAll(pageable);
    }

    @Override
    public Page<City> findAllByName(String name, Pageable pageable) {
        return iCityRepository.findAllByNameContaining(name, pageable);
    }

    @Override
    public City findCity(Long id) {
        return iCityRepository.findById(id).orElse(null);
    }

    @Override
    public void saveCity(City city) {
        iCityRepository.save(city);
    }

    @Override
    public void deleteCity(Long id) {
        iCityRepository.deleteById(id);
    }
}