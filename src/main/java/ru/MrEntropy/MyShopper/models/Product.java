package ru.MrEntropy.MyShopper.models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

import java.awt.*;


public class Product {


    private int id;
    @NotEmpty(message = "The product name should not be empty")
    @Size(min=2, max = 30, message = "The product name must be between 2 and 30 characters long")
    private String name;
    @NotEmpty(message = "The product category should not be empty")
    private String category;
    @NotEmpty(message = "The product chapter should not be empty")
    private String chapter;
    @NotEmpty(message = "Please specify the unit of sale of the product")
    private String unit;
    @NotEmpty(message = "Please specify the price of the product")
    @Min(value = 0,message = "The price of the product cannot be negative")
    private double price;

    private String notes;
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Image[] getImages() {
        return images;
    }

    public void setImages(Image[] images) {
        this.images = images;
    }



    Image[] images;

    public Product(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }





}
