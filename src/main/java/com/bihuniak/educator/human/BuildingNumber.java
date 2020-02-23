package com.bihuniak.educator.human;

import javax.persistence.Embeddable;

@Embeddable
public class BuildingNumber {
    public BuildingNumber(int buildingNumber, int houseNubmber) {
        this.buildingNumber = buildingNumber;
        this.houseNubmber = houseNubmber;
    }
    public BuildingNumber(){

    }

    private int buildingNumber;
    private int houseNubmber;
}
