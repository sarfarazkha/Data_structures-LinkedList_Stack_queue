package com.bridgelabz.datastructure;

public class LinkedListMian {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.display();

        linkedList.add(30);
        linkedList.add(70);
        linkedList.display();

        linkedList.insertBetween(30);
        linkedList.display();
    }
}
