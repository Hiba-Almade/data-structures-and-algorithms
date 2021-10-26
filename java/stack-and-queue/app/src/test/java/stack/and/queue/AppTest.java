/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package stack.and.queue;

import org.junit.jupiter.api.Test;
import stack.and.queue.animal.Animal;
import stack.and.queue.animal.AnimalShelter;
import stack.and.queue.animal.Cat;
import stack.and.queue.animal.Dog;
import stack.and.queue.pseudoQueue.PseudoQueue;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  Stack <Integer> stack =new Stack<>();
  Queue<Integer> queue = new Queue<>();

  //------------------Stack------------------------

    @Test void addStackTest() {
       stack.push(2);
       assertEquals(stack.toString(),"Stack: [2]=>Null");
    }

  @Test void addMultiStackTest() {
    stack.push(2);
    stack.push(5);
    stack.push(4);
    assertEquals(stack.toString(),"Stack: [4]=>[5]=>[2]=>Null");
  }

  @Test void popStackTest() {
    stack.push(2);
    stack.push(5);

    assertEquals(stack.pop(),5);
  }

  @Test void popMultiStackTest() {
    stack.push(2);
    stack.push(5);
    stack.pop();
    stack.pop();
    assertEquals(stack.pop(),"can't remove from empty stack");
  }

  @Test void peekStackTest() {
    stack.push(2);
    stack.push(5);
    assertEquals(stack.peek(),5);
  }

  @Test void emptyPeekStackTest() {
    assertEquals(stack.peek(),"can't return any thing from empty stack");
  }

  @Test void emptyStackTest() {
    assertEquals(stack.top,null);
  }

  // -----------------Queue test---------------------------

  @Test void enqueueQueueTest() {
      queue.enqueue(5);
      assertEquals(queue.toString(),"Queue: [5]=>Null");
  }

  @Test void enqueueMultiQueueTest() {
    queue.enqueue(5);
    queue.enqueue(10);
    assertEquals(queue.toString(),"Queue: [5]=>[10]=>Null");
  }

  @Test void dequeueQueueTest() {
    queue.enqueue(5);
    queue.enqueue(10);
    assertEquals( queue.dequeue(),5);
  }

  @Test void peekQueueTest() {
    queue.enqueue(5);
    queue.enqueue(10);
    assertEquals( queue.peek(),5);
  }

  @Test void dequeueMultiQueueTest() {
    queue.enqueue(5);
    queue.enqueue(10);
    queue.dequeue();
    queue.dequeue();
    assertEquals( queue.dequeue(),"can't remove from empty Queue");
  }

  @Test void emptyQueueTest() {
    assertEquals( queue.front,null);
  }

  @Test void peekEmptyQueueTest() {
    assertEquals( queue.peek(),"can't return any thing from empty Queue");
  }

//---------------------------------------------- pseudo queue test ----------------------------------------------

  @Test public void enqueuePseudoQueueTest() {
    PseudoQueue<Integer> queue = new PseudoQueue<>();
    queue.enqueue(3);
    assertEquals("PseudoQueue{Stack: [3]=>Null}",queue.toString());
  }

  @Test public void enqueueMultiplePseudoQueueTest() {
    PseudoQueue<Integer> queue = new PseudoQueue<>();
    queue.enqueue(3);
    queue.enqueue(6);
    queue.enqueue(9);
    assertEquals("PseudoQueue{Stack: [9]=>[6]=>[3]=>Null}",queue.toString());

  }
  @Test public void dequeuePseudoQueueTest() {
    PseudoQueue<Integer> queue = new PseudoQueue<>();
    queue.enqueue(3);
    queue.enqueue(6);
    queue.enqueue(9);
    queue.dequeue();
    assertEquals("PseudoQueue{Stack: [9]=>[6]=>Null}",queue.toString());

  }

  @Test public void dequeueMultiplePseudoQueueTest() {
    PseudoQueue<Integer> queue = new PseudoQueue<>();
    queue.enqueue(3);
    queue.enqueue(6);
    queue.enqueue(9);
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    assertEquals("PseudoQueue{Stack: Null}",queue.toString());
  }

  @Test public void enqueueAfterDequeueMultiplePseudoQueueTest() {
    PseudoQueue<Integer> queue = new PseudoQueue<>();
    queue.enqueue(3);
    queue.enqueue(6);
    queue.enqueue(9);
    queue.dequeue();
    queue.enqueue(10);
    assertEquals("PseudoQueue{Stack: [10]=>[9]=>[6]=>Null}",queue.toString());
  }

  @Test public void testInstantiateAnEmptyPseudoQueue() {
    PseudoQueue<Integer> myQueue = new PseudoQueue<>();

    String output = myQueue.toString();
    String expectedOutput = "null";
    assertEquals(expectedOutput,output);
  }
//-----------------------------------------------Animal test ----------------------------------------------------

  @Test public void emptyAnimalShelterTest() {
    AnimalShelter animalShelter = new AnimalShelter();
    assertEquals("AnimalShelter{animalQueue=Queue: Null}",animalShelter.toString());
  }

  @Test public void enqueueAnimalsShelterTest() {
    AnimalShelter animalShelter = new AnimalShelter();
    Dog dog = new Dog("dog");
    Cat cat1 = new Cat("cat1");
    Cat cat2 = new Cat("cat2");

    animalShelter.enqueue(dog);
    animalShelter.enqueue(cat1);
    animalShelter.enqueue(cat2);

    assertEquals("AnimalShelter{animalQueue=Queue: [Animal{name='dog'}]=>[Animal{name='cat1'}]=>[Animal{name='cat2'}]=>Null}",animalShelter.toString());
  }

  @Test public void dequeueCatTest() {
    AnimalShelter animalShelter = new AnimalShelter();
    Dog dog = new Dog("dog");
    Cat cat1 = new Cat("cat1");
    Cat cat2 = new Cat("cat2");

    animalShelter.enqueue(dog);
    animalShelter.enqueue(cat1);
    animalShelter.enqueue(cat2);
    Animal value = animalShelter.dequeue("cat");

    assertEquals("AnimalShelter{animalQueue=Queue: [Animal{name='dog'}]=>Null}",animalShelter.toString());

  }
  @Test public void dequeueDogTest() {
    AnimalShelter animalShelter = new AnimalShelter();
    Dog dog = new Dog("dog");
    Cat cat1 = new Cat("cat1");
    Cat cat2 = new Cat("cat2");

    animalShelter.enqueue(dog);
    animalShelter.enqueue(cat1);
    animalShelter.enqueue(cat2);
    Animal value = animalShelter.dequeue("dog");

    assertEquals("AnimalShelter{animalQueue=Queue: [Animal{name='cat1'}]=>[Animal{name='cat2'}]=>Null}",animalShelter.toString());

  }
  @Test public void dequeuePrefNullTest() {
    AnimalShelter animalShelter = new AnimalShelter();
    Dog dog = new Dog("dog");
    Cat cat1 = new Cat("cat1");
    Cat cat2 = new Cat("cat2");

    animalShelter.enqueue(dog);
    animalShelter.enqueue(cat1);
    animalShelter.enqueue(cat2);
    Animal value = animalShelter.dequeue("cats");

    assertEquals("AnimalShelter{animalQueue=Queue: [Animal{name='dog'}]=>[Animal{name='cat1'}]=>[Animal{name='cat2'}]=>Null}",animalShelter.toString());
    }


}
