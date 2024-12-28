package DoubleLinkedList;

public class InsertationAtBegining {

    static Node insertationBegining(Node head, int newdata){

        Node new_Node = new Node(newdata);
        new_Node.next = head;

        if(head!=null){
            head.prev = new_Node;
        }

        return new_Node;
    }
    
    static void printList(Node head){
        while (head!=null) {
            System.out.println(head.data);
            head = head.next;
        }
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

        Node head = data1;
        int newdata = 9;

        head = insertationBegining(head, newdata);
        printList(head);
    }
}
