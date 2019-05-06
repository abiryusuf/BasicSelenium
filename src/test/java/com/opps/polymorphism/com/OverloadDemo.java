package com.opps.polymorphism.com;

public class OverloadDemo {
    //  static polymorphism : Method would be called is determined by the parameter list at the compile time.

    public static void main(String[] args) {

        OverloadDemo obj = new OverloadDemo();
        demo(0, "Abir");
        obj.demo(1, "Yusuf", "NY");
        System.out.println(obj.add(30, 20));
        System.out.println(obj.add(40, 30, 20));

    }



    public static void demo(int i, String name ){
        System.out.println("Id and name: " + i + ", " +  name);
    }
    public void demo(int i, String name, String address){
        System.out.println("id, name and address:  " + i + "" +
                ", "+name+", "+address);
        }

      //  static polymorphism
     public  int add(int a, int b) {
              return a+b;

          }
        public int add(int a, int b, int c){
              return a+b-c;
          }
        }

