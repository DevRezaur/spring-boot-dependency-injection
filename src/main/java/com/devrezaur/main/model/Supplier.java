package com.devrezaur.main.model;

import jakarta.annotation.PreDestroy;

public class Supplier {

    private String name;
    private String country;

    public Supplier() {
        System.out.println("No arg constructor called - Supplier.java");
    }

    public Supplier(String name, String country) {
        System.out.println("All arg constructor called - Supplier.java");
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void printDetails() {
        System.out.println("The supplier name is " + name + " . And they are from " + country);
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Object is being destroyed - Supplier.java");
    }
}
