/**
 * A simple representation of a Queue
 * 
 * @author Marti Lonnemann
 * @version 1.0
 * Assignment 2.3 - Queue
 * Fall/2023
 *
 * @param <T> The type of data stored in the Queue
 */
public class Queue<T> {

    private LinkedList<T> linkedList;

    /**
     * Creates a new empty queue.
     */
    public Queue() {
        linkedList = new LinkedList<>();
    }

    /**
     * Adds an item to the end of the queue.
     *
     * @param item The item to be added to the queue.
     */
    public void enqueue(T item) {
        linkedList.add(item);
    }

    /**
     * Removes and returns the item at the front of the queue.
     *
     * @return The item removed from the front of the queue.
     */
    public T dequeue() {
        return linkedList.remove();
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if the queue is empty, false otherwise.
     */
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    /**
     * Prints the contents of the queue.
     */
    public void printQueue() {
        System.out.println(linkedList);
    }
}
