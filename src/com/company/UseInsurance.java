//Jack Alexander
//3/2/2022
//Program#1
//This program displays life and health insurance rates depending on what's chosen
package com.company;
import java.util.*;

public class UseInsurance {

    public static void main(String args[]) {
        //creating object of Scanner class
        Scanner input = new Scanner(System.in);
        int insurance;
        //asking user type of insurance
        System.out.println("Enter 1 for Life Insurance or 2 for Health Insurance");
        String userInput = input.next();//reading user choice
        insurance = Integer.parseInt(userInput);
        //checking selected insurance
        if (insurance == 1)
            insuranceLife();//method
        else
            insuranceHealth();//method
    }

    public static void insuranceLife() {
        Life life = new Life();
        life.setCost();
        life.display();
    }

    public static void insuranceHealth() {
        Health health = new Health();
        health.setCost();
        health.display();
    }
}