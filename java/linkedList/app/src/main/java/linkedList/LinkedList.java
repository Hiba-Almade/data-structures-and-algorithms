package linkedList;

public class LinkedList <T>{
  Node head;

  public LinkedList(){

    this.head=null;
  }

  // add new node in the first
  public void insert(T value){

    Node newNode = new Node(value);
    newNode.next=head;
    head=newNode;
  }

  // add node in the end
  public void append(T value){
    Node newNode = new Node(value);
    Node current = head;
    if(head == null){
      insert(value);
    }else{
      while (current.next != null){
        current=current.next;
      }
      current.next=newNode;
    }

  }

  // add before value
  public void insertBefore(T value, T newValue){
    Node newNode = new Node(newValue);
    Node current = head;
    if(head.value==value){
      insert(newValue);
    }else {
      while (current.next != null){
        if(current.next.value==value){
          newNode.next=current.next;
          current.next=newNode;
          return;
        }
        current=current.next;
      }
    }
  }

  // insert after value
  public void insertAfter(T value, T newValue){
    Node newNode = new Node(newValue);
    Node current = head;
    while (current != null){
      if(current.value == value){
        newNode.next=current.next;
        current.next=newNode;
        return;
      }
      current=current.next;
    }
  }

  // delete node

  public void remove(T value){
    Node current = head;
    if(head.value==value){
      head=head.next;
    }else {
      while (current != null){
        if(current.next.value == value){
          current.next=current.next.next;
          return;
        }
        current=current.next;
      }
    }

  }

  // search about value
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

  // print item
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
