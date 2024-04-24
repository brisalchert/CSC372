package Module2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        birthdateLabel = new JLabel("Enter your date of birth:");

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
        layoutConstraints.insets = new Insets(10, 10, 10, 10);
        birthdatePanel.add(birthdateLabel, layoutConstraints);

        // Create layout constraints for birthdateField
        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 1;
        layoutConstraints.gridy = 0;
        layoutConstraints.insets = new Insets(10, 10, 10, 10);
        birthdatePanel.add(birthdateField, layoutConstraints);

        // Create layout constraints for ageLabel
        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 0;
        layoutConstraints.gridy = 1;
        layoutConstraints.anchor = GridBagConstraints.LINE_END;
        layoutConstraints.insets = new Insets(10, 10, 10, 10);
        birthdatePanel.add(ageLabel, layoutConstraints);

        // Create layout constraints for ageField
        layoutConstraints = new GridBagConstraints();
        layoutConstraints.gridx = 1;
        layoutConstraints.gridy = 1;
        layoutConstraints.insets = new Insets(10, 10, 10, 10);
        birthdatePanel.add(ageField, layoutConstraints);

        // Add the panel to the frame and pack
        this.add(birthdatePanel);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
