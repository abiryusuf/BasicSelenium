package com.opps.polymorphism.com;

public class CitiBank extends Bank {
//runtime polymorphism is related with overriding
    @Override
    public void InterestRate(){
        System.out.println("10%");
    }
    @Override
    public void savingAccount(){
        System.out.println(10);
    }



    public static void main(String[] args) {
        CitiBank rate = new CitiBank();
        rate.InterestRate();
        rate.savingAccount();
    }
}
