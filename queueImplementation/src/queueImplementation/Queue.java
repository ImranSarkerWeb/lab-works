package queueImplementation;
import java.util.Scanner;

public class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }
   
        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);
            int size = myObj.nextInt();

            Queue q = new Queue(size);

            System.out.println("Enter " + size + " elements to enqueue:");

            for (int i = 0; i < size; i++) {
                int item = myObj.nextInt();
                q.enqueue(item);
            }

            System.out.println("Queue size: " + q.size());
            System.out.println("Is the queue empty? " + q.isEmpty());

            System.out.println("Dequeuing elements:");

            while (!q.isEmpty()) {
                int item = q.dequeue();
                System.out.println("Dequeued: " + item);
            }

            System.out.println("Is the queue empty now? " + q.isEmpty());

            myObj.close();
        }
 
    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public int size() {
        return currentSize;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = item;
        currentSize++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Return a sentinel value indicating an empty queue
        }
        int removedItem = queueArray[front];
        front = (front + 1) % maxSize;
        currentSize--;
        return removedItem;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // Return a sentinel value indicating an empty queue
        }
        return queueArray[front];
    }
}



