package Module2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BirthdateFrame extends JFrame implements ActionListener {
    private JPanel birthdatePanel;
    private JLabel birthdateLabel;
    private JTextField birthdateField;
    private JButton calculateAgeButton;
    private GridBagConstraints layoutConstraints;

    public BirthdateFrame() {
        // Set frame title
        setTitle("Age Calculator");

        // Create a label for the birthdate field
        birthdateLabel = new JLabel("Enter your date of birth:");

        // Create a text field for the user's date of birth
        birthdateField = new JTextField();

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
        layoutConstraints.anchor = GridBagConstraints.LINE_END;
        layoutConstraints.insets = new Insets(10, 10, 10, 10);
        birthdatePanel.add(birthdateLabel, layoutConstraints);

        // Add the panel to the frame and pack
        this.add(birthdatePanel);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
