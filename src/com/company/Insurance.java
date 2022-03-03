package com.company;

public abstract class Insurance {
    protected String type;
    protected double cost;
    public Insurance(String lh){
        this.type=lh;//assigns string
    }
    public String getType()
    {
        return this.type;//return insurance type
    }
    public double getCost()
    {
        return this.cost;//return insurance cost
    }
    public abstract void setCost();
    public abstract void display();
}
