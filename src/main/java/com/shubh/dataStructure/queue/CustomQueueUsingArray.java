package com.shubh.dataStructure.queue;

class CustomQueue {

    private static final int ARRAY_SIZE = 5;
    private static int queue[] = new int[ARRAY_SIZE];
    int rear;
    int front;
    int size;

    public void enQueue(int data) {
        queue[rear] = data;
        rear = (rear + 1) % ARRAY_SIZE;
        size++;
    }

    public void deQueue() {
        front = (front + 1) % ARRAY_SIZE;
        size--;
    }

    public int peek() {
        return queue[front];
    }

    public boolean isFull() {
        return size == ARRAY_SIZE;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void showData() {

        System.out.println("Elements are : ");
        for (int i = front; i < ARRAY_SIZE; i++) {
            System.out.println(queue[i]);
        }
    }
}

public class CustomQueueUsingArray {

    public static void main(String[] args) {

        CustomQueue customQueue = new CustomQueue();
        customQueue.enQueue(4);
        customQueue.enQueue(3);
        customQueue.enQueue(2);
        customQueue.enQueue(1);

        customQueue.showData();
        customQueue.deQueue();
        customQueue.showData();
    }
}
