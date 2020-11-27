package com.company.Problem20;

import java.util.ArrayList;

public class Book {
    //region Properties
    private String title;
    private ArrayList<Author> authors;
    private double price;
    //endregion

    //region Constructors
    public Book() {
    }

    public Book( String title, ArrayList<Author> authors, double price ) {
        this.title = title;
        this.authors = authors;
        this.price = price;
    }
    //endregion

    //region Getters and Setters

    public String getTitle() {
        return title;
    }

    public void setTitle( String title ) {
        this.title = title;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors( ArrayList<Author> authors ) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice( double price ) {
        this.price = price;
    }

    //endregion
}
