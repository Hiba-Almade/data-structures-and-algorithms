# Singly Linked List
<!-- Short summary or background information -->
Crearte 2 main classes `>>` **Node Class , LinkedList Class** that contain some methods.
## Challenge
<!-- Description of the challenge -->
Writing a methods to Add , Search ,delete, print from a list

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
           > append.
           > insertAfter.
           > insertBefore.
           > remove.
           > fromEnd.

### API:

* #### insert:

  method take a nod as input and add it to the linked list before the head,
make its pointer pointing to the head then make it the new head.

  * The time and space = O(1).

* #### include:

  method take a value as input. then looping over the linked list.
if any node's value equal the input return true if not return false.

  * The time and space = O(n)

* #### toString:

  method looping over the list and return all value.

    * The time and space = O(n)


* #### append:

    Adds a new node with the given value to the end of the list.

   * The time and space = O(n)

* #### insertBefore:

     Adds a new node with the given new value immediately before the first node that has the value specified

   * The time and space = O(n)

* #### insertAfter:

  Adds a new node with the given new value immediately after the first node that has the value specified

  * The time and space = O(n)

* #### remove:

  Delete a node with the given value from the linked list.


  * The time and space = O(n)


* #### fromEnd:
  Return the node’s value that is k places from the tail of the linked list.

  * The time and space = O(n)
---
##### Whiteboard for (append , insertBefore and insertAfter method): [link](https://github.com/Hiba-Almade/data-structures-and-algorithms/tree/main/java/linkedList/challenge6)

##### Whiteboard for (fromEnd method): [link](https://github.com/Hiba-Almade/data-structures-and-algorithms/tree/main/java/linkedList/challenge7)


