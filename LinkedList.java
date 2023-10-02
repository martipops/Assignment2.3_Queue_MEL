/**
 * A generic linked list.
 * 
 * @author Marti Lonnemann
 * @version 1.0
 * Assignment 0.2 - Generic Linked List
 * Fall/2023
 *
 * @param <T> The type of data stored in the LinkedList.
 */
public class LinkedList<T> {

    Node<T> head;
    int length;
    Node<T> tail;

    /**
     * Creates a new empty LinkedList.
     */
    public LinkedList() {
        head = null;
        length = 0;
        tail = head;
    }

    /**
     * Checks whether the linked list is empty or not.
     *
     * @return True if empty, otherwise false.
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Retrieves the head node.
     *
     * @return The head node.
     */
    public Node<T> getList() {
        return head;
    }

    /**
     * Adds a new node to the end.
     *
     * @param aNode The node to add.
     */
    public void addNode(Node<T> aNode) {
        if (isEmpty()) {
            head = aNode;
            tail = head;
            return;
        }
        tail.nextNode = aNode;
        tail = tail.nextNode;
        tail.nextNode = null;
        length++;
    }

    /**
     * Adds a new node to the end based on specified data.
     *
     * @param data The data of the node to add.
     */
    public void add(T data) {
        addNode(new Node<T>(data));
    }


    /**
     * Removes the head node of the linked list
     * 
     * @return The removed node
     */
    public T remove() {
        if (head == null) {
            return null;
        }

        T data = head.data;
        head = head.nextNode;
        if (head == null) {
            tail = null;
        }
        return data;
    }

    /**
     * Returns a string representation of the linked list.
     *
     * @return The linked list as a String
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            result.append(current.data);
            if (current.nextNode != null) 
                result.append("\n");
            current = current.nextNode;
        }

        return result.toString();
    }

    
}
