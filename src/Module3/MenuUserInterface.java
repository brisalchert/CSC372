package Module3;

import javafx.application.Application;
import javafx.stage.Stage;

public class MenuUserInterface extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // Set title and dimensions of stage
        stage.setTitle("User Interface with Menu");
        stage.setWidth(400);
        stage.setHeight(200);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
