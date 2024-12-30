class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = next;
    }
}

public class InsertationInEmptyList{
    public static void main(String[] args) {
        Node last = null;

        last = insertInEmptyList(last, 10);
        
        System.out.print("List after insertion: ");
        printList(last);
    }
        
    static Node insertInEmptyList(Node last, int i) {

        if(last!=null){
            return last;
        }

        Node newNode = new Node(i);
        newNode.next = newNode;

        last = newNode;

        return last;
    }

    static void printList(Node last) {
        if (last == null) return;

        Node head = last.next;
        while (true) {
            System.out.print(head.data + " ");
            head = head.next;
            if (head == last.next) break;
        }
        System.out.println();
    }
}