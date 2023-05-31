package domains.bigpuzzle;

import framework.ui.ProblemConsole;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * The console for displaying the Puzzle Problem.
 *
 * @author Sydney Hoglund section 001
 */
public class BigPuzzleConsole extends Application {

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new ProblemConsole(new BigPuzzleProblem(), 450, 550));
        primaryStage.setTitle("Testing Puzzle Console");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
