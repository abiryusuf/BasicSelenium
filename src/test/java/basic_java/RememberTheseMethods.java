package basic_java;
import org.apache.poi.ss.formula.functions.T;
import java.util.Arrays;
public class RememberTheseMethods {
    //toCharArray() //get char array of a String
   // charAt(int x) //get a char at the specific index
   // length() //string length
   // length //array size
   // substring(int beginIndex)
   // substring(int beginIndex, int endIndex)
   //Integer.valueOf()//string to integer
   // String.valueOf()/integer to string
  //Arrays.sort()  //sort an array
  // Arrays.toString(char[] a) //convert to string
  // Arrays.copyOf(
  // T[] original, int newLength)
  //  System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
   // String str = "Bangladesh";

    public static void main(String args[]){
        charToStringExample();

        }
        public static void charToStringExample(){
        char c='M';
        String s=Character.toString(c);
        System.out.println("String is: "+s);
    }
}
