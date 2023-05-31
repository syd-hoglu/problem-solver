package domains.puzzle;

import framework.problem.Mover;
import framework.problem.State;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testing class for the PuzzleMover class
 * @author Sydney Hoglund Section 001
 */
public class PuzzleMoverTest {

    /**
     * Declare private instance fields here. For example:
     */
    private final State start, other;
    private State next;
    private final Mover mover;
    private final String slide1, slide2, slide3, slide4, // move names
            slide5, slide6, slide7, slide8;
    private final List<String> moveNames;

    public PuzzleMoverTest() {
        mover = new PuzzleMover();
        int[][] start2 = {{2, 8, 3}, {1, 6, 4}, {7, 0, 5}};
        start = new PuzzleState(start2);
        int[][] otherw = {{6, 8, 3}, {1, 0, 4}, {7, 2, 5}};
        other = new PuzzleState(otherw);

        moveNames = mover.getMoveNames();
        slide1 = moveNames.get(0);
        slide2 = moveNames.get(1);
        slide3 = moveNames.get(2);
        slide4 = moveNames.get(3);
        slide5 = moveNames.get(4);
        slide6 = moveNames.get(5);
        slide7 = moveNames.get(6);
        slide8 = moveNames.get(7);
    }

    /**
     * Test all moves in the methods below by replacing the calls to fail.
     */
    @Test
    public void testSlide1() {
        assertTrue(mover.doMove(slide1, start) == null);
        int[][] arr1 = {{2, 8, 3}, {1, 0, 4}, {7, 6, 5}};
        int[][] arr2 = {{2, 8, 3}, {0, 1, 4}, {7, 6, 5}};
        doMoveLegal(slide1, arr1, arr2);
        int[][] arr3 = {{2, 1, 3}, {8, 0, 4}, {7, 6, 5}};
        int[][] arr4 = {{2, 0, 3}, {8, 1, 4}, {7, 6, 5}};
        doMoveLegal(slide1, arr3, arr4);
    }

    @Test
    public void testSlide2() {
        assertTrue(mover.doMove(slide2, start) == null);
        int[][] arr1 = {{2, 0, 3}, {1, 8, 4}, {7, 6, 5}};
        int[][] arr2 = {{0, 2, 3}, {1, 8, 4}, {7, 6, 5}};
        doMoveLegal(slide2, arr1, arr2);
        int[][] arr3 = {{6, 8, 3}, {1, 0, 4}, {7, 2, 5}};
        int[][] arr4 = {{6, 8, 3}, {1, 2, 4}, {7, 0, 5}};
        doMoveLegal(slide2, arr3, arr4);
    }

    @Test
    public void testSlide3() {
        assertTrue(mover.doMove(slide3, start) == null);
        int[][] arr1 = {{2, 0, 3}, {1, 8, 4}, {7, 6, 5}};
        int[][] arr2 = {{2, 3, 0}, {1, 8, 4}, {7, 6, 5}};
        doMoveLegal(slide3, arr1, arr2);
        int[][] arr3 = {{2, 4, 3}, {1, 8, 0}, {7, 6, 5}};
        int[][] arr4 = {{2, 4, 0}, {1, 8, 3}, {7, 6, 5}};
        doMoveLegal(slide3, arr3, arr4);
    }

    @Test
    public void testSlide4() {
        assertTrue(mover.doMove(slide4, start) == null);
        int[][] arr1 = {{2, 8, 3}, {1, 0, 4}, {7, 6, 5}};
        int[][] arr2 = {{2, 8, 3}, {1, 4, 0}, {7, 6, 5}};
        doMoveLegal(slide4, arr1, arr2);
        int[][] arr3 = {{2, 8, 3}, {1, 0, 6}, {7, 4, 5}};
        int[][] arr4 = {{2, 8, 3}, {1, 4, 6}, {7, 0, 5}};
        doMoveLegal(slide4, arr3, arr4);
    }

    @Test
    public void testSlide5() {
        assertTrue(mover.doMove(slide5, other) == null);
        int[][] arr1 = {{2, 8, 3}, {1, 6, 4}, {7, 0, 5}};
        int[][] arr2 = {{2, 8, 3}, {1, 6, 4}, {7, 5, 0}};
        doMoveLegal(slide5, arr1, arr2);
        int[][] arr3 = {{2, 8, 3}, {1, 5, 4}, {7, 0, 6}};
        int[][] arr4 = {{2, 8, 3}, {1, 0, 4}, {7, 5, 6}};
        doMoveLegal(slide5, arr3, arr4);
    }

    @Test
    public void testSlide6() {
        assertTrue(mover.doMove(slide6, other) == null);
        int[][] arr1 = {{2, 8, 3}, {1, 6, 4}, {7, 0, 5}};
        int[][] arr2 = {{2, 8, 3}, {1, 0, 4}, {7, 6, 5}};
        doMoveLegal(slide6, arr1, arr2);
        int[][] arr3 = {{2, 8, 3}, {1, 7, 4}, {6, 0, 5}};
        int[][] arr4 = {{2, 8, 3}, {1, 7, 4}, {0, 6, 5}};
        doMoveLegal(slide6, arr3, arr4);
    }

    @Test
    public void testSlide7() {
        assertTrue(mover.doMove(slide7, other) == null);
        int[][] arr1 = {{2, 8, 3}, {1, 6, 4}, {7, 0, 5}};
        int[][] arr2 = {{2, 8, 3}, {1, 6, 4}, {0, 7, 5}};
        doMoveLegal(slide7, arr1, arr2);
        int[][] arr3 = {{2, 8, 3}, {1, 7, 4}, {6, 0, 5}};
        int[][] arr4 = {{2, 8, 3}, {1, 0, 4}, {6, 7, 5}};
        doMoveLegal(slide7, arr3, arr4);
    }

    @Test
    public void testSlide8() {
        assertTrue(mover.doMove(slide8, start) == null);
        int[][] arr1 = {{2, 8, 3}, {1, 0, 4}, {7, 6, 5}};
        int[][] arr2 = {{2, 0, 3}, {1, 8, 4}, {7, 6, 5}};
        doMoveLegal(slide8, arr1, arr2);
        int[][] arr3 = {{2, 8, 0}, {1, 3, 4}, {7, 6, 5}};
        int[][] arr4 = {{2, 0, 8}, {1, 3, 4}, {7, 6, 5}};
        doMoveLegal(slide8, arr3, arr4);
    }

    private void doMoveLegal(String m, int[][] current, int[][] nexty) {
        PuzzleState curr = new PuzzleState(current);
        PuzzleState copy = new PuzzleState(current);
        next = mover.doMove(m, curr);
        assertTrue(next != null);
        assertTrue(((PuzzleState) next).equals(new PuzzleState(nexty)));
        assertTrue(curr.equals(copy));
    }

}
