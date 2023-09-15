package com.devrezaur.main.model;

import jakarta.annotation.PreDestroy;

public class Programmer {

    private String name;
    private Computer computer;

    public Programmer() {
        System.out.println("No arg constructor called - Programmer.java");
    }

    public Programmer(String name, Computer computer) {
        System.out.println("All arg constructor called - Programmer.java");
        this.name = name;
        this.computer = computer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void printDetails() {
        System.out.println("Programmer " + name + " has a computer of " + computer.getBrand() + " brand ");
        this.computer.printDetails();
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Object is being destroyed - Programmer.java");
    }
}
