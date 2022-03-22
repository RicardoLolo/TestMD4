package com.example.testmodul4.repository;


import com.example.testmodul4.model.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICityRepository extends PagingAndSortingRepository<City, Long> {
    Page<City> findAllByNameContaining(String name, Pageable pageable);
}

