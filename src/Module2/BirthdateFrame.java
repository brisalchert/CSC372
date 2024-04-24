package Module2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class BirthdateFrame extends JFrame implements ActionListener {
    private JPanel birthdatePanel;
    private JLabel birthdateLabel;
    private JLabel ageLabel;
    private JTextField birthdateField;
    private JTextField ageField;
    private JButton calculateAgeButton;
    private GridBagConstraints layoutConstraints;

    public BirthdateFrame() {
        // Set frame title
        setTitle("Age Calculator");

        // Create a label for the birthdate field
        birthdateLabel = new JLabel("Enter your date of birth (MM/DD/YYYY):");

        // Create a label for the calculated age
        ageLabel = new JLabel("Age:");

        // Create a text field for the user's date of birth
        birthdateField = new JTextField();
        birthdateField.setColumns(10);

        // Create a text field for the user's age
        ageField = new JTextField();
        ageField.setColumns(10);
        ageField.setEditable(false);

        // Create a button for calculating the user's age
        calculateAgeButton = new JButton("Calculate Age");
        calculateAgeButton.addActionListener(this);

        // Create a panel to store the components with GridBag layout
        birthdatePanel = new JPanel();
        birthdatePanel.setLayout(new GridBagLayout());

        // Create layout constraints for birthdateLabel
        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 0;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.insets = new Insets(20, 10, 10, 10);
        birthdatePanel.add(birthdateLabel, layoutConstraints);

        // Create layout constraints for birthdateField
        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 1;
        layoutConstraints.gridy = 0;
        layoutConstraints.insets = new Insets(20, 10, 10, 10);
        birthdatePanel.add(birthdateField, layoutConstraints);

        // Create layout constraints for calculateAgeButton
        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 2;
        layoutConstraints.gridy = 0;
        layoutConstraints.insets = new Insets(20, 10, 10, 10);
        birthdatePanel.add(calculateAgeButton, layoutConstraints);

        // Create layout constraints for ageLabel
        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 1;
        layoutConstraints.anchor = GridBagConstraints.LINE_END;
        layoutConstraints.insets = new Insets(10, 10, 20, 10);
        birthdatePanel.add(ageLabel, layoutConstraints);

        // Create layout constraints for ageField
        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 1;
        layoutConstraints.gridy = 1;
        layoutConstraints.insets = new Insets(10, 10, 20, 10);
        birthdatePanel.add(ageField, layoutConstraints);

        // Add the panel to the frame and pack
        this.add(birthdatePanel);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Create Date objects to perform calculation
        LocalDate birthdate = null;
        String userInput;
        Scanner inputScanner;
        int day;
        int month;
        int year;
        int age;

        // Get the user's input
        userInput = birthdateField.getText();

        // Ensure the input is not empty
        if (!userInput.isEmpty()) {
            // Try to parse the user input, displaying an error message if the input is invalid
            try {
                // Initialize a Scanner using "/" as a delimiter
                inputScanner = new Scanner(userInput);
                inputScanner.useDelimiter("/");

                // Get the month, day, and year from userInput
                month = Integer.parseInt(inputScanner.next());
                day = Integer.parseInt(inputScanner.next());
                year = Integer.parseInt(inputScanner.next());

                // Attempt to create a valid LocalDate from the user input
                try {
                    birthdate = LocalDate.of(year, month, day);
                }
                catch (DateTimeException error) {
                    JOptionPane.showMessageDialog(this, "Invalid date");
                }
            }
            catch (NumberFormatException error) {
                JOptionPane.showMessageDialog(this, "Invalid input! Format: MM/DD/YYYY");
            }
        }
        else {
            // Display message asking the user to enter input
            JOptionPane.showMessageDialog(this, "Please enter a date");
        }

        // If input was successfully obtained, calculate age
        if (birthdate != null) {
            age = Period.between(birthdate, LocalDate.now()).getYears();

            // Set ageField to display the user's age
            ageField.setText(Integer.toString(age));
        }
    }
}
