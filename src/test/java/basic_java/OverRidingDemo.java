package basic_java;


class Overriding{

    void roy(){System.out.println("Roy is good boy");}
}
//Creating a child class
class Boy extends Overriding{
    public static void main(String args[]) {
        //creating an instance of child class
        Boy obj = new Boy();
        //calling the method with child class instance
        obj.roy();
    }
}