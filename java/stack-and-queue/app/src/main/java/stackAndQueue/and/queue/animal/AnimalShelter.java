package stack.and.queue.animal;


import stack.and.queue.Node;
import stack.and.queue.Queue;

import java.util.Locale;

public class AnimalShelter {
  Queue<Animal> animalQueue=new Queue<Animal>();

  public void enqueue(Animal animal){
    animalQueue.enqueue(animal);
  }

  public Animal dequeue( String pref){
    Node current=animalQueue.front;
    if((pref.toLowerCase().equals("dog")&& current.value instanceof Dog)||(pref.toLowerCase().equals("cat")&& current.value instanceof Cat)){
      animalQueue.dequeue();
      return (Animal) current.value;
    }
    while (current.next!=null){
      if((pref.toLowerCase().equals("dog")&& current.next.value instanceof Dog)||(pref.toLowerCase().equals("cat")&& current.next.value instanceof Cat)){
        Node temp = current.next;
        temp.next=null;
        current.next=current.next.next;
        return (Animal) temp.value;
      }
      current=current.next;
    }
    return null;
  }

  @Override
  public String toString() {
    return "AnimalShelter{" +
      "animalQueue=" + animalQueue.toString() +
      '}';
  }
}
