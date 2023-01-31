package com.bridgelabz.datastructure;

public class Queue<T> {
    LinkedList<T> linkedList;
    Queue(){
        linkedList = new LinkedList<>();
    }

    public void enque(T data) {
        linkedList.add(data);
    }

    public void display(){
        linkedList.display();
    }

}
