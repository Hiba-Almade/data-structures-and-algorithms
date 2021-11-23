package hashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HashTable <K , V> {

  private ArrayList<HashNode<K, V>> bucketsArray;
  private int numBuckets;
  private int size;

  public HashTable() {
    bucketsArray = new ArrayList<>();
    numBuckets = 50;
    size = 0;
    for (int index = 0; index < numBuckets; index++) {
      bucketsArray.add(null);
    }
  }


  public int hash(K key) {
    return (Math.abs(key.hashCode())) % bucketsArray.size();
  }

// to add new value
  public void add(K key, V value) {
    int hashNodeIndex = hash(key);
    HashNode head = bucketsArray.get(hashNodeIndex);

    while (head != null) {
      // it's already added with this key
      if (head.getKey().equals(key)) {
        head.setValue(value);
        return;
      }
      head = head.next;
    }
    // not added
    size++;
    head = bucketsArray.get(hashNodeIndex);
    HashNode newNode = new HashNode(key, value);
    newNode.next = head;
    bucketsArray.set(hashNodeIndex, newNode);
    //System.out.println("added");


  }

  public V get(K key) {
    int bucketIndex = hash(key);
    HashNode head = bucketsArray.get(bucketIndex);
    while (head != null) {
      if (head.getKey().equals(key)) {
        return (V) head.getValue();
      }
      head = head.next;
    }

    return null;
  }

  public boolean contain(K key) {
    int bucketIndex = hash(key);
    HashNode head = bucketsArray.get(bucketIndex);
    while (head != null) {
      if (head.getKey().equals(key)) {
        return true;
      }
      head = head.next;
    }

    return false;
  }

  public int getSize() {

    return size;

  }

  public List<K> keys(){
    List<K> keys = new ArrayList<>();
    for (HashNode<K, V> bucket: bucketsArray){
      if(bucket != null) {
        keys.add(bucket.getKey());
      }
    }
    return keys;
  }
}
