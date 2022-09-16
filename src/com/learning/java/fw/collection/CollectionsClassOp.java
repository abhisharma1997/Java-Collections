package com.learning.java.fw.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Collections Class is an utility class which is provided in Java Collection Framework.
    this utility class provides various helpful methods for collections
    like :
    1. Adding Elements to Collection
    2. Sorting Collection
    3. Searching Element in Collection
    4. Copy elements of one collection to another
    5. Check whether Collections contain common Elements
 */
public class CollectionsClassOp {

    public static void main(String[] args) {

        List<String> items = new ArrayList<>();
        items.add("Bag");
        items.add("Fruit");
        items.add("Shoes");

        //Adding elements using Collections class Utility method
        Collections.addAll(items,"Bat","Hat","Phone");

        System.out.println("Printing elements of Items Collection after adding Elements using Collections.addAll()");
        for(String item : items){
            System.out.print(item + " ");
        }
        System.out.println();

        //Sorting Collection Items
        System.out.println("Printing elements of Items Collection after Sorting Elements using Collections.sort() asc order");
        Collections.sort(items);
        for(String item : items){
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println("Printing elements of Items Collection after Sorting Elements using Collections.sort() desc order");
        Collections.sort(items,Collections.reverseOrder());
        for(String item : items){
            System.out.print(item + " ");
        }
        System.out.println();

        //Searching item in Items Collection
        System.out.println("Searching Bat in Items Collection  using Collections.binarySearch()");
        Collections.sort(items);
        System.out.println("Index of Bat :"+Collections.binarySearch(items,"Bat"));

        //Copy Elements to Items Collection
        System.out.println("Copying Tab in Items Collection");
        List<String> copyList = new ArrayList<>();
        copyList.add("Tab");
        Collections.copy(items,copyList);
        System.out.println("Printing elements of Items Collection after copying Tab in Items using Collections.copy()");
        for(String item : items){
            System.out.print(item + " ");
        }
        System.out.println();

        //Disjoint Collection
        System.out.println("Checking Disjoint condition on Items and CopyList  Collection");
        System.out.println("Items and CopyList disjoint check :" + Collections.disjoint(items,copyList));
        List<String> items2 = new ArrayList<>();
        items2.add("Mat");
        System.out.println("Checking Disjoint condition on Items and CopyList  Collection");
        System.out.println("Items and CopyList disjoint check :" + Collections.disjoint(items,items2));








    }
}
