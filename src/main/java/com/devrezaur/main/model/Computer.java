package com.devrezaur.main.model;

import jakarta.annotation.PreDestroy;

public class Computer {

    private String brand;
    private String model;
    private Supplier supplier;

    public Computer() {
        System.out.println("No arg constructor called - Computer.java");
    }

    public Computer(String brand, String model, Supplier supplier) {
        System.out.println("All arg constructor called - Computer.java");
        this.brand = brand;
        this.model = model;
        this.supplier = supplier;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public void printDetails() {
        System.out.println("The model of this computer is " + model + ". And it is made by " + brand);
        supplier.printDetails();
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Object is being destroyed - Computer.java");
    }
}
