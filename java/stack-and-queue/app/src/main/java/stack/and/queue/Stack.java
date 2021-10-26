package stack.and.queue;

public class Stack <T>{
  public Node top;

  public Stack(){
    this.top=null;
  }

  public boolean isEmpty(){
    return top==null;
  }

  public void push(T value){
    Node newNode =  new Node(value);
    newNode.next=top;
    top=newNode;
  }

  public T pop(){
    if(isEmpty()){
      return (T) "can't remove from empty stack";
    }else {
      Node temp = top;
      top = top.next;
      temp.next=null;
      return (T) temp.value;
    }
  }

  public T peek(){
    if(isEmpty()){
      return (T) "can't return any thing from empty stack";
    }else {
      return (T) top.value;
    }
  }

  @Override
  public String toString() {
    String result = "Stack: ";
    Node temp = top;
    while (temp != null){
      result += "["+temp.value+"]" + "=>";
      temp = temp.next;
    }
    result +="Null";
    return result;

  }
}
