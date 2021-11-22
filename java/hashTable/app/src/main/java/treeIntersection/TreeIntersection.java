package treeIntersection;

import hashTable.HashTable;
import treeIntersection.Tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class TreeIntersection {

  public List<Integer> repeatedNodes(BinaryTree firstTree, BinaryTree secondTree){
    List<Integer> tree1= firstTree.inOrder(firstTree.root);
    List<Integer> tree2= secondTree.inOrder(secondTree.root);
    HashTable<Integer,Integer> hashTable= new HashTable<>();

    List<Integer> result = new ArrayList<>();

    for (int i = 0; i < tree1.size(); i++) {
      hashTable.add(tree1.get(i),tree1.get(i));
    }

    for (int i = 0; i < tree2.size(); i++) {
     if(hashTable.contain(tree2.get(i))){
       result.add(tree2.get(i));
     }
    }

    return result;
  }
}
