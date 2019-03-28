package basic_java;

public class ArrayDemo {

    public static void main(String[] args) {
     Method1();
     FindNumber();

        }

        public static void Method1() {
            int a[] = {1, 2, 3, 4};
      /*  int a[] = new int[5]; //declaration
        a[0] = 1; //initializing arrays
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;*/
            // a[4]=5;
            for (int i = 0; i < a.length; i++) { //length of property of array
                System.out.println(a[i]); //printing out values of array
            }
        }
        public static void FindNumber(){

                int intArray[]=new int[]{30,20,10,50,60};
                int largest=Integer.MIN_VALUE;
                int smallest=Integer.MAX_VALUE;
                for (int number : intArray){
                    if (number>largest){
                        largest=number;
                    }
                   // System.out.println(largest);
                }  System.out.println(largest);

                for (int number : intArray){
                    if (number<smallest){
                        smallest=number;
                    }
                }
            System.out.println(smallest);
            }
    }

