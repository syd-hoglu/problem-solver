package domains.farmer;

import framework.problem.State;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * The state class for the Farmer Problem. Gets and displays the state.
 *
 * @author Sydney Hoglund section 001
 */
public class FarmerState extends State {

    public FarmerState(String farmer, String wolf, String goat, String cabbage) {
        this.farmer = farmer;
        this.wolf = wolf;
        this.goat = goat;
        this.cabbage = cabbage;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        FarmerState otherFarmer = (FarmerState) other;
        return this.farmer.equals(otherFarmer.farmer)
                && this.wolf.equals(otherFarmer.wolf)
                && this.goat.equals(otherFarmer.goat)
                && this.cabbage.equals(otherFarmer.cabbage);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.farmer);
        hash = 17 * hash + Objects.hashCode(this.wolf);
        hash = 17 * hash + Objects.hashCode(this.goat);
        hash = 17 * hash + Objects.hashCode(this.cabbage);
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getDisplay());
        return sb.toString();
    }

    public String getFarmer() {
        return farmer;
    }

    public String getWolf() {
        return wolf;
    }

    public String getGoat() {
        return goat;
    }

    public String getCabbage() {
        return cabbage;
    }

    private String getDisplay() {
        String state = "   |  |   \n";
        if (farmer.equals("West")) {
            state = state + " F |  |   \n";
        } else if (farmer.equals("East")) {
            state = state + "   |  | F \n";
        }
        if (wolf.equals("West")) {
            state = state + " W |  |   \n";
        } else if (wolf.equals("East")) {
            state = state + "   |  | W \n";
        }
        if (goat.equals("West")) {
            state = state + " G |  |   \n";
        } else if (goat.equals("East")) {
            state = state + "   |  | G \n";
        }
        if (cabbage.equals("West")) {
            state = state + " C |  |   \n";
        } else if (cabbage.equals("East")) {
            state = state + "   |  | C \n";
        }
        state = state + "   |  |   ";

        return state;
    }

    private String farmer;
    private String wolf;
    private String goat;
    private String cabbage;
}
