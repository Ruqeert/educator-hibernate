package com.bihuniak.educator.Company;

import javax.persistence.*;

@Entity
public class Employee {
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", position='" + position + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public Employee() {
    }

    @Id
    @GeneratedValue
    private long id;

    private String position;
    private String surname;

    @OneToOne(cascade =  CascadeType.ALL)
    private Department department;

    public Employee(String position, String surname, Department department) {
        this.position = position;
        this.surname = surname;
        this.department = department;
    }

    public Employee(String develop, String kazik_woźniak) {
    }
}
