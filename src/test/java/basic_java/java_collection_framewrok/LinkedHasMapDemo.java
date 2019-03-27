package basic_java.java_collection_framewrok;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHasMapDemo {
    //LinkHashMap maintains the insertion order
    public static void main(String[] args) {
        LinkedHashMap<Integer, String>link = new LinkedHashMap<Integer, String>();

        link.put(3,"abir");
        link.put(2,"yusuf");
        link.put(6, "mim");
        link.put(7,"muktar");
        link.put(9,"mostafa");

        Set set = link.entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            Map.Entry map =(Map.Entry)itr.next();
            System.out.println("Key is " + map.getKey() + " &Value is "+map.getValue()+"\n");
        }
    }
}
