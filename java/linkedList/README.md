# Singly Linked List
<!-- Short summary or background information -->
Crearte 2 main classes `>>` **Node Class , LinkedList Class** that contain some methods.
## Challenge
<!-- Description of the challenge -->
Writing a methods to Add , Search , print from a list

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

Creating 2 main classes `>>` **Node Class , LinkedList Class**

* #### Node class:

  contain:

         - fields:
            > Value
            > Next : pointer to th next node
         - constructor

* #### LinkedList class:
        _ fields:
           > head: the first node
        - default constructor
        - Methods:
           > insert.
           > include.
           > toString.

### API:

* #### insert:

method take a nod as input and add it to the linked list before the head,
make its pointer pointing to the head then make it the new head.

The time and space = O(1).

* #### include:

method tke a value as input. then looping over the linked list.
if any node's value equal the input return true if not return false.

The time and space = O(n)

* #### toStirng:

method looping over the list and return all value.

The time and space = O(n)
