package com.bridgelabz.datastructure;

public class Stack<T> {
    LinkedList<T> list;
    Stack(){
        list = new LinkedList<>();
    }

    public void push(T data){
        list.push(data);
    }

    public void peek(){
        System.out.println("Popped Element : "+list.head.data);
    }

    public void pop(){
        list.poplast();
    }

    public void popPeekTillEmpty() {
        while(list.head!=null) {
            peek();
            pop();
            display();
            System.out.print("\n");
        }
        System.out.println("Stack is now Empty");
    }
    public void display() {
        list.display();
    }
}
