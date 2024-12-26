package SingleLinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }

}


public class InsertationInEnd{

    public static Node insertAtEnd(Node head, int value){

        Node newNode = new Node(value);
    
        if(head==null){
            return newNode;
        }
    
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
    
        current.next = newNode;
    
        return head;
    
    }

    public static void printList(Node head){
        Node newItem = head;
        while(newItem!=null){
            System.out.println(newItem.data);
            newItem = newItem.next;
        }
    }
    public static void main(String[] args) {
        Node data1 = new Node(10);
        Node data2 = new Node(20);
        Node data3 = new Node(30);
        Node data4 = new Node(40);
        Node data5 = new Node(50);

        data1.next=data2;
        data2.next=data3;
        data3.next=data4;
        data4.next=data5;

        Node head = data1;
        int value = 60;

        head = insertAtEnd(head, value);

        printList(head);

    }
}

