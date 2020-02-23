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

//    @ManyToOne(cascade = CascadeType.ALL)
    @ManyToOne
//    @JoinTable
    private Department department;

    private String position;
    private String surname;

    public Employee(String position, String surname) {
        this.position = position;
        this.surname = surname;
    }
}
