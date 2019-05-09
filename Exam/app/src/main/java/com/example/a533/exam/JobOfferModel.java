package com.example.a533.exam;

public class JobOfferModel {
    private String title;
    private String description;
    private Number salary;

    public JobOfferModel(String title, String description, Number salary) {
        this.title = title;
        this.description = description;
        this.salary = salary;
    }

    public JobOfferModel() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Number getSalary() {
        return salary;
    }

    public void setSalary(Number salary) {
        this.salary = salary;
    }
}
