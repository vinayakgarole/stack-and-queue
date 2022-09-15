package com.bridgelabz;

public class QueueRunner {

    public static void main(String[] args) {


        Queue<Integer> queue = new Queue<>();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.print();
        queue.dequeue(56);
        queue.dequeue(30);
        queue.dequeue(70);

    }
}