package org.example.library.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {
    private int id;
    @NotEmpty(message="Title of book should not be empty")
    @Size(min=1,max=100,message="Title of book should be between 1 and 100 symbols size")
    private String title;
    @NotEmpty(message="Name of author should not be empty")
    @Size(min=2,max=100,message="Name of author should be between 2 and 100 letters size")
    private String author;
    @Min(value=1450, message="Year should be more than 1450")
    private int yearOfProduction;
    public Book(){

    }

    public Book(String title, String author, int yearOfProduction) {
        this.title = title;
        this.author = author;
        this.yearOfProduction = yearOfProduction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
}
