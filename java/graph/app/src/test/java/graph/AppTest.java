/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class AppTest {
  Graph graph = new Graph();
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

  @Test
  public void emptyGraphTest(){

    assertEquals( 0, graph.getSize());
  }

  @Test
  public void addNodeGraphTest() {
    Node n1 = graph.addNode(1);
    Node n2 = graph.addNode(2);
    assertTrue( graph.getSize() == 2);
    assertTrue( graph.getNodes().contains(n1));
    assertTrue( graph.getNodes().contains(n2));
  }

  @Test
  public void addEdgeGraphTest() {
    Node n1 = graph.addNode(1);
    Node n2 = graph.addNode(2);

    graph.addEdge(n1,n2,5);
    assertEquals(1,graph.getNeighbors(n1).size());
   assertEquals(1,graph.getNeighbors(n2).size());


  }

  @Test
  public void getNodes() {

    Node n1 = graph.addNode(1);
    Node n2 = graph.addNode(2);

    assertTrue(graph.getNodes().contains(n1));
    assertTrue(graph.getNodes().contains(n2));

  }

  @Test
  public void breadthFirstGraphTest() {
    Node n1 = graph.addNode(1);
    Node n2 = graph.addNode(2);
    Node n3 = graph.addNode(3);


    graph.addEdge(n1,n2,5);
    graph.addEdge(n1,n3,2);

    LinkedList<Node> result = new LinkedList<>();
    result.add(n1);
    result.add(n3);
    result.add(n2);

    assertEquals( result, graph.getNeighbors(n1));



  }

}