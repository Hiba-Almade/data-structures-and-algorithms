package trees;

import java.util.ArrayList;

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

}
