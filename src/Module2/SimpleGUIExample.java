package Module2;

import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;

public class SimpleGUIExample {
    public static void main(String[] args) {
        JFrame frame;
        JPanel squarePanel;
        GridBagConstraints layoutConstraints;
        JLabel baseNumberLabel;
        JLabel squareNumberLabel;
        JFormattedTextField baseNumberTextField;
        JTextField squareNumberTextField;
        JButton squareButton;

        // Create a label for the base number
        baseNumberLabel = new JLabel("Base Number:");

        // Create a label for the square number
        squareNumberLabel = new JLabel("Square Number:");

        // Create a formatted text field for the base number with integer format
        baseNumberTextField = new JFormattedTextField(NumberFormat.getIntegerInstance());
        baseNumberTextField.setColumns(10);

        // Create a non-modifiable text field for the squared number
        squareNumberTextField = new JTextField(10);
        squareNumberTextField.setEditable(false);

        // Create a button for squaring the base number
        squareButton = new JButton("Square");

        // Create a panel to store the components with GridBag layout
        squarePanel = new JPanel();
        squarePanel.setLayout(new GridBagLayout());

        // Create layout constraints for the base number label
        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 0;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.anchor = GridBagConstraints.LINE_END;
        layoutConstraints.insets = new Insets(10, 10, 10, 10);
        squarePanel.add(baseNumberLabel, layoutConstraints);

        // Create layout constraints for the base number text field
        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 1;
        layoutConstraints.gridy = 0;
        layoutConstraints.insets = new Insets(10, 10, 10, 10);
        squarePanel.add(baseNumberTextField, layoutConstraints);

        // Create layout constraints for the square button
        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 2;
        layoutConstraints.gridy = 0;
        layoutConstraints.insets = new Insets(10, 10, 10, 10);
        squarePanel.add(squareButton, layoutConstraints);

        // Create layout constraints for the square number label
        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 1;
        layoutConstraints.fill = GridBagConstraints.HORIZONTAL;
        layoutConstraints.anchor = GridBagConstraints.LINE_END;
        layoutConstraints.insets = new Insets(10, 10, 10, 10);
        squarePanel.add(squareNumberLabel, layoutConstraints);

        // Create layout constraints for the square number text field
        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 1;
        layoutConstraints.gridy = 1;
        layoutConstraints.insets = new Insets(10, 10, 10, 10);
        squarePanel.add(squareNumberTextField, layoutConstraints);

        // Create a frame to hold the panel
        frame = new JFrame("Simple GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(squarePanel);
        frame.pack();
        frame.setVisible(true);
    }
}
