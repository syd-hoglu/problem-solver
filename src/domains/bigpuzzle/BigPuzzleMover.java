package domains.bigpuzzle;

import framework.problem.Mover;
import framework.problem.State;

/**
 * The mover class for the Puzzle Problem. Performs the moves called by the
 * player and sets the state accordingly.
 *
 * @author Sydney Hoglund section 001
 */
public class BigPuzzleMover extends Mover {

    public static final String MOVE1 = "Slide Tile 1";
    public static final String MOVE2 = "Slide Tile 2";
    public static final String MOVE3 = "Slide Tile 3";
    public static final String MOVE4 = "Slide Tile 4";
    public static final String MOVE5 = "Slide Tile 5";
    public static final String MOVE6 = "Slide Tile 6";
    public static final String MOVE7 = "Slide Tile 7";
    public static final String MOVE8 = "Slide Tile 8";
    public static final String MOVE9 = "Slide Tile 9";
    public static final String MOVE10 = "Slide Tile 10";
    public static final String MOVE11 = "Slide Tile 11";
    public static final String MOVE12 = "Slide Tile 12";
    public static final String MOVE13 = "Slide Tile 13";
    public static final String MOVE14 = "Slide Tile 14";
    public static final String MOVE15 = "Slide Tile 15";

    public BigPuzzleMover() {
        super.addMove(MOVE1, s -> tryTile1(s));
        super.addMove(MOVE2, s -> tryTile2(s));
        super.addMove(MOVE3, s -> tryTile3(s));
        super.addMove(MOVE4, s -> tryTile4(s));
        super.addMove(MOVE5, s -> tryTile5(s));
        super.addMove(MOVE6, s -> tryTile6(s));
        super.addMove(MOVE7, s -> tryTile7(s));
        super.addMove(MOVE8, s -> tryTile8(s));
        super.addMove(MOVE9, s -> tryTile9(s));
        super.addMove(MOVE10, s -> tryTile10(s));
        super.addMove(MOVE11, s -> tryTile11(s));
        super.addMove(MOVE12, s -> tryTile12(s));
        super.addMove(MOVE13, s -> tryTile13(s));
        super.addMove(MOVE14, s -> tryTile14(s));
        super.addMove(MOVE15, s -> tryTile15(s));
    }

