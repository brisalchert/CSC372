package Module3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFXBindingExample extends Application {
    @Override
    public void start(Stage stage) {
        // Initialize stage with a title and dimensions
        stage.setTitle("JavaFX Binding Example");
        stage.setWidth(400);
        stage.setHeight(200);

        // Create a GridPane as the main scene element
        GridPane grid = new GridPane();
        grid.setStyle("-fx-background-color: green;");
        grid.setAlignment(Pos.CENTER);
        grid.hgapProperty().bind(stage.widthProperty().divide(5));
        grid.vgapProperty().bind(stage.heightProperty().divide(5));

        // Create StackPanes as grid elements
        for (int i = 0; i < 4; i++) {
            StackPane cellPane = new StackPane();
            cellPane.setStyle("-fx-background-color: gold;");
            cellPane.setPadding(new Insets(10, 10, 10, 10));

            // Create text for the cell and add it to the StackPane
            Text cellText = new Text();
            cellText.setText("Cell " + (i + 1));
            cellPane.getChildren().add(cellText);

            // Add the pane to its correct coordinates in the GridPane
            grid.add(cellPane, (i / 2), (i % 2));
        }

        // Create a scene to hold the GridPane
        Scene scene = new Scene(grid);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
