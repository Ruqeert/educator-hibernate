package com.bihuniak.educator.Company;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Department {

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String adress;
    private int floor;

  @OneToMany(cascade = CascadeType.ALL)
//  @JoinColumn(name = "departmentId")
  private List<Employee> employee = new ArrayList<>();

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

//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }
}
