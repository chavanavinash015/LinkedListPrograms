package com.bridgelabz.Linkedlist;

public class Node<T> {
    private T Key;

    private T data;
    private Node<T> next;
    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getKey() {
        return Key;
    }

    public void setKey(T key) {
        Key = key;
    }
}
