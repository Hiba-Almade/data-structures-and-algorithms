package graph;

import java.util.*;

public class Graph <T>{

  public HashSet<Node<T>> vertices;

  public Graph(){
    this.vertices = new HashSet<>();
  }

  public Node<T>addNode(T value){

      Node node = new Node(value);
      this.vertices.add(node);
      return node;

  }

  public void addEdge( Node <T> node1, Node<T> node2, int weight) {
    if( vertices.contains(node1) && vertices.contains(node2)){

      node1.addNeighbor(node2,weight);
      node2.addNeighbor(node1,weight);
    }
    else {
      System.out.println("Something wrong ");
    }
  }

  public HashSet<Node<T>>getNodes(){
    return this.vertices;
  }

  public List<Neighbor> getNeighbors(Node<T> node){
    if (vertices.contains(node)){
      return node.getNeighbors();
    }
    else{
    return null;
    }
  }

  public int getSize(){
    return this.vertices.size();
  }

  public static LinkedList<Node> breadthFirst(Node node){
    HashSet<Node> visited = new HashSet<>();
    Queue queue  = new LinkedList();

    queue.add(node);
    visited.add(node);
    LinkedList result = new LinkedList();
    result.add(node);
    while(!queue.isEmpty()){
      Node current = (Node) queue.poll();
      result.add(current);
      for(Neighbor neighbor: (List<Neighbor>) current.getNeighbors()){
        if(!visited.contains(neighbor.getNode())){
          queue.add(neighbor.getNode());
          visited.add(neighbor.getNode());
        }
      }
    }
    return result;
  }

}