    private State tryTile1(State state) {
        BigPuzzleState s = (BigPuzzleState) state;
        BigPuzzleState.Location loc1 = s.getLocation(1);
        BigPuzzleState.Location loc0 = s.getLocation(0);
        if ((loc1.getColumn() == loc0.getColumn())
                && ((loc1.getRow() == (loc0.getRow() - 1))
                || (loc1.getRow() == (loc0.getRow() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else if ((loc1.getRow() == loc0.getRow())
                && ((loc1.getColumn() == (loc0.getColumn() - 1))
                || (loc1.getColumn() == (loc0.getColumn() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else {
            return null;
        }
    }

    private State tryTile2(State state) {
        BigPuzzleState s = (BigPuzzleState) state;
        BigPuzzleState.Location loc1 = s.getLocation(2);
        BigPuzzleState.Location loc0 = s.getLocation(0);
        if ((loc1.getColumn() == loc0.getColumn())
                && ((loc1.getRow() == (loc0.getRow() - 1))
                || (loc1.getRow() == (loc0.getRow() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else if ((loc1.getRow() == loc0.getRow())
                && ((loc1.getColumn() == (loc0.getColumn() - 1))
                || (loc1.getColumn() == (loc0.getColumn() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else {
            return null;
        }
    }

    private State tryTile3(State state) {
        BigPuzzleState s = (BigPuzzleState) state;
        BigPuzzleState.Location loc1 = s.getLocation(3);
        BigPuzzleState.Location loc0 = s.getLocation(0);
        if ((loc1.getColumn() == loc0.getColumn())
                && ((loc1.getRow() == (loc0.getRow() - 1))
                || (loc1.getRow() == (loc0.getRow() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else if ((loc1.getRow() == loc0.getRow())
                && ((loc1.getColumn() == (loc0.getColumn() - 1))
                || (loc1.getColumn() == (loc0.getColumn() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else {
            return null;
        }
    }

    private State tryTile4(State state) {
        BigPuzzleState s = (BigPuzzleState) state;
        BigPuzzleState.Location loc1 = s.getLocation(4);
        BigPuzzleState.Location loc0 = s.getLocation(0);
        if ((loc1.getColumn() == loc0.getColumn())
                && ((loc1.getRow() == (loc0.getRow() - 1))
                || (loc1.getRow() == (loc0.getRow() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else if ((loc1.getRow() == loc0.getRow())
                && ((loc1.getColumn() == (loc0.getColumn() - 1))
                || (loc1.getColumn() == (loc0.getColumn() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else {
            return null;
        }
    }

    private State tryTile5(State state) {
        BigPuzzleState s = (BigPuzzleState) state;
        BigPuzzleState.Location loc1 = s.getLocation(5);
        BigPuzzleState.Location loc0 = s.getLocation(0);
        if ((loc1.getColumn() == loc0.getColumn())
                && ((loc1.getRow() == (loc0.getRow() - 1))
                || (loc1.getRow() == (loc0.getRow() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else if ((loc1.getRow() == loc0.getRow())
                && ((loc1.getColumn() == (loc0.getColumn() - 1))
                || (loc1.getColumn() == (loc0.getColumn() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else {
            return null;
        }
    }

    private State tryTile6(State state) {
        BigPuzzleState s = (BigPuzzleState) state;
        BigPuzzleState.Location loc1 = s.getLocation(6);
        BigPuzzleState.Location loc0 = s.getLocation(0);
        if ((loc1.getColumn() == loc0.getColumn())
                && ((loc1.getRow() == (loc0.getRow() - 1))
                || (loc1.getRow() == (loc0.getRow() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else if ((loc1.getRow() == loc0.getRow())
                && ((loc1.getColumn() == (loc0.getColumn() - 1))
                || (loc1.getColumn() == (loc0.getColumn() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else {
            return null;
        }
    }

    private State tryTile7(State state) {
        BigPuzzleState s = (BigPuzzleState) state;
        BigPuzzleState.Location loc1 = s.getLocation(7);
        BigPuzzleState.Location loc0 = s.getLocation(0);
        if ((loc1.getColumn() == loc0.getColumn())
                && ((loc1.getRow() == (loc0.getRow() - 1))
                || (loc1.getRow() == (loc0.getRow() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else if ((loc1.getRow() == loc0.getRow())
                && ((loc1.getColumn() == (loc0.getColumn() - 1))
                || (loc1.getColumn() == (loc0.getColumn() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else {
            return null;
        }
    }

    private State tryTile8(State state) {
        BigPuzzleState s = (BigPuzzleState) state;
        BigPuzzleState.Location loc1 = s.getLocation(8);
        BigPuzzleState.Location loc0 = s.getLocation(0);
        if ((loc1.getColumn() == loc0.getColumn())
                && ((loc1.getRow() == (loc0.getRow() - 1))
                || (loc1.getRow() == (loc0.getRow() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else if ((loc1.getRow() == loc0.getRow())
                && ((loc1.getColumn() == (loc0.getColumn() - 1))
                || (loc1.getColumn() == (loc0.getColumn() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else {
            return null;
        }
    }
    
    private State tryTile9(State state) {
        BigPuzzleState s = (BigPuzzleState) state;
        BigPuzzleState.Location loc1 = s.getLocation(9);
        BigPuzzleState.Location loc0 = s.getLocation(0);
        if ((loc1.getColumn() == loc0.getColumn())
                && ((loc1.getRow() == (loc0.getRow() - 1))
                || (loc1.getRow() == (loc0.getRow() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else if ((loc1.getRow() == loc0.getRow())
                && ((loc1.getColumn() == (loc0.getColumn() - 1))
                || (loc1.getColumn() == (loc0.getColumn() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else {
            return null;
        }
    }
    
    private State tryTile10(State state) {
        BigPuzzleState s = (BigPuzzleState) state;
        BigPuzzleState.Location loc1 = s.getLocation(10);
        BigPuzzleState.Location loc0 = s.getLocation(0);
        if ((loc1.getColumn() == loc0.getColumn())
                && ((loc1.getRow() == (loc0.getRow() - 1))
                || (loc1.getRow() == (loc0.getRow() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else if ((loc1.getRow() == loc0.getRow())
                && ((loc1.getColumn() == (loc0.getColumn() - 1))
                || (loc1.getColumn() == (loc0.getColumn() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else {
            return null;
        }
    }
    
    private State tryTile11(State state) {
        BigPuzzleState s = (BigPuzzleState) state;
        BigPuzzleState.Location loc1 = s.getLocation(11);
        BigPuzzleState.Location loc0 = s.getLocation(0);
        if ((loc1.getColumn() == loc0.getColumn())
                && ((loc1.getRow() == (loc0.getRow() - 1))
                || (loc1.getRow() == (loc0.getRow() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else if ((loc1.getRow() == loc0.getRow())
                && ((loc1.getColumn() == (loc0.getColumn() - 1))
                || (loc1.getColumn() == (loc0.getColumn() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else {
            return null;
        }
    }
    
    private State tryTile12(State state) {
        BigPuzzleState s = (BigPuzzleState) state;
        BigPuzzleState.Location loc1 = s.getLocation(12);
        BigPuzzleState.Location loc0 = s.getLocation(0);
        if ((loc1.getColumn() == loc0.getColumn())
                && ((loc1.getRow() == (loc0.getRow() - 1))
                || (loc1.getRow() == (loc0.getRow() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else if ((loc1.getRow() == loc0.getRow())
                && ((loc1.getColumn() == (loc0.getColumn() - 1))
                || (loc1.getColumn() == (loc0.getColumn() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else {
            return null;
        }
    }
    
    private State tryTile13(State state) {
        BigPuzzleState s = (BigPuzzleState) state;
        BigPuzzleState.Location loc1 = s.getLocation(13);
        BigPuzzleState.Location loc0 = s.getLocation(0);
        if ((loc1.getColumn() == loc0.getColumn())
                && ((loc1.getRow() == (loc0.getRow() - 1))
                || (loc1.getRow() == (loc0.getRow() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else if ((loc1.getRow() == loc0.getRow())
                && ((loc1.getColumn() == (loc0.getColumn() - 1))
                || (loc1.getColumn() == (loc0.getColumn() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else {
            return null;
        }
    }
    
    private State tryTile14(State state) {
        BigPuzzleState s = (BigPuzzleState) state;
        BigPuzzleState.Location loc1 = s.getLocation(14);
        BigPuzzleState.Location loc0 = s.getLocation(0);
        if ((loc1.getColumn() == loc0.getColumn())
                && ((loc1.getRow() == (loc0.getRow() - 1))
                || (loc1.getRow() == (loc0.getRow() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else if ((loc1.getRow() == loc0.getRow())
                && ((loc1.getColumn() == (loc0.getColumn() - 1))
                || (loc1.getColumn() == (loc0.getColumn() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else {
            return null;
        }
    }
    
    private State tryTile15(State state) {
        BigPuzzleState s = (BigPuzzleState) state;
        BigPuzzleState.Location loc1 = s.getLocation(15);
        BigPuzzleState.Location loc0 = s.getLocation(0);
        if ((loc1.getColumn() == loc0.getColumn())
                && ((loc1.getRow() == (loc0.getRow() - 1))
                || (loc1.getRow() == (loc0.getRow() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else if ((loc1.getRow() == loc0.getRow())
                && ((loc1.getColumn() == (loc0.getColumn() - 1))
                || (loc1.getColumn() == (loc0.getColumn() + 1)))) {
            return new BigPuzzleState(s, loc0, loc1);
        } else {
            return null;
        }
    }
}
