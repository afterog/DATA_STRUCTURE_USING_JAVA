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

    public static void main(String[] args) {
        Node head = new Node(0);
        Node node = head;

        for (int i = 1; i < 5; i++) {
            Node newNode = new Node(i);
            node.next = newNode;
            node = newNode;
        }

        // head.next = node1;
        // node1.next = node2;
        // node2.next = null;
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}