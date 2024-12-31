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

    public Node(int data)     // Constructor to initialize the node with data

    {
        this.data = data;
        this.next = null;
    }
}

# Operations on Singly Linked List
    --Traversal
    --Searching
    --Length
    --Insertion:
        - At the beginning
        - At the end
        - At a specific position
    --Deletion:
        - At the beginning
        - At the end
        - At specific node

# ----------------------------------------------------------->

# Double Linked List--

A doubly linked list is a data structure that consists of a set of nodes, each of which contains a value and two pointers, one pointing to the previous node in the list and one pointing to the next node in the list. 

# Representation of Doubly Linked List in Data Structure

In a data structure, a doubly linked list is represented using nodes that have three fields:

    --Data
    --A pointer to the next node (next)
    --A pointer to the previous node (prev)

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

# ----------------------------------------------------------->

# Circular Linked List--

It is of 2 type:

    --Single Circular Linked List
    --Double Circular Linked List

#   1. Circular Singly Linked List

In Circular Singly Linked List, each node has just one pointer called the “next” pointer. The next pointer of last node points back to the first node and this results in forming a circle. In this type of Linked list we can only move through the list in one direction.

#   2. Circular Doubly Linked List:

In circular doubly linked list, each node has two pointers prev and next, similar to doubly linked list. The prev pointer points to the previous node and the next points to the next node. Here, in addition to the last node storing the address of the first node, the first node will also store the address of the last node.

# Operations on the Circular Linked list:

We can do some operations on the circular linked list similar to the singly and doubly linked list which are:

    --->Insertion
        -Insertion at the empty list
        -Insertion at the beginning
        -Insertion at the end
        -Insertion at the given position
    --->Deletion
        -Delete the first node
        -Delete the last node
        -Delete the node from any position
    --->Searching