package graph;

import java.util.ArrayList;
import java.util.List;

public class Node <T> {
  private T value;
  private List<Neighbor> neighbors=new ArrayList<>();

  public Node(T value) {
    this.value = value;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public List<Neighbor> getNeighbors() {
    return neighbors;
  }

  public void setNeighbors(List<Neighbor> neighbors) {
    this.neighbors = neighbors;
  }

  public void addNeighbor(Node node,int weight){
    if(!this.neighbors.contains(node)){
      Neighbor neighbor= new Neighbor(node,weight);
      this.neighbors.add(neighbor);
    }
  }
}
