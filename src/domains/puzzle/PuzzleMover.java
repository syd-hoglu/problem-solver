package domains.puzzle;

import framework.problem.Mover;
import framework.problem.State;

/**
 * The mover class for the Puzzle Problem. Performs the moves called by the
 * player and sets the state accordingly.
 *
 * @author Sydney Hoglund section 001
 */
public class PuzzleMover extends Mover {

    public static final String MOVE1 = "Slide Tile 1";
    public static final String MOVE2 = "Slide Tile 2";
    public static final String MOVE3 = "Slide Tile 3";
    public static final String MOVE4 = "Slide Tile 4";
    public static final String MOVE5 = "Slide Tile 5";
    public static final String MOVE6 = "Slide Tile 6";
    public static final String MOVE7 = "Slide Tile 7";
    public static final String MOVE8 = "Slide Tile 8";

    public PuzzleMover() {
        super.addMove(MOVE1, s -> tryTile1(s));
        super.addMove(MOVE2, s -> tryTile2(s));
        super.addMove(MOVE3, s -> tryTile3(s));
        super.addMove(MOVE4, s -> tryTile4(s));
        super.addMove(MOVE5, s -> tryTile5(s));
        super.addMove(MOVE6, s -> tryTile6(s));
        super.addMove(MOVE7, s -> tryTile7(s));
        super.addMove(MOVE8, s -> tryTile8(s));
    }

    private State tryTile1(State state) {
        PuzzleState s = (PuzzleState) state;
        PuzzleState.Location loc1 = s.getLocation(1);
        PuzzleState.Location loc0 = s.getLocation(0);
        if ((loc1.getColumn() == loc0.getColumn())
                && ((loc1.getRow() == (loc0.getRow() - 1))
                || (loc1.getRow() == (loc0.getRow() + 1)))) {
            return new PuzzleState(s, loc0, loc1);
        } else if ((loc1.getRow() == loc0.getRow())
                && ((loc1.getColumn() == (loc0.getColumn() - 1))
                || (loc1.getColumn() == (loc0.getColumn() + 1)))) {
            return new PuzzleState(s, loc0, loc1);
        } else {
            return null;
        }
    }

    private State tryTile2(State state) {
        PuzzleState s = (PuzzleState) state;
        PuzzleState.Location loc1 = s.getLocation(2);
        PuzzleState.Location loc0 = s.getLocation(0);
        if ((loc1.getColumn() == loc0.getColumn())
                && ((loc1.getRow() == (loc0.getRow() - 1))
                || (loc1.getRow() == (loc0.getRow() + 1)))) {
            return new PuzzleState(s, loc0, loc1);
        } else if ((loc1.getRow() == loc0.getRow())
                && ((loc1.getColumn() == (loc0.getColumn() - 1))
                || (loc1.getColumn() == (loc0.getColumn() + 1)))) {
            return new PuzzleState(s, loc0, loc1);
        } else {
            return null;
        }
    }

    private State tryTile3(State state) {
        PuzzleState s = (PuzzleState) state;
        PuzzleState.Location loc1 = s.getLocation(3);
        PuzzleState.Location loc0 = s.getLocation(0);
        if ((loc1.getColumn() == loc0.getColumn())
                && ((loc1.getRow() == (loc0.getRow() - 1))
                || (loc1.getRow() == (loc0.getRow() + 1)))) {
            return new PuzzleState(s, loc0, loc1);
        } else if ((loc1.getRow() == loc0.getRow())
                && ((loc1.getColumn() == (loc0.getColumn() - 1))
                || (loc1.getColumn() == (loc0.getColumn() + 1)))) {
            return new PuzzleState(s, loc0, loc1);
        } else {
            return null;
        }
    }

    private State tryTile4(State state) {
        PuzzleState s = (PuzzleState) state;
        PuzzleState.Location loc1 = s.getLocation(4);
        PuzzleState.Location loc0 = s.getLocation(0);
        if ((loc1.getColumn() == loc0.getColumn())
                && ((loc1.getRow() == (loc0.getRow() - 1))
                || (loc1.getRow() == (loc0.getRow() + 1)))) {
            return new PuzzleState(s, loc0, loc1);
        } else if ((loc1.getRow() == loc0.getRow())
                && ((loc1.getColumn() == (loc0.getColumn() - 1))
                || (loc1.getColumn() == (loc0.getColumn() + 1)))) {
            return new PuzzleState(s, loc0, loc1);
        } else {
            return null;
        }
    }

    private State tryTile5(State state) {
        PuzzleState s = (PuzzleState) state;
        PuzzleState.Location loc1 = s.getLocation(5);
        PuzzleState.Location loc0 = s.getLocation(0);
        if ((loc1.getColumn() == loc0.getColumn())
                && ((loc1.getRow() == (loc0.getRow() - 1))
                || (loc1.getRow() == (loc0.getRow() + 1)))) {
            return new PuzzleState(s, loc0, loc1);
        } else if ((loc1.getRow() == loc0.getRow())
                && ((loc1.getColumn() == (loc0.getColumn() - 1))
                || (loc1.getColumn() == (loc0.getColumn() + 1)))) {
            return new PuzzleState(s, loc0, loc1);
        } else {
            return null;
        }
    }

    private State tryTile6(State state) {
        PuzzleState s = (PuzzleState) state;
        PuzzleState.Location loc1 = s.getLocation(6);
        PuzzleState.Location loc0 = s.getLocation(0);
        if ((loc1.getColumn() == loc0.getColumn())
                && ((loc1.getRow() == (loc0.getRow() - 1))
                || (loc1.getRow() == (loc0.getRow() + 1)))) {
            return new PuzzleState(s, loc0, loc1);
        } else if ((loc1.getRow() == loc0.getRow())
                && ((loc1.getColumn() == (loc0.getColumn() - 1))
                || (loc1.getColumn() == (loc0.getColumn() + 1)))) {
            return new PuzzleState(s, loc0, loc1);
        } else {
            return null;
        }
    }

    private State tryTile7(State state) {
        PuzzleState s = (PuzzleState) state;
        PuzzleState.Location loc1 = s.getLocation(7);
        PuzzleState.Location loc0 = s.getLocation(0);
        if ((loc1.getColumn() == loc0.getColumn())
                && ((loc1.getRow() == (loc0.getRow() - 1))
                || (loc1.getRow() == (loc0.getRow() + 1)))) {
            return new PuzzleState(s, loc0, loc1);
        } else if ((loc1.getRow() == loc0.getRow())
                && ((loc1.getColumn() == (loc0.getColumn() - 1))
                || (loc1.getColumn() == (loc0.getColumn() + 1)))) {
            return new PuzzleState(s, loc0, loc1);
        } else {
            return null;
        }
    }

    private State tryTile8(State state) {
        PuzzleState s = (PuzzleState) state;
        PuzzleState.Location loc1 = s.getLocation(8);
        PuzzleState.Location loc0 = s.getLocation(0);
        if ((loc1.getColumn() == loc0.getColumn())
                && ((loc1.getRow() == (loc0.getRow() - 1))
                || (loc1.getRow() == (loc0.getRow() + 1)))) {
            return new PuzzleState(s, loc0, loc1);
        } else if ((loc1.getRow() == loc0.getRow())
                && ((loc1.getColumn() == (loc0.getColumn() - 1))
                || (loc1.getColumn() == (loc0.getColumn() + 1)))) {
            return new PuzzleState(s, loc0, loc1);
        } else {
            return null;
        }
    }
}
