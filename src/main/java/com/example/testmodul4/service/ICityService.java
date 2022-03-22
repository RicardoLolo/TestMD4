package com.example.testmodul4.service;


import com.example.testmodul4.model.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICityService {
    Page<City> findAll(Pageable pageable);

    Page<City> findAllByName(String name,Pageable pageable);

    City findCity(Long id);

    void saveCity(City city);

    void deleteCity(Long id);
}
