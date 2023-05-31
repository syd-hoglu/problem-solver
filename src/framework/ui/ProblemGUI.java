package framework.ui;

import framework.problem.Problem;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.text.Font;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.CornerRadii;
import framework.solution.SolvingAssistant;
import framework.solution.Solver;
import javafx.collections.FXCollections;
import javafx.scene.text.Text;
import java.util.LinkedList;
import framework.solution.BFSGraphSolver;
import framework.solution.DFSGraphSolver;
import framework.solution.AStarSolver;
import framework.solution.BestFirstSolver;
import framework.problem.Benchmark;
import framework.problem.State;
import framework.graph.Vertex;

/**
 * This class represents a problem solving GUI for any appropriate problem
 * domain. It extends the VBox class and uses buttons to provide move options to
 * the user, check move legality, and update the display. The display is text,
 * label, VBox, and HBox based, using strings.
 *
 * @author Sydney Hoglund Section 001
 */
public class ProblemGUI extends VBox {

    public ProblemGUI(Problem problem, double width, double height) {

        super();
        super.setMinHeight(height);
        super.setMinWidth(width);
        bottomVBox = new VBox();

        //Welcome and Introduction Display (Top Box)
        welcomeMessage = new Label("Welcome to the " + problem.getName() + " Problem");
        welcomeFont = new Font("Lucida Sans Unicode bold", 22);
        welcomeMessage.setFont(welcomeFont);
        introduction = new Label(problem.getIntroduction());
        introFont = new Font("Lucida Sans Unicode", 12);
        introduction.setFont(introFont);
        topVBox = new VBox(welcomeMessage, introduction);
        topVBox.setAlignment(Pos.CENTER);

        //Current State Display (Left Box)
        stateDisplay = new Label(problem.getCurrentState().toString());
        displayFont = new Font("Courier New", 18);
        stateDisplay.setBorder(new Border(new BorderStroke(Color.valueOf("#000000"),
                BorderStrokeStyle.SOLID,
                CornerRadii.EMPTY,
                BorderStroke.MEDIUM)));
        stateDisplay.setPadding(new Insets(10));
        stateDisplay.setFont(displayFont);
        stateVBox = new VBox(stateDisplay);
        stateVBox.setAlignment(Pos.CENTER_LEFT);
        currState = new Label("Current State:");
        stateFont = new Font("Lucida Sans Unicode", 19);
        currState.setFont(stateFont);
        leftVBox = new VBox(currState, stateDisplay);
        leftVBox.setAlignment(Pos.CENTER);

        //Goal State Display (Right Box)
        finalDisplay = new Label(problem.getFinalState().toString());
        finalDisplay.setBorder(new Border(new BorderStroke(Color.valueOf("#000000"),
                BorderStrokeStyle.SOLID,
                CornerRadii.EMPTY,
                BorderStroke.MEDIUM)));
        finalDisplay.setPadding(new Insets(10));
        finalDisplay.setFont(displayFont);
        finalVBox = new VBox(finalDisplay);
        finalVBox.setAlignment(Pos.CENTER_LEFT);
        finalState = new Label("Goal State:");
        finalState.setFont(stateFont);
        rightVBox = new VBox(finalState, finalDisplay);
        rightVBox.setAlignment(Pos.CENTER);

        //Move Buttons Creation and Display(Center Box)
        buttonList = new LinkedList();
        buttonLabel = new Label("Moves so far: 0");
        buttonLabel.setFont(stateFont);
        buttonBox = new VBox(5, buttonLabel);
        solvingA = new SolvingAssistant(problem);
        for (int i = 0; i < problem.getMover().getMoveNames().size(); i++) { //for loop to add buttons dynamically
            String name = problem.getMover().getMoveNames().get(i); //dynamically get move names
            Button move = new Button(name); //dynamically creates buttons with move name
            move.setMinWidth(150);
            move.setId(name);
            move.setStyle("-fx-background-color: mistyrose");
            buttonList.add(move);
            move.setOnAction(e -> { //start button actions
                for (Button m : buttonList) {
                    m.setStyle("-fx-background-color: mistyrose");
                }
                move.setStyle("-fx-background-color: red");
                solvingA.tryMove(name); //trys the move and updates the state
                if (!solvingA.isMoveLegal()) { //check to see if illegal move text needs to be displayed
                    if (!bottomVBox.getChildren().contains(illegal)) { //makes sure program doesnt add the text more than once
                        bottomVBox.getChildren().add(illegal);
                    }
                } else { //removes illegal move text if move is legal
                    bottomVBox.getChildren().remove(illegal);
                }
                stateDisplay.setText(problem.getCurrentState().toString()); //update display
                StringBuilder builder = new StringBuilder();
                builder.append("Moves so far: ");
                builder.append(solvingA.getMoveCount());
                String numMoves = builder.toString();
                buttonLabel.setText(numMoves); //update move count
                if (problem.getCurrentState().equals(problem.getFinalState())) { //check to see if problem is solved
                    for (Button m : buttonList) {
                        m.setDisable(true);
                    }
                    if (!bottomVBox.getChildren().contains(win)) { //makes sure program doesnt add the text more than once
                        bottomVBox.getChildren().add(win);
                    }
                }
            }); //end button action
            buttonBox.getChildren().add(move); //adds new button to the box
        } //end dynamic button add
        buttonBox.setAlignment(Pos.CENTER);

        //Combine left, button, and right boxes to be displayed (Middle Box)
        midBox = new HBox(20, leftVBox, buttonBox, rightVBox);
        midBox.setAlignment(Pos.CENTER);

        //Text and Reset Creation and Display (Bottom Box)
        win = new Text("You solved the problem! Congratulations!");
        win.setFill(Color.FORESTGREEN);
        winFont = new Font("Comic Sans MS bold", 18);
        win.setFont(winFont);
        illegal = new Text("Illegal move. Try again.");
        badFont = new Font("Impact", 18);
        illegal.setFont(badFont);
        illegal.setFill(Color.RED);
        reset = new Button("Reset"); //creates a reset button
        reset.setOnAction(f -> { //start button actions
            solvingA.reset(); //resets the state
            stateDisplay.setText(problem.getCurrentState().toString()); //resets the visual
            for (Button m : buttonList) {
                m.setDisable(false);
                m.setStyle("-fx-background-color: mistyrose");
            }
            solve.setDisable(false);
            if (problem.getName().equals("8-Puzzle") || problem.getName().equals("15-Puzzle")) {
                benchmarks.setDisable(false);
            }
            next.setDisable(true);
            buttonLabel.setText("Moves so far: 0"); //resets move count
            bottomVBox.getChildren().remove(win); //removes win text 
            bottomVBox.getChildren().remove(illegal);//removes illegal move text
        });// end button actions
        bottomVBox.getChildren().add(reset);
        bottomVBox.setAlignment(Pos.CENTER);

        //Automated Problem Solving Assignment additions
        solve = new Button("Solve");
        next = new Button("Next");
        LinkedList<String> searches = new LinkedList();
        searches.add("BF State Search");
        searches.add("DF State Search");
        searches.add("Best-First Search");
        searches.add("A* Search");
        LinkedList<String> benches8 = new LinkedList();
        benches8.add("8-Puz 1: 5 Moves");
        benches8.add("8-Puz 2: 10 Moves");
        benches8.add("8-Puz 3: 13 Moves");
        benches8.add("8-Puz 4: 18 Moves");
        benches8.add("8-Puz 5: 20 Moves");
        benches8.add("8-Puz 6: 24 Moves");
        benches8.add("8-Puz 7: 30 Moves");
        benches8.add("8-Puz 8: 30 Moves");
        LinkedList<String> benches15 = new LinkedList();
        benches15.add("15-Puz 1: 8 Moves");
        benches15.add("15-Puz 2: 16 Moves");
        benches15.add("15-Puz 3: 33 Moves");
        benches15.add("15-Puz 4: 38 Moves");
        benches15.add("15-Puz 5: 42 Moves");
        benches15.add("15-Puz 6: 44 Moves");
        benches15.add("15-Puz 7: 50 Moves");
        benches15.add("15-Puz 8: 54 Moves");
        searchType = new ComboBox(FXCollections.observableList(searches));
        if (problem.getName().equals("15-Puzzle")) {
            benchmarks = new ComboBox(FXCollections.observableList(benches15));
        } else {
            benchmarks = new ComboBox(FXCollections.observableList(benches8));
        }
        benchmarks.setDisable(true);
        if (problem.getName().equals("8-Puzzle") || problem.getName().equals("15-Puzzle")) {
            benchmarks.setDisable(false);
            benchmarks.getSelectionModel().selectFirst();
        }
        stats = new Label();
        stats.setBorder(new Border(new BorderStroke(Color.valueOf("#000000"),
                BorderStrokeStyle.SOLID,
                CornerRadii.EMPTY,
                BorderStroke.MEDIUM)));
        stats.setMinWidth(200);
        stats.setMinHeight(200);
        newButtonsBox = new VBox(10, solve, next);
        searchBox = new VBox(10, new Label("Search Type"), searchType);
        statsBox = new VBox(10, new Label("Statistics"), stats);
        benchBox = new VBox(10, new Label("Benchmarks"), benchmarks);
        newButtonsBox.setAlignment(Pos.CENTER);
        searchBox.setAlignment(Pos.CENTER);
        benchBox.setAlignment(Pos.CENTER);
        statsBox.setAlignment(Pos.CENTER);
        autoBox = new HBox(25, newButtonsBox, searchBox, statsBox, benchBox);
        autoBox.setAlignment(Pos.CENTER);
        searchType.getSelectionModel().selectFirst();

        solve.setOnAction(g -> {
            solve.setDisable(true);
            next.setDisable(false);
            benchmarks.setDisable(true);
            for (Button m : buttonList) {
                m.setDisable(true);
            }
            switch (searchType.getValue().toString()) {
                case "BF State Search":
                    solver = new BFSGraphSolver(solvingA.getProblem());
                    break;
                case "DF State Search":
                    solver = new DFSGraphSolver(solvingA.getProblem());
                    break;
                case "Best-First Search":
                    solver = new BestFirstSolver(solvingA.getProblem());
                    break;
                case "A* Search":
                    solver = new AStarSolver(solvingA.getProblem());
                    break;
            }
            solver.solve();
            solver.getSolution().next();
            stats.setText(solver.getStatistics().toString());
        });

        next.setOnAction(h -> {
            String newMove = "";
            State prev = problem.getInitialState();
            if (solver.getSolution().hasNext()) {
                Vertex nextVert = solver.getSolution().next();
                Vertex pred = nextVert.getPredecessor();
                State nextS = (State) nextVert.getData();
                if (pred != null) {
                    prev = (State) pred.getData();
                }
                for (String n : problem.getMover().getMoveNames()) {
                    State target = (State) problem.getMover().doMove(n, prev);
                    if (nextS.equals(target)) {
                        newMove = n;
                    }
                }
                solvingA.tryMove(newMove); //trys the move and updates the state
                for (Button m : buttonList) {
                    m.setStyle("-fx-background-color: mistyrose");
                }
                for (Button m : buttonList) {
                    if (m.getId().equals(newMove)) {
                        m.setStyle("-fx-background-color: red");
                    }
                }
                stateDisplay.setText(problem.getCurrentState().toString());
                StringBuilder builder = new StringBuilder();
                builder.append("Moves so far: ");
                builder.append(solvingA.getMoveCount());
                String numMoves = builder.toString();
                buttonLabel.setText(numMoves);
                if (problem.getCurrentState().equals(problem.getFinalState())) { //check to see if problem is solved
                    if (!bottomVBox.getChildren().contains(win)) { //makes sure program doesnt add the text more than once
                        bottomVBox.getChildren().add(win);
                    }
                }
            }
        });

        benchmarks.setOnAction(j -> {
            for (Benchmark b : problem.getBenchmarks()) {
                if (b.getName().equals(benchmarks.getValue().toString())) {
                    problem.setInitialState(b.getStart());
                    reset.fire();
                }
            }
        });

        //Adds all display boxes to main display box
        if (problem.getName().equals("8-Puzzle") || problem.getName().equals("Farmer, Wolf, Goat, and Cabbage")
                || problem.getName().equals("15-Puzzle")) {
            super.getChildren().addAll(topVBox, midBox, bottomVBox, autoBox);
        } else {
            super.getChildren().addAll(topVBox, midBox, bottomVBox);
        }

        super.setSpacing(10);
    }
    //Private instance fields for top box
    private final Label welcomeMessage;
    private final Label introduction;
    private final Font welcomeFont;
    private final Font introFont;
    private final VBox topVBox;

    //Private instance fields for left box
    private final Label currState;
    private Label stateDisplay;
    private final Font stateFont;
    private final Font displayFont;
    private final VBox stateVBox;
    private final VBox leftVBox;

    //Private instance fields for right box
    private final Label finalState;
    private final Label finalDisplay;
    private final VBox finalVBox;
    private final VBox rightVBox;

    //Private instance fields for button box
    private final VBox buttonBox;
    private Label buttonLabel;
    private SolvingAssistant solvingA;
    private LinkedList<Button> buttonList;

    //Middle Box
    private final HBox midBox;

    //Private instance fields for bottom box
    private Text win;
    private Text illegal;
    private final Font winFont;
    private final Font badFont;
    private final Button reset;
    private VBox bottomVBox;

    //Private instance fields for new stuff
    private final HBox autoBox;
    private Button solve;
    private Button next;
    private final VBox newButtonsBox;
    private final VBox searchBox;
    private final VBox statsBox;
    private final VBox benchBox;
    private ComboBox searchType;
    private ComboBox benchmarks;
    private final Label stats;
    private Solver solver;

}
