package DoubleLinkedList;

public class DeletetationAtEnd {

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
        head = delEnd(head);

        InsertationAtBegining.printList(head);

    }

    static Node delEnd(Node head){

        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        if (curr.prev != null) {
            curr.prev.next = null;
        }

        return head;

    }

}
