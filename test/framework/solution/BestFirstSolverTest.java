package framework.solution;

import domains.puzzle.PuzzleProblem;
import framework.problem.Benchmark;
import framework.problem.Problem;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tcolburn
 */
public class BestFirstSolverTest {

    @Test
    public void testPuzzleBestFirstSolver() {
        Problem problem = new PuzzleProblem();
        BestFirstSolver bestFirstSolver = new BestFirstSolver(problem);
        for (Benchmark b : problem.getBenchmarks()) {
            problem.setCurrentState(b.getStart());
            bestFirstSolver.solve();
            System.out.println(b.getName() + " best-first solver test: " + bestFirstSolver.getSolution().getLength() + " moves");
        }
    }

}
