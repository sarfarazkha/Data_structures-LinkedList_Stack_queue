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

    public T popFirst() {
        Node<T> popelement = head;
        T element=popelement.data;
        Node<T> nextelem=popelement.next;
        popelement.data=null;
        popelement.next=null;
        head=nextelem;
        return element;

    }

    public T poplast() {
        T popData = tail.data;
        Node <T> temp = head;
        while (temp.next != tail){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return popData;
    }

    public Node<T> search(T searchData) {
        Node<T> temp=head;
        Node<T> searchedNode=null;
        while(temp!=null)
        {
            if(temp.data.equals(searchData))
            {
                searchedNode=temp;

            }
            temp=temp.next;
        }
        return searchedNode;
    }




    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--->");
            temp = temp.next;
        }
        System.out.println();
    }

    public void insertAfter(T insertData , T searchData) {
        Node<T> searchedData = search(searchData);
        if (searchedData != null){
            Node<T> newNode = new Node(insertData);
            Node<T>nextNode = searchedData.next;
            searchedData.next = newNode;
            newNode.next = nextNode;
        }
    }

    public void delete(T data){
        Node<T> temp = head;
        Node<T> previousNode = null;

        while(temp!=null){
            if(temp.data.equals(data)){
                break;
            }
            previousNode = temp;
            temp = temp.next;
        }
        previousNode.next=temp.next;
    }

    public void sort(){
        Node<T> temp = head;
        Node<T> index= temp.next;
        Integer value=0;

        while(temp!=null){
            while(index!=null) {
                if ((Integer) temp.data > (Integer) index.data) {
                    value = (Integer) temp.data;
                    temp.data = index.data;
                    index.data = (T) value;
                }
                index=index.next;
            }
            temp=temp.next;
        }
    }
}