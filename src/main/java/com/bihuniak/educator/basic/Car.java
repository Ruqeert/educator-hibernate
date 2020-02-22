package com.bihuniak.educator.basic;

import javax.persistence.*;

@Entity
public class Car {

    public Car(int id) {
        this.id = id;
    }

    @Basic (optional = false)
    private long id;
    @Access(value = AccessType.PROPERTY)
    private String model;
    private String brand;
    @Column(name = "pojemnosc")
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
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public boolean isSecondHand() {
        return secondHand;
    }

    public void setSecondHand(boolean secondHand) {
        this.secondHand = secondHand;
    }

    public Car() {

    }
}