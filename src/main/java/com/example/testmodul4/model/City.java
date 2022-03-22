package com.example.testmodul4.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    @Min(value = 1, message = " is a positive number")
    private double acreage;

    @NotNull
    @Min(value = 1, message = " is a positive number")
    @Pattern(regexp = "(^$|[0-9]{1,20})" , message = "must be number")
    private String population;

    @NotNull
    @Min(value = 1, message = " is a positive number")
    @Pattern(regexp = "(^$|[0-9]{1,20})" , message = "must be number")
    private String gdp;

    @NotNull
    private String description;

    @ManyToOne
    private Country country;

    public City() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return acreage;
    }

    public void setArea(double area) {
        this.acreage = area;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getGdp() {
        return gdp;
    }

    public void setGdp(String gdp) {
        this.gdp = gdp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
