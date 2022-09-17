package com.learning.java.fw.collection.list;
import java.util.ArrayList;
import java.util.List;

/*
    List interface
    It is an interface which extends Collection Interface. It is provided by Java Collection Framework.
    Classes which implements List Interface :
        1. ArrayList
        2. LinkedList
        3. Stack
        4. Vector ( Got deprecated in Java 5 )

    Common Operations :
        1. Adding element
        2. Searching
        3. Removing

    Methods in List Interface
        1. add(int index, T element)    2. addAll(int index, Collection c)      3. size()       4. remove(T element)
        5. sort(Comparator com)     6. clear()      7. containsAll(Collection c)      8. contains(T element)
        9. equals(T element)    10. hashCode()      11. indexOf(T element)      12. lastIndexOf(T element)
        13. get(T e)    14. set(int index, T e)     15. isEmpty()   16. remove(int index)


 */

public class ListInterfaceDemo {

    public static void main(String[] args) {

        // We can't create objects of Interface. So, creating object using referencing
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();


        // Adding Elements using add and addAll method
        list.add("Abhi");
        list.add("Him");
        list2.add("Mani");
        list2.add("Ansh");
        list.addAll(1,list2);

        //Printing after add operation
        System.out.print("Printing List after adding elements: ");
        for(String s : list){
            System.out.print(s+" ");
        }
        System.out.println("");

        //Search Operation
        System.out.println("Searching Ansh in List : " + list.contains("Ansh"));
        System.out.println("Searching Hint in List : " + list.contains("Hint"));

        //Remove Operation
        System.out.println("Removing Ansh in List ");
        list.remove("Ansh");
        System.out.println("Printing List: "+ list);
        System.out.println("Removing 1st index element in List ");
        list.remove(1);
        System.out.println("Printing List: "+ list);

        list.addAll(2,list2);
        System.out.println("Printing List after adding again: "+ list);

        //Some more methods of List Interface
        System.out.println("Getting value from list at index 3 : " + list.get(3));
        System.out.println("Setting Test at index 2 : " + list.set(2,"Test"));
        System.out.println("Printing List: "+ list);
        System.out.print("Sorting List in asc order :" );
        list.sort(((o1, o2) -> o1.compareTo(o2)));
        System.out.println(list);
        System.out.println("Size of List : "+ list.size());
        System.out.println("Check list contains all elements of list2 : "+ list.containsAll(list2));
        System.out.println("Is List is equals to List2 : "+ list.equals(list2));
        System.out.println("HashCode value of List: "+ list.hashCode());
        System.out.println("Index of Him in List: "+ list.indexOf("Him"));
        System.out.println("Is List empty check : "+ list.isEmpty());
    }
}
