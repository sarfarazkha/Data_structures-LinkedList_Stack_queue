package com.bridgelabz.datastructure;

public class Queue<T> {
    LinkedList<T> linkedList;
    Queue(){
        linkedList = new LinkedList<>();
    }

    public void enque(T data) {
        linkedList.add(data);
    }

    public void pop() {
        System.out.println("\nPopped Element is : "+linkedList.head.data);
        linkedList.popFirst();
    }

    public void display(){
        linkedList.display();
    }
}
