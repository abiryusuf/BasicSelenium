package basic_java.java_collection_framewrok;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ConverStringArrayToArrayList {
    public static void main(String[] args) {
        reverseInteger();

        String[] word = {"Please", "Help", "Me", "God"};
        List wordList = Arrays.asList(word);
        for (Object wo : wordList) {
            System.out.println(wo);


        }


    }
    public static  void reverseInteger(){

        int[] num = {1,2,3,4,5};
        List numList = Arrays.asList(num);
       /* for (Object number : numList){
            System.out.println(number);*/
        System.out.println(numList);
        }
    }


