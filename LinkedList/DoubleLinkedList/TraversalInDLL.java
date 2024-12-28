package DoubleLinkedList;

class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        next=prev=null;
    }
}

public class TraversalInDLL {

    static void forwardTraverse(Node head){
        
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.err.println();
    }

    static void backwardTraverse(Node tail){

        while(tail!=null){
            System.out.print(tail.data + " ");
            tail=tail.prev;
        }
    }


    public static void main(String[] args) {
        Node data1 = new Node(10);
        Node data2 = new Node(20);
        Node data3 = new Node(30);

        data1.next=data2;
        data2.prev=data1;
        data2.next=data3;
        data3.prev=data2;

        Node head = data1;
        Node tail = data3;
        forwardTraverse(head);
        backwardTraverse(tail);
    }
}
