package basic_java;

public class StaticDemo {
 // Static block is used for initializing the static variables.
    static int num;
    static String abir;

    static {
        num = 97;
        abir = " my name is abir";
    }
//Static variable :If you declare any variable as static, it is known as a static variable.
//The static variable can be used to refer to the common property of all objects
    static int var1;
    static String var2;
  /*  static {
        var1=10;
        var2="yusuf";
    }*/
//static method
  // If you apply static keyword with any method, it is known as static method.
  // A static method belongs to the class rather than the object of a class.
    // A static method can be invoked without the need for creating an instance of a class.
    public static void staticVariable(){

        System.out.println("var1 is " + var1);
        System.out.println("Var2 is " + var2);
    }

    public static void main(String[] args) {
        System.out.println("value of num : " + num);
        System.out.println(" value of abir :" + abir);
        staticVariable();
    }
}
