package basic_java;

public class Employee {
    int id, age;
    String name, address;

    public Employee(int age){
        this.age = age;
    }
    public Employee (int id, int age){
        this(age);
        this.id =id;
    }
    public Employee(int id, int age, String name, String address){
        this(id, age);
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1, 25, "abir", "queens");
        System.out.println("ID: "+ emp.id  +  "Name: "+ emp.name  +  "age: "+ emp.age  +  "address: "+ emp.address);
    }
}
