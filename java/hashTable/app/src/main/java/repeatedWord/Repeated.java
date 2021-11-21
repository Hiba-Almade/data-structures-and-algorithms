package repeatedWord;

import hashTable.HashTable;

import java.util.Locale;

public class Repeated {

  public String repeatedWord(String text){
    HashTable <String,Integer> hashTable=new HashTable();
    text=text.toLowerCase().replaceAll("[,.]", "");
    String[]word=text.split(" ");
    for (int i=0 ; i<word.length; i++){
      if(hashTable.contain(word[i])){
        return word[i];
      }else {
        hashTable.add(word[i],1);
      }
    }

    return "no repeated";
  }
}
