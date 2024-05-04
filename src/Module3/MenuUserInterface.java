//----------------------------------------------------------------------------------------------------------------------
//  Option #1:  Creating a User Interface I
//  ---------------------------------------------
//  Create a user interface that has a top bar that includes a menu. The menu should have four items.
//
//  - When the user selects the first menu option, then the date and time should be printed in a text box.
//  - When the user selects the second menu option, then the text box contents should be written to a text file named
//    "log.txt."
//  - When the user selects the third menu item then the frame background color changes to random color hue of the
//    color green. The menu option should display the initial random hue each time selected for a single execution of
//    the program. See https://www.w3schools.com/colors/colors_picker.asp.
//  - When the user selects the fourth menu option then the program exits.
//----------------------------------------------------------------------------------------------------------------------

package Module3;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        String randomGreenHue = getRandomGreenHue();
        borderPane.setStyle("-fx-background-color: " + randomGreenHue + ";");

        // Create a text box for the date and time
        TextField dateAndTimeField = new TextField();
        dateAndTimeField.setPrefColumnCount(18);
        dateAndTimeField.setEditable(false);

        // Create an HBox to hold the text box
        HBox textBox = new HBox();
        textBox.setAlignment(Pos.CENTER);
        textBox.getChildren().add(dateAndTimeField);
        borderPane.setCenter(textBox);

        // Create a Menu for the top of the BorderPane
        Menu menu = new Menu("Menu");

        // Create MenuItems for the Menu
        MenuItem dateItem = new MenuItem("Print Date & Time");
        menu.getItems().add(dateItem);

        MenuItem exportItem = new MenuItem("Export Textbox Contents to File");
        menu.getItems().add(exportItem);

        MenuItem backgroundColorItem = new MenuItem("Change Background Color to Random Hue of Green");
        menu.getItems().add(backgroundColorItem);

        MenuItem exitItem = new MenuItem("Exit Program");
        menu.getItems().add(exitItem);

        // Add functionality for date & time option
        dateItem.setOnAction(actionEvent -> {
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

            dateAndTimeField.setText("Today's Date: " + formatter.format(date));
        });

        // Add functionality for text box export to file option
        exportItem.setOnAction(actionEvent -> {
            FileOutputStream outputStream = null;
            PrintWriter printWriter;

            try {
                outputStream = new FileOutputStream("log.txt");
            } catch (FileNotFoundException e) {
                Alert fileNotFoundAlert = new Alert(Alert.AlertType.ERROR);
                fileNotFoundAlert.setTitle("File Not Found");
                fileNotFoundAlert.setContentText("Could not access log.txt");
                fileNotFoundAlert.showAndWait();
            }

            if (outputStream != null) {
                printWriter = new PrintWriter(outputStream);

                // Print text box contents to log.txt
                printWriter.println(dateAndTimeField.getText());

                printWriter.close();

                Alert printAlert = new Alert(Alert.AlertType.INFORMATION);
                printAlert.setContentText("Textbox contents successfully exported to log.txt");
                printAlert.showAndWait();
            }
        });

        // Add functionality for background color option
        backgroundColorItem.setOnAction(actionEvent -> {
            String newRandomGreenHue = getRandomGreenHue();
            borderPane.setStyle("-fx-background-color:" + newRandomGreenHue + ";");
        });

        // Add functionality for exit option
        exitItem.setOnAction(actionEvent -> {
            System.exit(0);
        });

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
