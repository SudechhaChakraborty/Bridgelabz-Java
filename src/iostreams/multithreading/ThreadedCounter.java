package iostreams.multithreading;

import java.util.Scanner;

// Main class
public class ThreadedCounter {

    // Shared counter class
    static class Counter {
        private int current = 1;
        private final int limit;

        public Counter(int limit) {
            this.limit = limit;
        }

        // Synchronized method to ensure proper order
        public synchronized void printNumbers(int threadId, int totalThreads) {
            while (current <= limit) {
                if ((current - 1) % totalThreads == threadId) {
                    System.out.println("Thread " + threadId + " : " + current);
                    current++;
                    notifyAll();
                } else {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        System.out.println("Thread interrupted.");
                    }
                }
            }
        }
    }

    // Thread class
    static class CountingThread extends Thread {
        private final Counter counter;
        private final int threadId;
        private final int totalThreads;

        public CountingThread(Counter counter, int threadId, int totalThreads) {
            this.counter = counter;
            this.threadId = threadId;
            this.totalThreads = totalThreads;
        }

        @Override
        public void run() {
            counter.printNumbers(threadId, totalThreads);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter counting limit: ");
            int limit = scanner.nextInt();

            if (limit <= 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }

            int totalThreads = 3; // Number of threads
            Counter counter = new Counter(limit);

            CountingThread[] threads = new CountingThread[totalThreads];

            for (int i = 0; i < totalThreads; i++) {
                threads[i] = new CountingThread(counter, i, totalThreads);
                threads[i].start();
            }

            // Wait for all threads to finish
            for (int i = 0; i < totalThreads; i++) {
                threads[i].join();
            }

            System.out.println("Counting completed successfully!");

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}