package SingleLinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class SearchingInSLL {

    public static boolean searchSLL(Node head, int target){

        while(head!=null){
            if(head.data == target){
                return true;
            }
            head = head.next;
        }


        return false;
    }


    public static void main(String[] args) {
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Node head = node1;
        int target = 50;

        System.out.println("Target found: " + searchSLL(head, target));


    }
}
