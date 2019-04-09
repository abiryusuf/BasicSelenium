package basic_java.java_collection_framewrok;

import java.util.*;

public class HasTableDemo {
    //HasgMap vs HashTable
    //HashMap is non synchronized and HashTable is synchronized
    //Hashmap is faster then hashtable.
    //Hashmap contains one null key and any number of null  value
    //HashTable does not allows null keys and null values

    public static void main(String[] args) {
     Method1();
     sort();
    }
    public static void Method1(){
        Enumeration name;
        Integer num;
        Hashtable<Integer,String> hashtb = new Hashtable<Integer, String>();

        hashtb.put(3,"abir");
        hashtb.put(2, "arafat");
        hashtb.put(1,"Mukter");
        hashtb.put(5, "Munni");
        hashtb.put(7,"Mim");

        name=hashtb.keys();
        while (name.hasMoreElements()){
            num=(Integer) name.nextElement();
            System.out.println("Key: " +num+ " &value: "+hashtb.get(num));
        }
        System.out.println("*****************************************");

    }
    public static void sort(){
        Hashtable<Integer,String> hashtb = new Hashtable<Integer, String>();

        hashtb.put(3,"abir");
        hashtb.put(2, "arafat");
        hashtb.put(1,"Mukter");
        hashtb.put(5, "Munni");
        hashtb.put(7,"Mim");

        Set set = hashtb.entrySet();
        Iterator itr =set.iterator();

        while (itr.hasNext()){
            Map.Entry map=(Map.Entry)itr.next();
            System.out.println("Key is " +map.getKey() +" & value is " +map.getValue());
        }
    }
}
