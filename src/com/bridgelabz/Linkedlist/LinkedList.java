package com.bridgelabz.Linkedlist;

public class LinkedList <T> {

    public Node<T> head;
    public Node<T> tail;
    public void add(T data){
        Node newNode = new Node(data);
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
    public T pop() {
        if (head == null)
            return null;
        else {
            T data = head.getKey();
            head = (Node<T>) head.getNext();
            return data;
        }
    }
    public T popLast() {
        if (head == null)
            return null;
        else {
            Node<T> temp = head;
            while (temp.getNext() != tail) {
                temp = (Node<T>) temp.getNext();
            }
            T data = tail.getKey();
            temp.setNext(null);
            tail = temp;
            return data;
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
