package leftJoin;

import hashTable.HashNode;
import hashTable.HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class LeftJoin <K, V>{

  public List<List<K>> leftJoin (HashTable<K, V> leftHash, HashTable<K, V> rightHash){
    List<List<K>> result = new ArrayList<>();

    for (K key : leftHash.keys()){
      List<K> list = new ArrayList<>();
      list.add(key);
      list.add((K) leftHash.get(key));
      list.add((K) rightHash.get(key));
      result.add(list);
    }
    return result;
  }

}
