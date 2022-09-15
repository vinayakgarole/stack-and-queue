package com.bridgelabz;

public class StackRunner {

    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();
        stack.push(70);
        stack.peek(70);
        stack.push(30);
        stack.peek(30);
        stack.push(56);
        stack.peek(56);
        stack.pop(70);
        stack.pop(30);
        stack.pop(56);

    }
}