package stackAndQueue;

public class Queue <T>{
  public Node front;
  public Node rear;
  public int size;
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
    size++;
  }

  public T dequeue(){
    if(isEmpty()){
        return (T)"can't remove from empty Queue";
    }else{
      Node temp = front;
      front=front.next;
      temp.next=null;
      size--;
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
