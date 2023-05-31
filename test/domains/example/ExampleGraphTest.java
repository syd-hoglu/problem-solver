package domains.example;

import static domains.example.ExampleGraph.A;
import static domains.example.ExampleGraph.B;
import static domains.example.ExampleGraph.C;
import static domains.example.ExampleGraph.D;
import static domains.example.ExampleGraph.E;
import framework.graph.GraphSearcher;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author tcolburn
 */
public class ExampleGraphTest {

    public ExampleGraphTest() {
        graph = new ExampleGraph();
        searcher = new GraphSearcher(graph);
    }                                        // Predecessor Tree:

    @Test                                    //
    public void testBFS() {                  //       A
        searcher.breadthFirstSearch(A);      //     /   \
        assertTrue(D.getPredecessor() == B); //    B     C
        assertTrue(B.getPredecessor() == A); //    |     |
    }                                        //    D     E

    @Test
    public void testDFS() {                  //       A
        searcher.depthFirstSearch(A);        //     /   \
        assertTrue(D.getPredecessor() == E); //    B     C
        assertTrue(E.getPredecessor() == C); //          |
        assertTrue(C.getPredecessor() == A); //          E
    }                                        //          |
    //          D
    private ExampleGraph graph;
    private GraphSearcher searcher;
}
