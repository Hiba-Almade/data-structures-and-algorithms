package treeIntersection.Tree;

public class BinarySearchTree<T> extends BinaryTree {

  int size;

  public void add (T value){
    Node node=new Node(value);
    if(isEmpty()){
      root=node;
      size++;
      return;
    }else{
      Node current = root;
      while (current!=null){
        if((int)current.value >= (int)value){
          if(current.left == null){
            current.left=node;
            size++;
            return;
          }
          current=current.left;
        }else{
          if(current.right == null){
            current.right=node;
            size++;
            return;
          }
          current=current.right;
        }

      }
    }
  }

  public boolean contain(T value){
    if(isEmpty()){
      return false;
    }
    Node current =root;
    while (current!= null){
      if((int)current.value == (int)value){
        return true;
      }
      if((int)current.value > (int)value){
        current=current.left;
      }else {
        current=current.right;
      }
    }
    return false;
  }


}
