/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

  @Test public void createTreeTest() {
    BinarySearchTree<Integer> tree=new BinarySearchTree<>();
    assertNotNull(tree);
  }

  @Test public void addRootTreeTest() {
    BinarySearchTree<Integer> tree=new BinarySearchTree<>();
    tree.add(10);
    assertEquals(1,tree.size);
  }

  @Test public void addLestRightTreeTest() {
    BinarySearchTree<Integer> tree=new BinarySearchTree<>();
    tree.add(10);
    tree.add(30);
    tree.add(5);
    assertEquals(3,tree.size);
    assertEquals(30,tree.root.right.value);
    assertEquals(5,tree.root.left.value);
  }

  @Test public void preOrderTreeTest() {
    BinarySearchTree<Integer> tree=new BinarySearchTree<>();
    tree.add(10);
    tree.add(30);
    tree.add(5);
    assertEquals("[10, 5, 30]",tree.preOrder(tree.root).toString());

  }

  @Test public void inOrderTreeTest() {
    BinarySearchTree<Integer> tree=new BinarySearchTree<>();
    tree.add(10);
    tree.add(30);
    tree.add(5);
    assertEquals("[5, 10, 30]",tree.inOrder(tree.root).toString());

  }

  @Test public void postOrderTreeTest() {
    BinarySearchTree<Integer> tree=new BinarySearchTree<>();
    tree.add(10);
    tree.add(30);
    tree.add(5);
    assertEquals("[5, 30, 10]",tree.postOrder(tree.root).toString());

  }

  @Test public void maxValueTreeTest() {
    BinarySearchTree<Integer> tree=new BinarySearchTree<>();
    tree.add(10);
    tree.add(30);
    tree.add(5);
    assertEquals(30,tree.maxValue(tree.root));

  }


}
