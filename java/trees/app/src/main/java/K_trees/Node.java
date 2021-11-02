package K_trees;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
  public T value;
  public List<Node> children = new ArrayList<>();

  public void addChild(Node child){
    children.add(child);
  }
  public Node(T value){
    this.value=value;
  }

}
