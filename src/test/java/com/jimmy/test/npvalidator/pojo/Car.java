package com.jimmy.test.npvalidator.pojo;

import com.jimmy.npvalidator.NpNotBlank;

public class Car {

    @NpNotBlank(message = "brand is null")
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
