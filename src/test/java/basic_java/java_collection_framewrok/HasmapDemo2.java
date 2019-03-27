package basic_java.java_collection_framewrok;

import java.util.*;

public class HasmapDemo2 {
    public static void main(String[] args) {
        HashMap<Integer, String> sort = new HashMap<Integer, String>();
        sort.put(1, "abir");
        sort.put(5, "Mim");
        sort.put(2, "Arafat");
        sort.put(40, "Munni");
        sort.put(7, "mostafa");

        System.out.println("Before Sorting : ");

        Set set = sort.entrySet();
        Iterator itr=set.iterator();
        while (itr.hasNext()){
            Map.Entry sr = (Map.Entry)itr.next();
            System.out.println(sr.getKey() + ": ");
            System.out.println(sr.getValue());
        }
        System.out.println("after sorting");
        Map<Integer, String>mp2=new TreeMap<Integer, String>(sort);

        Set se = mp2.entrySet();
        Iterator it =se.iterator();
        while (it.hasNext()){
            Map.Entry mpw = (Map.Entry)it.next();
            System.out.println(mpw.getKey() + ": ");
            System.out.println(mpw.getValue());

        }
    }
}
