package com.company.ex20;

import java.util.ArrayList;

public class Book {
    private String title;
    private double price;
    private ArrayList<Author> authors;

    public Book() {
    }

    public Book(String title, double price, ArrayList<Author> authors) {
        this.title = title;
        this.price = price;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }
}