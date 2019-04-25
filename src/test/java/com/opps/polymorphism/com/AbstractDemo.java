package com.opps.polymorphism.com;


//Abstraction is a process of hiding the implementation details and showing only functionality to the user.
//we can not instaniatiated that means we can not create an object because abstract does not have method body.
//A class declared using "Abstract" keword is known as abstract class
abstract class ParentClass{
    //regular method
    public void method1(){
        System.out.println("concrete method of parent class");

    }
    //abstract method
    //If a method declared abstract is known abstract method.
    abstract public void method2();
}

class child extends ParentClass{
    //override the abstract method
    //child class override the method to give its own implementation details
    public void method2(){
        int a = 2;
        int b =4;
        int c = a + b;
        System.out.println(c);
        System.out.println("overriding abstarct method");
    }

    public static void main(String[] args) {
        child obj = new child();
        obj.method2();
        obj.method1();
    }
}