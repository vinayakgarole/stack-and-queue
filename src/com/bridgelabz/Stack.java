package com.bridgelabz;

public class Stack <T>{
    LinkedList<T> linkedList = new LinkedList<>();
    public void push(T data) {
        linkedList.addAtStart(data);
    }
    public void pop(T data) {
        linkedList.deleteAtStart();
    }
    public void peek(T data) {
        linkedList.print();
    }

//    public void print(){
//        linkedList.print();
//    }
}