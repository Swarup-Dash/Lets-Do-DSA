package SingleLinkedList;

public class InsertationAtSpecificPosition {
    public static void main(String[] args) {
        Node data1 = new Node(10);
        Node data2 = new Node(20);
        Node data3 = new Node(40);
        Node data4 = new Node(50);

        data1.next=data2;
        data2.next=data3;
        data3.next=data4;

        Node head = data1;
        int pos = 3;
        int val = 30;

        head = insertAtPosition(head, val, pos);
        InsertationInEnd.printList(head); //PrintList method created in InsertationInEnd.java file
    }


    public static Node insertAtPosition(Node head, int value, int position) {
        Node newNode = new Node(value);

        // If inserting at the beginning (position 1)
        if (position == 1) {
            newNode.next = head;
            return newNode;
        }

        // Traverse to the node before the desired position
        Node current = head;
        int currentIndex = 1;

        while (current != null && currentIndex < position - 1) {
            current = current.next;
            currentIndex++;
        }

        // If the position is invalid (greater than the list size + 1)
        if (current == null) {
            System.out.println("Invalid position! Node cannot be inserted.");
            return head;
        }

        // Insert the new node
        newNode.next = current.next;
        current.next = newNode;

        return head;
    }
}
