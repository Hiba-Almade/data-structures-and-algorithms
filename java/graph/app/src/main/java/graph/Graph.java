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

  public boolean hasNode(T value){
    Node node=new Node(value);
    if(this.vertices.contains(node)){
      return true;
    }
    return false;
  }

  public Node getNode(T value){
    for(Node n: this.vertices){
      if(n.getValue()==value){
        return n;
      }
    }
    return null;
  }

  public int getEdge(Node<T>n1, Node<T>n2){
    List<Neighbor>list=n1.getNeighbors();

      for(Neighbor neighbor:list){
        if(neighbor.getNode() == n2){
          return neighbor.getWeight();
        }
      }

    return -1;
  }

  public int getSize(){
    return this.vertices.size();
  }

  public LinkedList<T> breadthFirst(Node node){
    HashSet<Node> visited = new HashSet<>();
    LinkedList<T> result = new LinkedList<>();
    Queue<Node> queue  = new LinkedList();

    queue.add(node);
    visited.add(node);

    while(!queue.isEmpty()){
      Node current = queue.poll();
      result.add((T) current.getValue());

      for(Neighbor neighbor: (List<Neighbor>) getNeighbors(current)){
        if(!visited.contains(neighbor.getNode())){
          queue.add(neighbor.getNode());
          visited.add(neighbor.getNode());
        }
      }
    }
    return result;
  }

  public String businessTrip(T[] city){
    int cost = 0 ;
    if(city.length <=1) {
      return "False, $0";
    }

    for(int i = 0 ; i <city.length -1; i++) {

      Node node1 = getNode(city[i]);
      Node node2 = getNode(city[i+1]);

      int edge = getEdge(node1, node2);
      if ( edge ==-1)
        return "False, $0";
      cost += edge;
    }
    return "True, $"+cost;
  }

}

