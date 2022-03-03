package com.company;

public class Life extends Insurance {
    public Life() {
        super("Life");
    }

    public void setCost() {
        super.cost = 48;// set cost
    }

    public void display() {
        // print details
        System.out.println(super.getType() + " insurance with monthly fee of $" + super.getCost());

    }
}