package framework.solution;

import domains.farmer.FarmerProblem;
import domains.puzzle.PuzzleProblem;
import framework.problem.Benchmark;
import framework.problem.Problem;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * @author tcolburn
 */
public class GraphSolverTest {

    private Problem problem;
    private Solver bfsSolver;
    private Solver dfsSolver;

    @Test
    public void testFarmerGraphSolver() {
        problem = new FarmerProblem();
        bfsSolver = new BFSGraphSolver(problem);
        dfsSolver = new DFSGraphSolver(problem);
        bfsSolver.solve();
        assertTrue(bfsSolver.getSolution().getLength() == 7);
        problem.setCurrentState(problem.getInitialState());
        dfsSolver.solve();
        System.out.println("FWGC graph solver test passed");
    }

    @Test
    public void testPuzzleGraphSolver() {
        problem = new PuzzleProblem();
        bfsSolver = new BFSGraphSolver(problem);
        dfsSolver = new DFSGraphSolver(problem);
        for (Benchmark b : problem.getBenchmarks()) {
            problem.setCurrentState(b.getStart());
            bfsSolver.solve();
            assertTrue(bfsSolver.getSolution().getLength() == b.getSolutionLength());
            problem.setCurrentState(b.getStart());
            dfsSolver.solve();
            System.out.println(b.getName() + " graph solver test" + " passed");
        }
    }
}
