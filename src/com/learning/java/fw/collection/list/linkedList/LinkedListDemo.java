package com.learning.java.fw.collection.list.linkedList;

import java.util.LinkedList;

/*
    Linked List Class
    It is class which implements LinkedList Data Structure.
    It stores data as an object(Node) which contains data and address of next and previous data node.
    In LL, data is not stored in contigous memory location.
    Size doesnot matter in this because they will ultimately save the address of other data node. so removing the address of
    next node or prev. node, unlink this from LinkedList list.

    Common Operations :
        1. Adding element
        2. Updating Element
        3. Removing element
        4. Iterating Over elements



         */

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        list.add("!");

        System.out.print("Printing Elements of Linked List: ");
        list.forEach((l)-> System.out.print(l+ ", "));
        System.out.println();

        list.set(2,"Abhi!");

        System.out.print("Printing Elements of Linked List after updating: ");
        list.forEach((l)-> System.out.print(l+ ", "));
        System.out.println();

        list.remove("World");

        System.out.print("Printing Elements of Linked List after removing World: ");
        list.forEach((l)-> System.out.print(l+ ", "));
        System.out.println();

        list.addLast("Welcome");
        System.out.print("Printing Elements of Linked List after adding Welcome in last: ");
        list.forEach((l)-> System.out.print(l+ ", "));
        System.out.println();




    }
}
