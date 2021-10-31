# Trees
<!-- Short summary or background information -->

The  trees are un linear data structure. collection of nodes => every node has child.

=> **Binary Trees**: every node "root" has only two child "left & right".

=> **Binary Search Trees**: subtype from binary tree with some rules:
  * the left child lees than the root
  * the right child more than the root
## Challenge
<!-- Description of the challenge -->

Create the classes and
implement `add` and `contain` method to Binary search trees.
## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

#### implement Three classes:

* **Node**:

contain three field:

`-` value

`-` left: reference to the left child

`-` right: reference to the right child

* **BinaryTree**:

contain three method to traverse the tree and return a list of values of the tree in different order

`-` preOrder : root, left, right

`-` inOrder: left, root, right

`-` postOrder: left, right, root


* **BinarySearchTree**:

contain tow method:

`-` add(value): Add a new node with that value in the correct location in the binary search tree.

`-` contain(value): return true if the value is in the tree at least once otherwise return false
## API
<!-- Description of each method publicly available in each of your trees -->

### preOrder(root):

* create empty array list.
* add the root value to the list
* check if the left child not null call the method again: preOrder(root.left)
* check if the right child is not null call the method again : preOrder(root.right)

### inOrder(root):

* create empty array list.
* check if the left child not null call the method again: inOrder(root.left)
* add the root value to the list
* check if the right child is not null call the method again : inOrder(root.right)

### postOrder(root):

* create empty array list.
* check if the left child not null call the method again: postOrder(root.left)
* check if the right child is not null call the method again : postOrder(root.right)
* add the root value to the list


### add(value):

* set the value as the root of the tree if it empty.

* else:
* create a current node which will be equal the root.
* loop while this current not equal null:

* each time compare the value of the current node with the value we want to add.
* if the value is smaller than the current node's value, check the left child of the current node:
  * if there is no left child => add the new node as the left child of the current.

  * else, current=current.left and loop again
* else: check the right child in the same way.


### contain(value k):

* return false if the tree is empty.
* else:
* create a current node which will be equal the root.
* loop while this current not equal null:
* each time compare the value of the current node with k.
* return true if the current node equal to k
* if the value is less than the current's value check the left child:
  * return false if there is no left child
  * else: current=current.lest and loop again
* else: check the right child in the same way


---------

