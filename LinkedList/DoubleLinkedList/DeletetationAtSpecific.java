package DoubleLinkedList;

public class DeletetationAtSpecific {

    static Node deleteSpecific(Node head, int pos){

        if (head == null) {
            return head;
        }

        Node curr = head;

        for (int i = 1; curr != null && i < pos; ++i) {
            curr = curr.next;
        }

        if (curr == null) {
            return head;
        }

        if (curr.prev != null) {
            curr.prev.next = curr.next;
        }

        if (curr.next != null) {
            curr.next.prev = curr.prev;
        }

        if (head == curr) {
            head = curr.next;
        }

        return head;

    }
    
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
        int pos = 2;
        head = deleteSpecific(head, pos);
        InsertationAtBegining.printList(head);
    }

}
