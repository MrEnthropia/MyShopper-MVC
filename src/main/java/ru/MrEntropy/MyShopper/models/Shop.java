package ru.MrEntropy.MyShopper.models;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.URL;



public class Shop {

    public Shop(){

    }
    private int id;
    @NotEmpty(message = "The shop name should not be empty")
    @Size(min=2, max = 30, message = "The shop name must be between 2 and 30 characters long")
    private String name;
    @NotEmpty(message = "The shop type should not be empty")
    private String type;
    @NotEmpty(message = "The shop category should not be empty")
    private String category;

    private String address;
    @URL
    private String website;
    private String notes;



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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }





}
