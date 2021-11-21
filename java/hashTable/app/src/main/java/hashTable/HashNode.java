package hashTable;

public class HashNode <K , V>{

  private K key;
  private V value;
  public HashNode next;


  public HashNode(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public void setKey(K key) {
    this.key = key;
  }

  public V getValue() {
    return value;
  }

  public void setValue(V value) {
    this.value = value;
  }

  public HashNode getNext() {
    return next;
  }

  public void setNext(HashNode next) {
    this.next = next;
  }


}
