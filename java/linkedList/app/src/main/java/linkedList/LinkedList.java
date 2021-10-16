package linkedList;

public class LinkedList <T>{
  Node head;

  public LinkedList(){
    this.head=null;
  }

  public void insert(T value){
    Node newNode = new Node(value);
    newNode.next=head;
    head=newNode;
  }

  public boolean include(T value){
    Node current = head;
    while (current != null){
      if(current.value.equals(value)){
        return true;
      }
      current=current.next;
    }
    return false;
  }

  @Override
  public String toString(){
    Node current = head;
    String result="";
    while (current != null){
      result +="{"+current.value+"}->";
      current=current.next;
    }
    result +="Null";
    return result;
  }
}
