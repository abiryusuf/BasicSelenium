package com.opps.polymorphism.com;

public class CitiBank extends Bank {

    @Override
    public void InterestRate(){
        System.out.println("10%");
    }


    public static void main(String[] args) {
        CitiBank rate = new CitiBank();
        rate.InterestRate();
    }
}
