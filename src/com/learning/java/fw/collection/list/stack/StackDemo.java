package com.learning.java.fw.collection.list.stack;


import java.util.Stack;

/*
    Stack Class
    It is an class which implements List Interface and extends Vector class.
    Stack works on LIFO ( Last-in-First-Out ) approach. It is the optimised implementation of Stack data structure
    with implementing some more methods like peek(),search()

    Common Operations :
        1. Adding element
        2. Getting topmost Element
        3. Searching element
        4. Removing


    Methods in List Interface
        1. push(T element)    2. pop()      3. peek()       4. search(T element)
         */
public class StackDemo {

    public static void main(String[] args) {
        Stack<Character> chars = new Stack<>();

        // Adding elements to stack
        chars.push('A');
        chars.push('B');
        chars.push('C');

        // Iteration over stack
        System.out.print("Elements in Stack from bottom to top : ");
        chars.forEach((c)-> System.out.print(c+", "));

        //Peek operation
        System.out.println();
        System.out.println("Peek operation on stack : ");
        System.out.print(chars.peek());

        System.out.println();
        System.out.println("Searching B on stack : ");
        System.out.print(chars.search('B'));

        System.out.println();
        // Poping out the topmost Element
        chars.pop();
        System.out.println("Resultant stack after Pop : ");
        chars.forEach((c)-> System.out.print(c+", "));

    }
}
