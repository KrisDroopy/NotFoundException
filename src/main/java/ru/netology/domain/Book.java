package ru.netology.domain;

import lombok.Data;

@Data
public class Book extends Product {

    protected String author;

    public Book() {
    }

    public Book(int id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;
    }
}
