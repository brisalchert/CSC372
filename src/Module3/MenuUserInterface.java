package Module3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuUserInterface extends Application {
    @Override
    public void start(Stage stage) {
        // Set title and dimensions of stage
        stage.setTitle("User Interface with Menu");
        stage.setWidth(600);
        stage.setHeight(400);

        // Create a BorderPane to store UI components
        BorderPane borderPane = new BorderPane();

        // Create a Menu for the top of the BorderPane
        Menu menu = new Menu("Menu");

        // Create MenuItems for the Menu
        MenuItem dateItem = new MenuItem("Print Date & Time");
        menu.getItems().add(dateItem);

        MenuItem exportItem = new MenuItem("Export Textbox Contents to File");
        menu.getItems().add(exportItem);

        MenuItem backgroundColorItem = new MenuItem("Set Background Color to Green");
        menu.getItems().add(backgroundColorItem);

        MenuItem exitItem = new MenuItem("Exit Program");
        menu.getItems().add(exitItem);

        // Create a MenuBar to hold the Menu
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(menu);
        borderPane.setTop(menuBar);

        // Create a Scene for the BorderPane
        Scene scene = new Scene(borderPane);

        // Set the scene and show the stage
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
