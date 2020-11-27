package com.company.Problem20;

enum Gender {
    Male,
    Female
}

public class Author {
    //region Properties
    private String name;
    private String surname;
    private Gender gender;
    //endregion

    //region Constructors
    public Author(  ) {
    }

    public Author( String name, String surname, Gender gender ) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }
    //endregion

    //region Getters and Setters

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname( String surname ) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender( Gender gender ) {
        this.gender = gender;
    }

    //endregion
}
