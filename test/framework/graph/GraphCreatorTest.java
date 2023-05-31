package framework.graph;

import domains.farmer.FarmerProblem;
import domains.puzzle.PuzzleProblem;
import framework.problem.Problem;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * @author tcolburn
 */
public class GraphCreatorTest {

    private Problem problem;
    private GraphCreator creator;
    private Graph graph;

    @Test
    public void testFarmerGraphCreate() {
        problem = new FarmerProblem();
        createGraph();
        assertTrue(graph.getNumVertices() == 10);
        assertTrue(graph.getNumEdges() == 20);
        System.out.println("Farmer graph creation passed");
    }

    @Test
    public void testPuzzleGraphCreate() {
        problem = new PuzzleProblem();
        createGraph();
        assertTrue(graph.getNumVertices() == 181440);
        assertTrue(graph.getNumEdges() == 483840);
        System.out.println("Puzzle graph creation passed");
    }

    private void createGraph() {
        creator = new GraphCreator();
        graph = creator.createGraphFor(problem);
    }
}
