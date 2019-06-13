package com.example.demo.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CarStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String make;
    private String model;
    private String style;
    private String year;
    private String mileage;

    public CarStock(String make, String model, String style, String year, String mileage) {
        this.make = make;
        this.model = model;
        this.style = style;
        this.year = year;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "CarStock{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", style='" + style + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
    private CarStock(){

    }

    public Long getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }
}
