package com.algorithm;

public class Algorithm {

    public static void main(String[] args) {
       reverseString();


    }

    public static void reverseString(){

        String str ="abir";

        for(int i =str.length(); i>=-1; i--){
             str =  str + str.charAt(i);
            System.out.println(str);
        }
    }
}


