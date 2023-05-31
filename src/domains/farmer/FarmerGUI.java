package domains.farmer;

import framework.ui.ProblemGUI;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class FarmerGUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new ProblemGUI(new FarmerProblem(), 600, 750));
	primaryStage.setTitle("Testing FWGC GUI");
	primaryStage.setScene(scene);
	primaryStage.show();
    }

    public static void main(String[] args) {
	launch(args);
    }
}