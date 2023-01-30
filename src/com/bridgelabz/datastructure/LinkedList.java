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
        Node<T> newnode= new Node<>(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next=newnode;
            tail = newnode;
        }
    }

    public void insertBetween(T insertData) {
        Node<T> newnode= new Node<>(insertData);
        head.next=newnode;
        newnode.next=tail;
    }


    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--->");
            temp = temp.next;
        }
    }
}