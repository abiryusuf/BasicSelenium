package basic_java;

public class ConstructorDemo {
    int id;
    String name;

    ConstructorDemo(int i, String n) {
      //  id = i;
      //  name = n;
        id=i;
        name =n;

    }
   public  void display(){
        System.out.println(id+ " " + name);
    }

    public static void main(String[] args) {
        ConstructorDemo s1 = new ConstructorDemo(2, "abir");
        ConstructorDemo s2= new ConstructorDemo(1, "yusuf");
        s1.display();
        s2.display();

    }


}
