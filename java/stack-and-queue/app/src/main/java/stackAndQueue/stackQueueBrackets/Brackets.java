package stackAndQueue.stackQueueBrackets;

import stackAndQueue.Stack;

public class Brackets<T> {
  Stack<Character> stack= new Stack<>();

  public boolean  validateBrackets(String value){
    for (int i= 0;i<value.length();i++) {
      if (value.charAt(i) == '{' || value.charAt(i) == '(' || value.charAt(i) == '[') {
        stack.push(value.charAt(i));
      } else if (value.charAt(i) == '}' || value.charAt(i) == ')' || value.charAt(i) == ']') {
        if(stack.size==0){
          return false;
        }
        switch (value.charAt(i)){
          case '}':
            if(stack.peek()!='{'){
              return false;
            }else {
              stack.pop();
            }
            break;
          case ')':
            if(stack.peek()!='('){
              return false;
            }else {
              stack.pop();
            }
            break;
          case ']':
            if(stack.peek()!='['){
              return false;
            }else {
              stack.pop();
            }
            break;
        }

      }
    }
    if(stack.size!=0){
      return false;
    }
      return true;
  }

}
