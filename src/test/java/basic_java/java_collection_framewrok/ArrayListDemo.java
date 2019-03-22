package basic_java.java_collection_framewrok;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    //ArrayList class implements List interface and it is based on an Array data structure.
    //Array is fix length data structure and ArrayList is a variable or dynamic length data structure.
    //Array can not change when we declar the value, Array list can change or add value.
    public static void main(String[] args) {
    ArrayListMethod();
    ArrayListDemo ncopies = new ArrayListDemo();
    ncopies.ncopies();
    AddMethod();

    }
        public static void ArrayListMethod(){
        ArrayList<String> obj = new ArrayList<String>();
        //Initialize an Array list
        Arrays.asList("abir1", "mim");
        System.out.println(obj);
        System.out.println("*************************");
        obj.add("abir");
        obj.add("yusuf");
        obj.add("Mim");
        obj.add("Arafat");
        obj.add("Mhudo");
        obj.add("Munni");
        obj.add("Mostafa");

        System.out.println("Main AarryList***************");

       // String obj[]=obj.toArray(new String[obj.size()]);

        for (int counter=0; counter<obj.size(); counter++)
            System.out.println(obj.get(counter));

        obj.add(1,"pronob");
        obj.add(2, "jhon");
        System.out.println("After adding Array List**************");
//Add ()
        for (String str: obj)
            System.out.println(str);
// remove  () method
        obj.remove("pronob");
        obj.remove("jhon");
        System.out.println("After removing ArratList**************");

     Iterator tr = obj.iterator();
     while (tr.hasNext()){
         System.out.println(tr.next());
     }


//Update
        obj.set(5,"KKR");
        for (String str:obj)
            System.out.println(str);

        System.out.println("****************");
        obj.get(4);
            Iterator itre = obj.iterator();
            while(itre.hasNext()) {

            }
    }
   // Collection.ncopies method when we need to initialize the ArrayList with the same value for all of its elements.
    //count is number and element is value.
    public void ncopies(){
        ArrayList<Integer>list = new ArrayList<Integer>(Collections.nCopies(8, 4));
        System.out.println("ArrayList Items: " + list);
    }
    public static void AddMethod() {
        ArrayList<String> copy = new ArrayList<String>();

        copy.add("text 1");
        copy.add("text 2");
        copy.add("text 3");
        copy.add("text 4");
        for (String str1 : copy)
            System.out.println(str1);

        List<String> list = new ArrayList<String>();

        list.add("abir");
        list.add("arafat");
        list.add("mim");

        copy.addAll(list);
        System.out.println(copy);

    }
    }
