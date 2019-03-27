package basic_java;

public class ThisKewWordDemo {
    // "this" is a reference variable that refers to the current object
    // this can be used to refer current class instance variable
    // this can be used to refer current class method
    // this can be used to refer current class constructor

    int roll;
    String name;
    float fee;
//If loacl variable (formal argument) and instant variable are different, there no need to use this keyword.
    ThisKewWordDemo(int roll, String name, float fee) {
        this.roll = roll;
        this.name = name;
        this.fee = fee;
    }
    public void display(){
        System.out.println("Roll number: " +roll +",Name is " +name+ ", pay " +fee);
    }

    public static void main(String[] args) {
        ThisKewWordDemo obj = new ThisKewWordDemo(1, "abir", 80);
        obj.display();
        obj.method2();

    }
  void method1(){
      System.out.println("Hello method 1");
  }
  void method2(){
      System.out.println("Hello method 2");
      this.method1();
  }

 /*   public static void main(String[] args) {
        ThisKewWordDemo obj = new ThisKewWordDemo();
        obj.method2();
    }*/
}
