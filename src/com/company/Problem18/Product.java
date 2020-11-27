package com.company.Problem18;

public class Product {

    //region Properties
    private String title;
    private int price;
    private int rating;

    //endregion

    //region Constructors
    public Product() {
    }

    public Product( String title, int price, int rating ) {
        this.title = title;
        this.price = price;
        this.rating = rating;
    }
    //endregion

    //region Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle( String title ) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice( int price ) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating( int rating ) {
        this.rating = rating;
    }
    //endregion
}
