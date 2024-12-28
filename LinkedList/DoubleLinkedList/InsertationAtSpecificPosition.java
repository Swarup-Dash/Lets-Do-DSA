package DoubleLinkedList;

public class InsertationAtSpecificPosition {

    static Node insertAtSpecific(Node head, int data, int pos){
        Node newNode = new Node(data);

        if (pos == 1) {
            newNode.next = head;

            if (head != null) {
                head.prev = newNode;
            }

            head = newNode;
            return head;
        }

        Node curr = head;
      
        for (int i = 1; i < pos - 1 && curr != null; ++i) {
            curr = curr.next;
        }

        if (curr == null) {
            System.out.println("Position is out of bounds.");
            return head;
        }

        newNode.prev = curr;
        newNode.next = curr.next;
        curr.next = newNode;

        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }

        return head;
    }


    public static void main(String[] args) {

        Node data1 = new Node(10);
        Node data2 = new Node(30); 
        Node data3 = new Node(40);

        data1.next = data2;
        data2.prev = data1;
        data2.next = data3;
        data3.prev = data2;

        Node head = data1;
        int data = 20;
        int pos = 2;

        head = insertAtSpecific(head, data, pos);
        InsertationAtBegining.printList(head);
    }
}
