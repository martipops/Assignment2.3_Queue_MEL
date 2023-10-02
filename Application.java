/**
 * A simple application class for testing the Queue class
 * 
 * @author Marti Lonnemann
 * @version 1.0
 * Assignment 0.2 - Generic Linked List
 * Fall/2023
 *
 * @param <T> The type of data stored in the Node
 */
public class Application {
    public static void main(String[] args) {
        Queue<String> queue = new Queue<>();

        queue.enqueue("Bill");
        queue.enqueue("Alice");
        queue.enqueue("Bob");
        queue.printQueue();

        queue.dequeue();
        System.out.println("A customer is served.");
        queue.printQueue();

        queue.enqueue("Jane");
        System.out.println("Jane has Arrived");
        queue.enqueue("Hamad");
        System.out.println("Hamad has Arrived");
        queue.printQueue();
        
        queue.dequeue();
        queue.dequeue();
        System.out.println("Two customers are served.");
        queue.printQueue();

        queue.dequeue();
        System.out.println("Another customer is served.");
        queue.printQueue();

        queue.dequeue();
        System.out.println("Another customer is served.");
        queue.printQueue();

        queue.enqueue("Jim");
        System.out.println("Jim has Arrived");
        queue.printQueue();
    }
}
