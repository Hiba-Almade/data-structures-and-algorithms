/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package mergeSort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
      int[]arr={1,8,2,5,3};
      assertEquals("[1, 2, 3, 5, 8]",Arrays.toString(classUnderTest.mergeSort(arr)) );
      int[]arr2={};
      assertEquals("[]",Arrays.toString(classUnderTest.mergeSort(arr2)) );

    }

}
