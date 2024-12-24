package SingleLinkedList;

public class InsertationInSLLBeginning {

    public static Node insertionSLL(Node head, int value){

        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

        return head;

    }

    public static void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        Node node5 = new Node(50);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        Node head = node1;
        int value = 9;

        head = insertionSLL(head, value);

        // Print the updated linked list
        printList(head);

    }
}
