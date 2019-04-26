package com.opps.polymorphism.com;
//Interface is collection of abstract methods or it is blueprint of class
//a class extends another class, an interface extends another interface, but a class implements an interface.
interface MainInterface{

    public void method();
    public void method1();
}

class Demo implements MainInterface{

    public void method(){
        System.out.println("This first method");
    }

    public void method1(){
        System.out.println("This 2nd method");
    }

    public static void main(String[] args) {
        MainInterface obj = new Demo();
        obj.method();
        obj.method1();
    }
}
