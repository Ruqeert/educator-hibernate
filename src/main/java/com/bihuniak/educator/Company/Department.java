package com.bihuniak.educator.Company;

import javax.persistence.*;

@Entity
public class Department {


    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String adress;
    private int floor;

    @OneToOne(cascade =  CascadeType.ALL)
    private Employee employee;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", floor=" + floor +
                '}';
    }

    public Department(String name, String adress, int floor) {
        this.name = name;
        this.adress = adress;
        this.floor = floor;
    }

    public Department() {
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
