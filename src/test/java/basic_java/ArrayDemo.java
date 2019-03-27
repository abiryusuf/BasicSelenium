package basic_java;

public class ArrayDemo {

    public static void main(String[] args) {
        int a[]={1,2,3,4};
      /*  int a[] = new int[5]; //declaration
        a[0] = 1; //initializing arrays
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;*/
       // a[4]=5;
        for (int i=0; i<a.length; i++) { //length of property of array
            System.out.println(a[i]); //printing out values of array
        }
    }
}
