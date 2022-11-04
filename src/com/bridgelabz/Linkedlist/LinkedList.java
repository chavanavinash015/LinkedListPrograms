package com.bridgelabz.Linkedlist;

public class LinkedList <T> {

    public Node<T> head;
    public Node<T> tail;
    public void add(T data){
        Node<T> newNode = new Node<>(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }else {
            newNode.setNext(head);
            head = newNode;
        }
    }
    public void push(T data) {
        Node<T> newMyNode = new Node(data);
        if (head == null) {
            head = newMyNode;
            tail = newMyNode;
        } else {
            tail.setNext(newMyNode);
            tail = newMyNode;
        }
    }
    public void pop() {
        if (head == null) {
        }
        else {
            T data = head.getKey();
            head = (Node<T>) head.getNext();
        }
    }
    public void popLast() {
        if (head == null) {
        }
        else {
            Node<T> temp = head;
            while (temp.getNext() != tail) {
                temp = (Node<T>) temp.getNext();
            }
            T data = tail.getKey();
            temp.setNext(null);
            tail = temp;
        }
   }
    public void search(T searchData) {
        Node<T> temp = new Node<>(searchData);
        Node<T> newtemp = head;
        while (newtemp != null) {
            if (newtemp.getKey() == searchData) {
                System.out.println("Elements available");
            }
            newtemp = newtemp.getNext();
        }
    }
    public void print(){
        if (head == null){
            System.out.println("Linked List is Empty");
        }else {
            Node<T> currNode = head;
            while (currNode != null){
                System.out.print(currNode.getData()+" ");
                currNode = currNode.getNext();
            }
            System.out.println();
        }
    }
}
