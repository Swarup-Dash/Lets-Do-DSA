package SingleLinkedList;

public class DeletetionAtEnd {

    public static Node deleteAtEnd(Node head){

        if(head == null){
            return null;
        }
        if(head.next == null){
            head = null;
            return head;
        }

        Node second_last = head;
        while(second_last.next.next!=null){
            second_last = second_last.next;
        }

        second_last.next = null;


        return head;
    }
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
        head = deleteAtEnd(head);

        InsertationInEnd.printList(head);
    
    }


}
