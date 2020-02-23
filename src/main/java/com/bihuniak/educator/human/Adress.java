package com.bihuniak.educator.human;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class Adress {
    private String street;
    private String city;
    private String country;
    private String postCode;
//    @Embedded
//    private BuildingNumber buildingNumber;

    public Adress(String street, String city, String country, String postCode) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.postCode = postCode;
//        this.buildingNumber = buildingNumber;
    }

    public Adress() {
    }
}
