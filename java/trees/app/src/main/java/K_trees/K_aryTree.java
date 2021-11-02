package K_trees;

import java.util.LinkedList;
import java.util.Queue;

public class K_aryTree<T> {

  public Node root;
  int nodes=0;
  int k=0;

  public K_aryTree(int k) {
    if(k<=1)
      k=2;
    this.k = k;
  }

  public void add(T value){
    nodes++;
    Node newNode = new Node(value);
    if( root == null){
      root = newNode;
      return;
    }
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()){

      Node currentNode = queue.poll();
      if(currentNode.children.size() < this.k){
        currentNode.addChild(newNode);
        return;
      }
      else {
        queue.addAll(currentNode.children);
      }
    }
  }

  public K_aryTree<String> fizzBuzzTree(K_aryTree<Integer> kTree){
    K_aryTree<String> newTree = new K_aryTree(kTree.k);

    Queue<Node> queue = new LinkedList<>();
    if(kTree.root != null){
      queue.add(kTree.root);
      while(!queue.isEmpty()){

        Node<Integer> current = queue.poll();
        String newValue;
        if(current.value % 3 == 0 && current.value % 5 ==0 ){
          newValue = "FizzBuzz";
        }else if((int)current.value % 3 == 0){
          newValue="Fizz";
        }else if((int)current.value % 5 == 0){
          newValue="Buzz";
        }else{
          newValue=current.value.toString();
        }

        newTree.add(newValue);

        if(! current.children.isEmpty())
          queue.addAll(current.children);
      }
    }
    return newTree;
  }

}
