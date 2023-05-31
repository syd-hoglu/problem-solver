package domains.bigpuzzle;

import framework.problem.Problem;
import framework.problem.Benchmark;

/**
 * The problem class for the Puzzle Problem. Displays the problem and current
 * state and sets start and finish states.
 *
 * @author Sydney Hoglund section 001
 */
public class BigPuzzleProblem extends Problem {

    public BigPuzzleProblem() {
        super();
        super.setName("15-Puzzle");
        super.setIntroduction(INTRO);
        super.setMover(new BigPuzzleMover());
        int[][] start = {{5, 1, 2, 3}, {6, 0, 7, 4}, {9, 10, 11, 8}, {13, 14, 15, 12}};
        super.setInitialState(new BigPuzzleState(start));
        super.setCurrentState(super.getInitialState());
        int[][] end = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 0}};
        super.addBenchmark(new Benchmark("15-Puz 1: 8 Moves", 8, BENCH1, GOAL));
        super.addBenchmark(new Benchmark("15-Puz 2: 16 Moves", 16, BENCH2, GOAL));
        super.addBenchmark(new Benchmark("15-Puz 3: 33 Moves", 33, BENCH3, GOAL));
        super.addBenchmark(new Benchmark("15-Puz 4: 38 Moves", 38, BENCH4, GOAL));
        super.addBenchmark(new Benchmark("15-Puz 5: 42 Moves", 42, BENCH5, GOAL));
        super.addBenchmark(new Benchmark("15-Puz 6: 44 Moves", 44, BENCH6, GOAL));
        super.addBenchmark(new Benchmark("15-Puz 7: 50 Moves", 50, BENCH7, GOAL));
        super.addBenchmark(new Benchmark("15-Puz 8: 54 Moves", 54, BENCH8, GOAL));
        super.setFinalState(new BigPuzzleState(end));
    }

    private static final String INTRO
            = "You are given a board which numbered tiles can slide around. "
            + "There is one blank space that holds no tile. A legal\nmove "
            + "consists of sliding a tile into the blank space if the tile is "
            + "adjacent to it. The goal is to move the tiles around until the\n"
            + "board looks like the state below.";
    
    public static final BigPuzzleState BENCH1 = 
            new BigPuzzleState(new int[][]{new int[]{5, 1, 2, 3}, 
                                        new int[]{6, 0, 7, 4}, 
                                        new int[]{9, 10, 11, 8},
                                        new int[]{13, 14, 15, 12}});
    public static final BigPuzzleState BENCH2 = 
            new BigPuzzleState(new int[][]{new int[]{5, 1, 2, 4}, 
                                        new int[]{6, 11, 12, 3}, 
                                        new int[]{9, 7, 0, 8},
                                        new int[]{13, 10, 14, 15}});
    public static final BigPuzzleState BENCH3 = 
            new BigPuzzleState(new int[][]{new int[]{1, 4, 10, 8}, 
                                        new int[]{2, 6, 0, 12}, 
                                        new int[]{3, 14, 15, 11},
                                        new int[]{5, 9, 13, 7}});
    public static final BigPuzzleState BENCH4 = 
            new BigPuzzleState(new int[][]{new int[]{7, 13, 15, 2}, 
                                        new int[]{10, 1, 11, 4}, 
                                        new int[]{3, 9, 6, 8},
                                        new int[]{5, 0, 14, 12}});
    public static final BigPuzzleState BENCH5 = 
            new BigPuzzleState(new int[][]{new int[]{10, 15, 5, 8}, 
                                        new int[]{2, 0, 6, 3}, 
                                        new int[]{1, 12, 14, 4},
                                        new int[]{9, 7, 13, 11}});
    public static final BigPuzzleState BENCH6 = 
            new BigPuzzleState(new int[][]{new int[]{14, 6, 0, 8}, 
                                        new int[]{2, 1, 4, 9}, 
                                        new int[]{7, 13, 10, 11},
                                        new int[]{15, 5, 12, 3}});
    public static final BigPuzzleState BENCH7 = 
            new BigPuzzleState(new int[][]{new int[]{7, 8, 4, 11}, 
                                        new int[]{12, 14, 10, 15}, 
                                        new int[]{0, 5, 3, 13},
                                        new int[]{2, 1, 9, 6}});
    public static final BigPuzzleState BENCH8 = 
            new BigPuzzleState(new int[][]{new int[]{7, 14, 0, 9}, 
                                        new int[]{10, 2, 11, 13}, 
                                        new int[]{6, 15, 4, 12},
                                        new int[]{5, 1, 8, 3}});
    private static final BigPuzzleState GOAL = 
            new BigPuzzleState(new int[][]{new int[]{1, 2, 3, 4}, 
                                        new int[]{5, 6, 7, 8}, 
                                        new int[]{9, 10, 11, 12},
                                        new int[]{13, 14, 15, 0}});
}
