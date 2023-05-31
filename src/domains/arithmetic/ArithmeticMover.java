package domains.arithmetic;

import framework.problem.Mover;
import framework.problem.State;

/**
 * The mover class for the Arithmetic Problem. Performs the moves called by the
 * player and sets the state accordingly.
 *
 * @author Sydney Hoglund section 001
 */
public class ArithmeticMover extends Mover {

    public static final String ADD = "Add 3";
    public static final String SUB = "Subtract 5";
    public static final String DIV = "Divide by 2";
    public static final String MUL = "Multiply by 2";

    public ArithmeticMover() {
        super.addMove(ADD, s -> tryAdd(s));
        super.addMove(SUB, s -> trySub(s));
        super.addMove(DIV, s -> tryDiv(s));
        super.addMove(MUL, s -> tryMul(s));
    }

    private State tryAdd(State state) {
        ArithmeticState s = (ArithmeticState) state;
        return new ArithmeticState(s.getContents() + 3);
    }

    private State trySub(State state) {
        ArithmeticState s = (ArithmeticState) state;
        return new ArithmeticState(s.getContents() - 5);
    }

    private State tryDiv(State state) {
        ArithmeticState s = (ArithmeticState) state;
        return new ArithmeticState(s.getContents() / 2);
    }

    private State tryMul(State state) {
        ArithmeticState s = (ArithmeticState) state;
        return new ArithmeticState(s.getContents() * 2);
    }
}
