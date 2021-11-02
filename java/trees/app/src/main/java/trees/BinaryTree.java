package trees;

import java.util.*;

public class BinaryTree <T>{
  Node root;

  public BinaryTree(){
    this.root=null;
  }

  public boolean isEmpty(){
    return root==null;
  }

  // depth first traversals' method.

  public ArrayList preOrder(Node root){ // root, left, right
    ArrayList <T> arrayList = new ArrayList<>();
    if(!isEmpty()){
      arrayList.add((T) root.value);
      if(root.left != null) {
        arrayList.addAll(preOrder(root.left));
      }
      if(root.right != null) {
        arrayList.addAll(preOrder(root.right));
      }
    }

    return arrayList;
  }


  public ArrayList inOrder(Node root){ // left, root, right
    ArrayList<T> arrayList=new ArrayList<>();
    if(!isEmpty()){
      if (root.left!=null) {
        arrayList.addAll(inOrder(root.left));
      }
      arrayList.add((T) root.value);
      if(root.right!=null){
        arrayList.addAll(inOrder(root.right));
      }

    }
    return arrayList;
  }

  public ArrayList postOrder(Node root){ // left, right, root
    ArrayList<T> arrayList=new ArrayList<>();
    if(!isEmpty()){
      if(root.left!=null){
        arrayList.addAll(postOrder(root.left));
      }
      if(root.right!=null){
        arrayList.addAll(postOrder(root.right));
      }
      arrayList.add((T) root.value);
    }
    return arrayList;
  }

  public int maxValue(Node root){
    if( root != null){
      int max=(int) root.value;
      int left= max;
      int right= max;
      if(root.left == null && root.right == null){
        return (int) root.value;
      }
      if(root.left != null){
        left= maxValue(root.left);
      }
      if(root.right != null){
        right= maxValue(root.right);
      }
      if( left > max){
        max= left;
      }
      if(right > max){
        max= right;
      }
      return max;
    }
    return -1;
  }

  public List <T> treeBreadthFirst(){
    List <T> list=new ArrayList<>();
    Queue<Node> queue=new LinkedList<>();
    if(root!=null){
      queue.add(root);
      while (!queue.isEmpty()){
        Node current=queue.poll();
        list.add((T)current.value);
        if(current.left!=null){
          queue.add( current.left);
        }
        if(current.right!=null){
          queue.add( current.right);
        }
      }
    }
    return list;
  }




}
