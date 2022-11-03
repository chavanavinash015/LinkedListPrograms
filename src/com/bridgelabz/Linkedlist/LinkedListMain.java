package com.bridgelabz.Linkedlist;

public class LinkedListMain {

    public static void main(String[] args) {
        System.out.println("Welcome to the linkedList programs");
        System.out.println("Create Linked List of 56,30,70");

        System.out.println("\norder LinkedList 56->30->70");
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(70);
        list1.add(30);
        list1.add(56);
        list1.push(30);
        list1.pop();
        list1.popLast();
        list1.print();

        System.out.println("\nLinkedList in appending  56<-30<-70");
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.push(56);
        list2.push(30);
        list2.push(70);
        list2.pop();
        list2.popLast();
        list2.print();

    }
}
