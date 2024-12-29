package SingleLinkedList;

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeletionAtPosition {
    public static void main(String[] args) {
        
        Node data1 = new Node(10);
        Node data2 = new Node(20);
        Node data3 = new Node(30);
        Node data4 = new Node(40);
        Node data5 = new Node(50);

        data1.next = data2;
        data2.next = data3;
        data3.next = data4;
        data4.next = data5;

        Node head = data1;
        int pos = 3;
        head = deleteSpecific(head, pos); // Update the head after deletion
        printList(head);
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static Node deleteSpecific(Node head, int position) {
        if (head == null || position < 1) {
            return head; // Return head as it is if invalid position or empty list
        }

        if (position == 1) {
            Node temp = head;
            head = head.next;
            temp = null; // Free memory (optional in Java, handled by GC)
            return head; // Return the new head
        }

        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            return head; // Return head as it is if position is out of bounds
        }

        Node temp = current.next;
        current.next = current.next.next; // Remove the node
        temp = null; // Free memory (optional)

        return head; // Return the updated head
    }
}
