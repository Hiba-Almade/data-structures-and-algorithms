package stack.and.queue;

public class Queue <T>{
  Node front;
  Node rear;

  public Queue(){
    this.front=null;
  }

  public boolean isEmpty(){
    return front == null;
  }

  public void enqueue(T value){
    Node newNode=new Node(value);
    if(isEmpty()){
      front=newNode;
    }else{
      rear.next=newNode;
    }
    rear=newNode;
  }

  public T dequeue(){
    if(isEmpty()){
        return (T)"can't remove from empty Queue";
    }else{
      Node temp = front;
      front=front.next;
      temp.next=null;
      return (T) temp.value;
    }
  }

  public T peek(){
    if(isEmpty()){
      return (T) "can't return any thing from empty Queue";
    }else {
      return (T) front.value;
    }
  }

  @Override
  public String toString() {
    String result = "Queue: ";
    Node temp = front;
    while (temp != null){
      result += "["+temp.value+"]" + "=>";
      temp = temp.next;
    }
    result +="Null";
    return result;

  }

}
