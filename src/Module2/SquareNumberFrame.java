package Module2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class SquareNumberFrame extends JFrame implements ActionListener {
    private JPanel squarePanel;
    private JPanel visibilityPanel;
    private GridBagConstraints layoutConstraints;
    private JLabel baseNumberLabel;
    private JLabel squareNumberLabel;
    private JFormattedTextField baseNumberTextField;
    private JTextField squareNumberTextField;
    private JButton squareButton;
    private JButton togglePanelVisibleButton;

    public SquareNumberFrame() {
        // Set frame title
        setTitle("Square Number GUI Example");

        // Create a label for the base number
        baseNumberLabel = new JLabel("Base Number:");

        // Create a label for the square number
        squareNumberLabel = new JLabel("Square Number:");

        // Create a formatted text field for the base number with integer format
        baseNumberTextField = new JFormattedTextField(NumberFormat.getIntegerInstance());
        baseNumberTextField.setColumns(10);
        baseNumberTextField.setValue(0);

        // Create a non-modifiable text field for the squared number
        squareNumberTextField = new JTextField(10);
        squareNumberTextField.setEditable(false);
        squareNumberTextField.setText("0");

        // Create a button for squaring the base number
        squareButton = new JButton("Square");
        squareButton.addActionListener(this);

        // Create a button for toggling panel visibility
        togglePanelVisibleButton = new JButton("Show/Hide Panel");
        togglePanelVisibleButton.addActionListener(this);

        // Create another panel for the visibility toggle button
        visibilityPanel = new JPanel();
        visibilityPanel.setLayout(new GridBagLayout());

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

        // Create layout constraints for the visibility toggle button
        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 0;
        layoutConstraints.insets = new Insets(10, 10, 10, 10);
        visibilityPanel.add(togglePanelVisibleButton, layoutConstraints);

        // Add the panels to the frame and pack
        this.add(visibilityPanel, BorderLayout.NORTH);
        this.add(squarePanel, BorderLayout.CENTER);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == squareButton) {
            int baseNumber;
            int squareNumber;

            // Get the base number from the formatted text field
            baseNumber = ((Number) baseNumberTextField.getValue()).intValue();

            // Square the number and put the output in the square number text field
            squareNumber = baseNumber * baseNumber;
            squareNumberTextField.setText(String.valueOf(squareNumber));
        }
        else {
            squarePanel.setVisible(!squarePanel.isVisible());
        }
    }
}
