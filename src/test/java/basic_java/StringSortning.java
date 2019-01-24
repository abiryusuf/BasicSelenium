package basic_java;
import java.util.Arrays;

public class StringSortning {
    // Driver method
        public static void main(String[] args)
        {
            String inputString = "Bangladesh";
            String outputString = sortString(inputString);

            System.out.println("Input String : " + inputString);
            System.out.println("Output String : " + outputString);
        }
    // Java program to sort a string alphabetically
    // Method to sort a string alphabetically
    public static String sortString(String inputString)
    {
        // convert input string to char array
        char tempArray[] = inputString.toCharArray();

        // sort tempArray
        Arrays.sort(tempArray);

        // return new sorted string
        return new String(tempArray);
    }
    }


