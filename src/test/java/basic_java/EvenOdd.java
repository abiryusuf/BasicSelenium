package basic_java;

public class EvenOdd {
    public static void main(String[] args) {
      evenNumber();
      oddNumber();
    }

    public static void evenNumber(){
        int i = 100;
        for(i=2;i<=100;i+=2){
            System.out.println("Even number is-->"+i);
        }

    }

    public static void oddNumber(){
        int i = 100;
        for(i=1;i<=100;i+=2){
            System.out.println("Odd number is-->"+i);
        }

    }
}
