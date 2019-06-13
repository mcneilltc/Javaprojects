package com.example.demo.Domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<CarStock, Long> {
List<CarStock>findByMake(String make);
    List<CarStock>findByModel(String model);
    List<CarStock>findByStyle(String style);
    List<CarStock>findByYear(String year);
    List<CarStock>findByMileage(String mileage);
}
