class Node {
    public int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

/**
 * LinkedList
 */
public class LinkedList {
    static Node head;

    public static void main(String[] args) {
        head = null; // empty list

        Node node1 = new Node(2); // create a node
        // Node node2 = new Node(4);

        node1.next = head; 
        head = node1;

        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.print(head);
    }
}