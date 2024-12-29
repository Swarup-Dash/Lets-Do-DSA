# Lets-Do-DSA

# Linked List:   
                Singly Linked List
                Doubly Linked List
                Circular Linked List

# ----------------------------------------------------------->

# Singly Linked List--
A singly linked list is a fundamental data structure, it consists of nodes where each node contains a data field and a reference to the next node in the linked list. The next of the last node is null, indicating the end of the list. Linked Lists support efficient insertion and deletion operations.

# Definition of a Node in a singly linked list

public class Node {
    int data;
    Node next;

    // Constructor to initialize the node with data
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

# Operations on Singly Linked List
    Traversal
    Searching
    Length
    Insertion:
    Insert at the beginning
    Insert at the end
    Insert at a specific position
    Deletion:
    Delete from the beginning
    Delete from the end
    Delete a specific node

# ----------------------------------------------------------->

# Double Linked List--

A doubly linked list is a data structure that consists of a set of nodes, each of which contains a value and two pointers, one pointing to the previous node in the list and one pointing to the next node in the list. 

# Representation of Doubly Linked List in Data Structure

In a data structure, a doubly linked list is represented using nodes that have three fields:

-Data
-A pointer to the next node (next)
-A pointer to the previous node (prev)

# Implementation of a Node in a double linked list

class Node {

    // To store the Value or data.
    int data;

    // Reference to the Previous Node
    Node prev;
  
    // Reference to the next Node
    Node next;
  
    // Constructor
    Node(int d) {
       data = d;
       prev = next = null;      
    }
};

# Operations on Doubly Linked List
    -->Traversal in Doubly Linked List
    -->Searching in Doubly Linked List
    -->Finding Length of Doubly Linked List
    -->Insertion in Doubly Linked List:
        -At the Begnining
        -At the End
        -At the Specific Position
   
    -->Deletion in Doubly Linked List:
        -At the Begnining
        -At the End
        -At the Specific Position
