package domains.puzzle;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class tests 8-Puzzle heuristics.
 *
 * @author tcolburn
 */
public class PuzzleHeuristicTest {

    private final PuzzleState goal;
    private final PuzzleState test1;
    private final PuzzleState test2;
    private final PuzzleState test3;

    public PuzzleHeuristicTest() {

        goal = new PuzzleState(
                new int[][]{new int[]{1, 2, 3}, // the goal state
                new int[]{8, 0, 4},
                new int[]{7, 6, 5}});

        test1 = new PuzzleState(
                new int[][]{new int[]{2, 8, 3}, // 5 moves from goal
                new int[]{1, 6, 4},
                new int[]{7, 0, 5}});

        test2 = new PuzzleState(
                new int[][]{new int[]{5, 2, 7}, // 30 moves from goal
                new int[]{8, 0, 4},
                new int[]{3, 6, 1}});

        test3 = new PuzzleState(
                new int[][]{new int[]{5, 6, 7}, // also 30 moves from goal
                new int[]{4, 0, 8},
                new int[]{3, 2, 1}});
    }

    @Test
    public void testTilesOutOfPlace() {
        assertTrue(PuzzleState.tilesOutOfPlace(goal, goal) == 0);
        assertTrue(PuzzleState.tilesOutOfPlace(test1, goal) == 4);
        assertTrue(PuzzleState.tilesOutOfPlace(test2, goal) == 4);
        assertTrue(PuzzleState.tilesOutOfPlace(test3, goal) == 8);
    }

    @Test
    public void testSumManhattan() {
        assertTrue(PuzzleState.sumManhattan(goal, goal) == 0);
        assertTrue(PuzzleState.sumManhattan(test1, goal) == 5);
        assertTrue(PuzzleState.sumManhattan(test2, goal) == 16);
        assertTrue(PuzzleState.sumManhattan(test3, goal) == 24);
    }

}
