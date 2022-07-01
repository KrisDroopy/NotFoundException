package ru.netology.domain;

import lombok.Data;

@Data
public class Smartphone extends Product {

    protected String manufacturer;

    public Smartphone() {
    }

    public Smartphone(int id, String name, int price, String manufacturer) {
        super(id, name, price);
        this.manufacturer = manufacturer;
    }
}

