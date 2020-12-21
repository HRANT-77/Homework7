package com.company.ex20;

public class Author {
    public enum gen {MALE, FEMALE, OTHER};
    private String name;
    private String surname;
    private gen gender;

    public Author() {
    }

    public Author(String name, String surname, Author.gen gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Author.gen getGender() {
        return gender;
    }

    public void setGender(Author.gen gender) {
        this.gender = gender;
    }
}