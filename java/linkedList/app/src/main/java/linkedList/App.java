/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
       LinkedList<Integer> testList = new LinkedList<Integer>();
       testList.insert(2);
       testList.insert(5);
       System.out.println(testList.toString());
       System.out.println(testList.include(1));
      System.out.println(testList.include(2));
      System.out.println(testList.head.value);
    }
}
