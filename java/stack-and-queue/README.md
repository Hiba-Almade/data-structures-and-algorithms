# Stacks and Queues
  <!-- Short summary or background information -->
 implement the Stack and Queue data structure
## Challenge
  <!-- Description of the challenge -->
   implement the classes for a Stack and Queue with its method and variable.
## Approach & Efficiency
  <!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
* create node class that contain pointer and next pointer.
* create a stack class that contain:
  * 'top': pointer to te first node, and it will be null in empty stack
  * posh(value),pop(),peek(), isEmpty() and toString() methods.
* create a queue class that contain:
  * front: pointer to the first node. and it will be null in empty queue.
  * rear: pointer to the last node.
  * enqueue(value),dequeue(),peek(), isEmpty() and toString() methods.

## API
  <!-- Description of each method publicly available to your Stack and Queue-->

#### Stack Method:

* **push(value):** add new value on the top. O(1)
* **pop():** move the top to the next node, remove the node and return its value. O(1)
* **peek():** return the value to the top node. O(1)
* **isEmpty:** return true if the stack is empty otherwise return false. O(1)
* **toString():** print the stack. O(n)

![satck](https://static.javatpoint.com/core/images/java-stack.png)

#### Queue method:

* **enqueue(value):** add new value on the rear. O(1)
* **dequeue():** move the front to the next node, remove the node and return its value. O(1)
* **peek():** return the value to the front node. O(1)
* **isEmpty:** return true if the queue is empty otherwise return false. O(1)
* **toString():** print the queue.O(n)

![queue](https://static.javatpoint.com/core/images/java-queue.png)
