/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashTable;

import org.junit.jupiter.api.Test;
import repeatedWord.Repeated;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  HashTable<Integer,Integer> hashTable = new HashTable<>();
  Repeated repeated=new Repeated();
//    @Test void appHasAGreeting() {
//        App classUnderTest = new App();
//        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
//    }

  @Test void addHashTableTest() {
   hashTable.add(1,5);
   assertEquals(1,hashTable.getSize());
  }

  @Test void getHashTableTest() {
    hashTable.add(1,5);
    assertEquals(5,hashTable.get(1));
    assertEquals(null,hashTable.get(5));
  }

  @Test void addMultiHashTableTest() {
    hashTable.add(1,5);
    hashTable.add(1,6);
    assertEquals(1,hashTable.getSize());
    assertEquals(6,hashTable.get(1));

  }

  @Test void hashHashTableTest() {
    assertEquals(1,hashTable.hash(1));
    assertEquals(3,hashTable.hash(53));

  }


  //////////////////////////////////////////////////
  @Test void findRepeatedTest() {

    String text1 = "as any as, ";
    assertEquals("as",repeated.repeatedWord(text1));

    String text2 = "as any ";
    assertEquals("no repeated",repeated.repeatedWord(text2));

    String text3 = "";
    assertEquals("no repeated",repeated.repeatedWord(text3));

  }

}
