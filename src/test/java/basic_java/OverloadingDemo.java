package basic_java;

public class OverloadingDemo {

    public static void main(String[] args) {
        // Overriding obj = new Overriding();

         System.out.println(add(5,5));
         System.out.println(add(6,8,10));
        }

    public static int add(int x, int y){
        return x+y;
    }
    public static int add(int x, int y, int z){
        return  x+y+z;
    }

    }

