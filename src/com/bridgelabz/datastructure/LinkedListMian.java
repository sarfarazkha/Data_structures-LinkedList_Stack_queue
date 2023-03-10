package com.bridgelabz.datastructure;

public class LinkedListMian {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.display();


        LinkedList linkedList1 = new LinkedList();
        linkedList1.add(56);
        linkedList1.add(30);
        linkedList1.add(70);
        linkedList1.display();


        linkedList1.insertBetween(30);
        linkedList1.display();

        linkedList1.popFirst();
        linkedList1.display();

        linkedList1.poplast();
        linkedList1.display();

        linkedList1.search(30);
        linkedList1.display();

        linkedList.insertAfter(40,30);
        linkedList.display();

        linkedList.delete(40);
        linkedList.display();

        linkedList.sort();
        System.out.println();
        linkedList.display();


        System.out.println("\n*******************Stacks****************");

        Stack stackList = new Stack();
        stackList.push(70);
        stackList.push(30);
        stackList.push(56);
        stackList.display();

        stackList.peek();
        stackList.display();

        stackList.pop();
        stackList.display();

        stackList.popPeekTillEmpty();
        stackList.display();

        System.out.println("\n*******************Queue****************");

        Queue queuelist = new Queue();
        queuelist.enque(56);
        queuelist.enque(30);
        queuelist.enque(70);

        queuelist.display();

        queuelist.pop();
        queuelist.display();
    }
}
