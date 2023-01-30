package com.bridgelabz.datastructure;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void push(T data) {
        Node<T> newnode = new Node<>(data);
        if (newnode == null) {
            newnode = head;
            newnode = tail;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    public void add(T data) {
        Node<T> obj2= new Node<>(data);
        if (head == null) {
            head = obj2;
            tail = obj2;
        } else {
            tail.next=obj2;
            tail = obj2;
        }
    }

    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--->");
            temp = temp.next;
        }
    }
}