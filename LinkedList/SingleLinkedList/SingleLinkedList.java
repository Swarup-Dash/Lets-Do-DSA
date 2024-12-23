package SingleLinkedList;
// Traversal of Singly Linked List

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next = null;
    }
}

public class SingleLinkedList{

    public static void traverseLinkedList(Node head){

    // Start from the head of the linked list
    // Node current = head;

    // Traverse the linked list until reaching the end
    // (null)
    while (head != null) {

        // Print the data of the current node
        System.out.print(head.data + " ");

        // Move to the next node
        head = head.next;
    }

    System.out.println();
}
public static void main(String[] args) {
    // Create nodes
    Node node1 = new Node(10);
    Node node2 = new Node(20);
    Node node3 = new Node(30);

    // Link the nodes
    node1.next = node2;
    node2.next = node3;

    // Head of the linked list
    Node head = node1;

    // Traverse and print the linked list
    traverseLinkedList(head);
}
}