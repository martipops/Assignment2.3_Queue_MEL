/**
 * A generic linked list node.
 * 
 * @author Marti Lonnemann
 * @version 1.0
 * Assignment 0.2 - Generic Linked List
 * Fall/2023
 *
 * @param <T> The type of data stored in the Node
 */

class Node<T> {
    T data;
    Node<T> nextNode;

    /**
     * Creates a new Node.
     */
    public Node() {
        nextNode = null;
        data = null;
    }
    
    /**
     * Creates a new Node with data.
     * 
     * @param T the data to instantiate the node with.
     */
    public Node(T data) {
        nextNode = null;
        this.data = data;
    }

    /**
     * Sets the data of the Node.
     *
     * @param data The data to set.
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Retrieves the Node.
     *
     * @return The Node.
     */
    public Node<T> getNode() {
        return this;
    }

    /**
     * Sets the next node.
     *
     * @param nextNode The next node to set.
     */
    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
}
