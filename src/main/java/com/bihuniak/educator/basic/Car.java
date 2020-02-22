package com.bihuniak.educator.basic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {

    public Car(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;

    private String model;



    private String brand;
    private double engineCapacity;
    private int wheels;
    private boolean secondHand;

    public Car(String model, String brand, double engineCapacity, int wheels, boolean secondHand) {
        this.model = model;
        this.brand = brand;
        this.engineCapacity = engineCapacity;
        this.wheels = wheels;
        this.secondHand = secondHand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", wheels=" + wheels +
                ", secondHand=" + secondHand +
                '}';
    }

    public Car() {

    }
}