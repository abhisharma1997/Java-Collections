package com.learning.java.fw.collection.list.arrayList;



/*
    ArrayList Class
    It is an class which implements List Interface. It is an enhanced version of Arrays as in Arrays,
    we need to specify size at time of creation but in ArrayList size is allocated Dynamically whenever there
    is add and remove happen in ArrayList.

    Common Operations :
        1. Adding element
        2. Changing Element
        3. Removing element
        4. Iterating

    Methods in List Interface
        1. add(int index, T element)    2. addAll(int index, Collection c)      3. size()       4. remove(T element)
        5. sort(Comparator com)     6. clear()      7. containsAll(Collection c)      8. contains(T element)
        9. equals(T element)    10. hashCode()      11. indexOf(T element)      12. lastIndexOf(T element)
        13. get(T e)    14. set(int index, T e)     15. isEmpty()   16. remove(int index) 17. add(T e)      18. addAll(Collection c)
        19. clone()        20. ensureCap(int minCap)        21. forEach(Consumer)        22. listIterator()
        23. removeAll(Collection c)        24. removeIf(Predicate p)        25. removeRange(int from, int to)
        26. retain(Collection c)        27. toArray()        28. subList(int from, int to)

 */

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        // creating objects of ArrayList class.
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();


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
        System.out.print("Removing Ansh from List: ");
        list.removeIf((s)-> s.equalsIgnoreCase("Ansh"));
        System.out.println(list);
        System.out.println("Adding Ansh back ");
        list.add("Ansh");
        list.forEach((s)-> System.out.print(s+" "));
        System.out.println();
        System.out.println("Sublist of List from 1 to 3 : "+ list.subList(1,3));


    }
}
