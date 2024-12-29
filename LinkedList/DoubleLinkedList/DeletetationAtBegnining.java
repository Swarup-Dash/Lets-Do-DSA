package DoubleLinkedList;

public class DeletetationAtBegnining {
    public static void main(String[] args) {
        
        Node data1 = new Node(10);
        Node data2 = new Node(20);
        Node data3 = new Node(30);
        Node data4 = new Node(40);

        data1.next = data2;
        data2.prev = data1;
        data2.next = data3;
        data3.prev = data2;
        data3.next = data4;
        data4.prev = data3;

        Node head = data1;
        head = delHead(head);

        InsertationAtBegining.printList(head);
    }

    public static Node delHead(Node head) {

        if (head == null) {
            return null;
        }

        head = head.next;

        if (head != null) {
            head.prev = null;
        }

        return head;
    }
}
