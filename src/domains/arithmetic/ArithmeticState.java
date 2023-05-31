package domains.arithmetic;

import framework.problem.State;
import java.util.stream.Stream;

/**
 * The state class for the Arithmetic Problem.
 * Gets and displays the state.
 * @author Sydney Hoglund section 001
 */

public class ArithmeticState extends State {

    public ArithmeticState(int contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object other) {
        ArithmeticState otherArithmetic = (ArithmeticState) other;
        return this.contents == otherArithmetic.contents;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("The value is: " + contents);
        return sb.toString();
    }

    public int getContents() {
        return contents;
    }

    private final int contents;
}
