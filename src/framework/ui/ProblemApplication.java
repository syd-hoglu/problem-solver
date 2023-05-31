package framework.ui;

import domains.dummy.DummyProblem;
import domains.arithmetic.ArithmeticProblem;
import domains.farmer.FarmerProblem;
import domains.puzzle.PuzzleProblem;
import domains.bigpuzzle.BigPuzzleProblem;
import javafx.application.Application;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This class presents problem solving domains in a tabbed pane.
 */
public class ProblemApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        TabPane tabPane = new TabPane();

        /* Add tabs using the following */
        Tab tab = new Tab();
        tab.setText("Dummy");
        tab.setContent(new ProblemGUI(new DummyProblem(), 700, 500));
        tabPane.getTabs().add(tab);

        Tab tab1 = new Tab();
        tab1.setText("Arithmetic");
        tab1.setContent(new ProblemGUI(new ArithmeticProblem(), 700, 500));
        tabPane.getTabs().add(tab1);

        Tab tab2 = new Tab();
        tab2.setText("Farmer, Wolf, Goat, and Cabbage");
        tab2.setContent(new ProblemGUI(new FarmerProblem(), 700, 500));
        tabPane.getTabs().add(tab2);

        Tab tab3 = new Tab();
        tab3.setText("8-Puzzle");
        tab3.setContent(new ProblemGUI(new PuzzleProblem(), 800, 500));
        tabPane.getTabs().add(tab3);

        Tab tab4 = new Tab();
        tab4.setText("15-Puzzle");
        tab4.setContent(new ProblemGUI(new BigPuzzleProblem(), 800, 500));
        tabPane.getTabs().add(tab4);

        Scene scene = new Scene(tabPane);
        primaryStage.setTitle("Problem Solver");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
