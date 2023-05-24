class Node {
    public int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}
public class InsertAtBegining {
    
   static Node head;

   public static void insert(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
    }

   public static void print(){
        Node temp = head;
        System.out.print("list is: ");
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print(temp);
    }

    public static void main(String[] args) {
        head = null;
        insert(5);
        insert(3);
        insert(8);
        print();
    }
}
