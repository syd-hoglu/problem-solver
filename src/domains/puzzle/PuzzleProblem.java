package domains.puzzle;

import framework.problem.Problem;
import framework.problem.Benchmark;

/**
 * The problem class for the Puzzle Problem. Displays the problem and current
 * state and sets start and finish states.
 *
 * @author Sydney Hoglund section 001
 */
public class PuzzleProblem extends Problem {

    public PuzzleProblem() {
        super();
        super.setName("8-Puzzle");
        super.setIntroduction(INTRO);
        super.setMover(new PuzzleMover());
        int[][] start = {{2, 8, 3}, {1, 6, 4}, {7, 0, 5}};
        super.setInitialState(new PuzzleState(start));
        super.setCurrentState(super.getInitialState());
        int[][] end = {{1, 2, 3}, {8, 0, 4}, {7, 6, 5}};
        super.addBenchmark(new Benchmark("8-Puz 1: 5 Moves", 5, BENCH1, GOAL));
        super.addBenchmark(new Benchmark("8-Puz 2: 10 Moves", 10, BENCH2, GOAL));
        super.addBenchmark(new Benchmark("8-Puz 3: 13 Moves", 13, BENCH3, GOAL));
        super.addBenchmark(new Benchmark("8-Puz 4: 18 Moves", 18, BENCH4, GOAL));
        super.addBenchmark(new Benchmark("8-Puz 5: 20 Moves", 20, BENCH5, GOAL));
        super.addBenchmark(new Benchmark("8-Puz 6: 24 Moves", 24, BENCH6, GOAL));
        super.addBenchmark(new Benchmark("8-Puz 7: 30 Moves", 30, BENCH7, GOAL));
        super.addBenchmark(new Benchmark("8-Puz 8: 30 Moves", 30, BENCH8, GOAL));
        super.setFinalState(new PuzzleState(end));
    }

    private static final String INTRO
            = "You are given a board which numbered tiles can slide around. "
            + "There is one blank space that holds no tile. A legal\nmove "
            + "consists of sliding a tile into the blank space if the tile is "
            + "adjacent to it. The goal is to move the tiles around until the\n"
            + "board looks like the state below.";
    
    public static final PuzzleState BENCH1 = 
            new PuzzleState(new int[][]{new int[]{2, 8, 3}, 
                                        new int[]{1, 6, 4}, 
                                        new int[]{7, 0, 5}});
    public static final PuzzleState BENCH2 = 
            new PuzzleState(new int[][]{new int[]{3, 6, 4}, 
                                        new int[]{1, 0, 2}, 
                                        new int[]{8, 7, 5}});
    public static final PuzzleState BENCH3 = 
            new PuzzleState(new int[][]{new int[]{3, 0, 4}, 
                                        new int[]{1, 6, 5}, 
                                        new int[]{8, 2, 7}});
    public static final PuzzleState BENCH4 = 
            new PuzzleState(new int[][]{new int[]{2, 1, 3}, 
                                        new int[]{8, 0, 4}, 
                                        new int[]{6, 7, 5}});
    public static final PuzzleState BENCH5 = 
            new PuzzleState(new int[][]{new int[]{4, 2, 0}, 
                                        new int[]{8, 3, 6}, 
                                        new int[]{7, 5, 1}});
    public static final PuzzleState BENCH6 = 
            new PuzzleState(new int[][]{new int[]{1, 6, 3}, 
                                        new int[]{4, 0, 8}, 
                                        new int[]{7, 2, 5}});
    public static final PuzzleState BENCH7 = 
            new PuzzleState(new int[][]{new int[]{5, 6, 7}, 
                                        new int[]{4, 0, 8}, 
                                        new int[]{3, 2, 1}});
    public static final PuzzleState BENCH8 = 
            new PuzzleState(new int[][]{new int[]{5, 2, 7}, 
                                        new int[]{8, 0, 4}, 
                                        new int[]{3, 6, 1}});
    private static final PuzzleState GOAL = 
            new PuzzleState(new int[][]{new int[]{1, 2, 3}, 
                                        new int[]{8, 0, 4}, 
                                        new int[]{7, 6, 5}});
}
