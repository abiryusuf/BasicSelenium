package basic_java.java_collection_framewrok;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkListDemo {
    /*Java LinkedList class can contain duplicate elements.
    Java LinkedList class maintains insertion order.
    Java LinkedList class is non synchronized.
    In Java LinkedList class, manipulation is fast because no shifting needs to occur.
    Java LinkedList class can be used as a list, stack or queue.*/

    public static void main(String[] args) {
      method();
      convert();
    }


    public static void method(){
        LinkedList<String> link = new LinkedList<String>();
        link.add("abir");
        link.add("Mim");
        link.add("Arafat");
        link.add("Munni");
        link.add("Mostafa");
        link.add("Mhudo");
//for loop
        for(int i=0; i<link.size(); i++){
            System.out.println(link.get(i));
        }

       // System.out.println("Linked list content " + link);


        //Add element
        System.out.println("******************");
        link.addFirst("FirstItem");
        link.addLast("Lastitem");
       //Advance loop
       for(String str: link){
           System.out.println(str);
       }
       // System.out.println("After addition " + link);


        //get and set values
        System.out.println("******************************");
        link.get(0);
        link.set(0,"change first item ");

        //iterator
        Iterator i = link.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        //System.out.println("chnage " + link);
        System.out.println("**************************");
        //remove
        link.removeFirst();
        link.removeLast();
        System.out.println("after remove " + link);

        System.out.println("**********");
        //clone/copy all elements
        Object str = link.clone();
        System.out.println("after clone " + str);

    }

    public static void convert(){
        LinkedList<String> link = new LinkedList<String>();
        link.add("abir");
        link.add("Mim");
        link.add("Arafat");
        link.add("Munni");
        link.add("Mostafa");
        link.add("Mhudo");

        List<String>con = new ArrayList<String>(link);
        System.out.println("**************************");
        for (String str:con){
            System.out.println("convert LinkedList to ArrayList " + str);

    }
}
}


