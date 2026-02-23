package iostreams.multithreading;

// Main Class
public class ProducerConsumerDemo {

    public static void main(String[] args) {

        try {
            SharedQueue sharedQueue = new SharedQueue(5);

            Producer producer = new Producer(sharedQueue);
            Consumer consumer = new Consumer(sharedQueue);

            producer.start();
            consumer.start();

            producer.join();
            consumer.join();

            System.out.println("Processing completed successfully!");

        } catch (Exception e) {
            System.out.println("Unexpected error occurred.");
        }
    }
}

