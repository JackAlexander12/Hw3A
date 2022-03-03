package com.company;

public class Health extends Insurance {
    public Health() {
        super("Health");
    }

    public void setCost() {
        super.cost = 176;// set cost
    }

    public void display() {
        // print details
        System.out.println(super.getType() + " insurance with monthly fee of $" + super.getCost());
    }
}