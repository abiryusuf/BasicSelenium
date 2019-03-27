package basic_java.java_collection_framewrok;

import java.util.*;

public class TreeMapDemo {
    //Main difference is HapMap does not follow order but TreeMap follow the order
    public static void main(String[] args) {
      Method1();
      reverse();
    }
    public static void Method1(){
        TreeMap<Integer, String>tree = new TreeMap<Integer, String>();
        tree.put(1, "abir");
        tree.put(5, "Mim");
        tree.put(2, "Arafat");
        tree.put(40, "Munni");
        tree.put(7, "mostafa");
        tree.put(0, "muktar");

        Set set = tree.entrySet();
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry map1 = (Map.Entry)itr.next();
            System.out.println("key is: " +  map1.getKey() + " & Value is " + map1.getValue());
        }
    }
    public static void reverse() {
        System.out.println("**************reverse********************");
        //Method: Collections.reverseOrder()
        Map<Integer, String> tree1 = new TreeMap<Integer, String>(Collections.reverseOrder());
        tree1.put(1, "abir");
        tree1.put(5, "Mim");
        tree1.put(2, "Arafat");
        tree1.put(40, "Munni");
        tree1.put(7, "mostafa");
        tree1.put(0, "muktar");

        Set set = tree1.entrySet();
        Iterator tre = set.iterator();
        while (tre.hasNext()){
            Map.Entry map3=(Map.Entry)tre.next();
            System.out.println("Key is "+map3.getKey() + " &Value is "+map3.getValue());

        }


        }
    }