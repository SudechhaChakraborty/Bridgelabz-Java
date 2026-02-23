package iostreams.multithreading;

import java.util.LinkedList;
import java.util.Queue;

// Shared Resource Class
class SharedQueue {

    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity;

    public SharedQueue(int capacity) {
        this.capacity = capacity;
    }

    // Method to produce data
    public synchronized void produce(int value) {
        try {
            while (queue.size() == capacity) {
                wait(); // Wait if queue is full
            }

            queue.add(value);
            System.out.println("Produced: " + value);

            notify(); // Notify consumer

        } catch (InterruptedException e) {
            System.out.println("Producer interrupted.");
        }
    }

    // Method to consume data
    public synchronized int consume() {
        int value = -1;

        try {
            while (queue.isEmpty()) {
                wait(); // Wait if queue is empty
            }

            value = queue.poll();
            System.out.println("Consumed: " + value);

            notify(); // Notify producer

        } catch (InterruptedException e) {
            System.out.println("Consumer interrupted.");
        }

        return value;
    }
}

// Producer Thread
class Producer extends Thread {

    private final SharedQueue sharedQueue;

    public Producer(SharedQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                sharedQueue.produce(i);
                Thread.sleep(500); // Simulate delay
            }
        } catch (InterruptedException e) {
            System.out.println("Producer thread error.");
        }
    }
}

// Consumer Thread
class Consumer extends Thread {

    private final SharedQueue sharedQueue;

    public Consumer(SharedQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                sharedQueue.consume();
                Thread.sleep(800); // Simulate processing delay
            }
        } catch (InterruptedException e) {
            System.out.println("Consumer thread error.");
        }
    }
}