package DoubleLinkedList;

public class InsertationAtEnd {

    static Node insertAtend(Node head, int data){

        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
        }
        else{
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }

            curr.next = newNode;
            newNode.prev = curr;
        }

        return head;
    }
    public static void main(String[] args) {
        Node data1 = new Node(10);
        Node data2 = new Node(20);
        Node data3 = new Node(30);

        data1.next = data2;
        data2.prev = data1;
        data2.next = data3;
        data3.prev = data2;

        Node head = data1;
        int data = 9;

        head = insertAtend(head, data);
        InsertationAtBegining.printList(head);

    }
}
