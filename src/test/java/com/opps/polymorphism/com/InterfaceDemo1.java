package com.opps.polymorphism.com;

public class InterfaceDemo1{
    public static void main(String[] args) {
       WorldBank str = new BankOfAmerica();
       System.out.println("BOA : " + str.rateOfIntersted());
    }
}
interface WorldBank{

    float rateOfIntersted();
}

class BankOfAmerica implements WorldBank{

    public float rateOfIntersted(){
        return 8.7f;
    }
    class TDBank implements WorldBank{

        public float rateOfIntersted(){
            return 8.5f;
        }
    }
}
