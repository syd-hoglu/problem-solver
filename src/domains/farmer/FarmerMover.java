package domains.farmer;

import framework.problem.Mover;
import framework.problem.State;

/**
 * The mover class for the Farmer Problem. Performs the moves called by the
 * player and sets the state accordingly.
 *
 * @author Sydney Hoglund section 001
 */
public class FarmerMover extends Mover {

    public static final String ALONE = "Farmer Goes Alone";
    public static final String WOLF = "Farmer Takes Wolf";
    public static final String GOAT = "Farmer Takes Goat";
    public static final String CABBAGE = "Farmer Takes Cabbage";

    public FarmerMover() {
        super.addMove(ALONE, s -> goesAlone(s));
        super.addMove(WOLF, s -> takesWolf(s));
        super.addMove(GOAT, s -> takesGoat(s));
        super.addMove(CABBAGE, s -> takesCabbage(s));
    }

    private State goesAlone(State state) {
        FarmerState s = (FarmerState) state;
        if (s.getWolf().equals(s.getGoat())
                || s.getGoat().equals(s.getCabbage())) {
            return null;
        } else {
            return new FarmerState(swapSide(s.getFarmer()), s.getWolf(), s.getGoat(), s.getCabbage());
        }
    }

    private State takesWolf(State state) {
        FarmerState s = (FarmerState) state;
        if (!(s.getFarmer().equals(s.getWolf())) || (s.getGoat().equals(s.getCabbage()))) {
            return null;
        } else {
            return new FarmerState(swapSide(s.getFarmer()), swapSide(s.getWolf()), s.getGoat(), s.getCabbage());
        }
    }

    private State takesGoat(State state) {
        FarmerState s = (FarmerState) state;
        if (!(s.getFarmer().equals(s.getGoat()))) {
            return null;
        } else {
            return new FarmerState(swapSide(s.getFarmer()), s.getWolf(), swapSide(s.getGoat()), s.getCabbage());
        }
    }

    private State takesCabbage(State state) {
        FarmerState s = (FarmerState) state;
        if (!(s.getFarmer().equals(s.getCabbage())) || (s.getGoat().equals(s.getWolf()))) {
            return null;
        } else {
            return new FarmerState(swapSide(s.getFarmer()), s.getWolf(), s.getGoat(), swapSide(s.getCabbage()));
        }
    }

    private String swapSide(String move) {
        if (move.equals("West")) {
            return "East";
        } else if (move.equals("East")) {
            return "West";
        } else {
            return null;
        }
    }
}
