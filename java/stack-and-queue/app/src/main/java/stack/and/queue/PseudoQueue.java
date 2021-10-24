package stack.and.queue;

public class PseudoQueue<T> {

  private  Stack<T> firstStack = new Stack<>();
  private  Stack<T> secondStack = new Stack<>();


  public Stack<T> getFirstStack() {
    return firstStack;
  }

  public void setFirstStack(Stack<T> firstStack) {
    this.firstStack = firstStack;
  }

  public Stack<T> getSecondStack() {
    return secondStack;
  }

  public void setSecondStack(Stack<T> secondStack) {
    this.secondStack = secondStack;
  }

  public void enqueue(T value){
    this.firstStack.push(value);
  }

  public T dequeue(){
    while (firstStack.top != null){
      secondStack.push(firstStack.pop());
  }
  return secondStack.peek();
  }
}
