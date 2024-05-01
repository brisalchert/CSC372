package Module3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Random;

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
        backgroundColorItem.setStyle("-fx-background-color: " + getRandomGreenHue() + ";");
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

    /**
     * Gets a String representation of a random hue of green
     * @return a String in "rgb(*,*,*)" format for a hue of green
     */
    public String getRandomGreenHue() {
        Random random = new Random();
        int green = 255;
        int hueFactor;
        boolean red;

        // Get a random value from 0 to 128 for either red or blue
        hueFactor = random.nextInt(129);

        // Choose whether the value will be for red or blue
        red = random.nextBoolean();

        // Return a String rgb representation of the color
        if (red) {
            return "rgb(" + hueFactor + "," + green + "," + 0 + ")";
        }

        return "rgb(" + 0 + "," + green + "," + hueFactor + ")";
    }

    public static void main(String[] args) {
        launch(args);
    }
}
