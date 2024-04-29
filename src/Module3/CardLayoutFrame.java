package Module3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CardLayoutFrame extends JFrame implements ItemListener {
    private JPanel windowPanel;
    private JPanel cardPanel;
    private JPanel firstCard;
    private JPanel secondCard;
    private JComboBox comboBox;
    private JLabel comboBoxLabel;
    private JLabel firstCardLabel;
    private JLabel secondCardLabel;
    private final String firstCardString = "First Card";
    private final String secondCardString = "Second Card";
    private GridBagConstraints constraints;

    public CardLayoutFrame() {
        // Set frame title and size
        this.setTitle("Card Layout Example");
        this.setSize(400, 200);

        // Create a panel for the entire window with GridBagLayout to center items in the frame
        windowPanel = new JPanel(new GridBagLayout());

        // Create a panel to hold the cards of the CardLayout
        cardPanel = new JPanel(new CardLayout());

        // Create the cards
        firstCard = new JPanel();
        firstCard.setBackground(Color.GRAY);
        firstCardLabel = new JLabel(firstCardString);
        firstCard.add(firstCardLabel);

        secondCard = new JPanel();
        secondCard.setBackground(Color.MAGENTA);
        secondCardLabel = new JLabel(secondCardString);
        secondCard.add(secondCardLabel);

        // Add the cards to the cardPanel
        cardPanel.add(firstCard, firstCardString);
        cardPanel.add(secondCard, secondCardString);

        // Create a label for the comboBox
        comboBoxLabel = new JLabel("Choose a card:");

        // Create a String array of card names to store in the comboBox
        String[] comboBoxLabels = {firstCardString, secondCardString};

        // Create the combo box with an item listener
        comboBox = new JComboBox(comboBoxLabels);
        comboBox.setEditable(false);
        comboBox.addItemListener(this);

        // Create gridBagConstraints for insets for items
        constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        // Add all components to the windowPanel with constraints for insets
        windowPanel.add(comboBoxLabel, constraints);
        windowPanel.add(comboBox, constraints);
        windowPanel.add(cardPanel, constraints);

        // Add the windowPanel to the frame
        this.add(windowPanel);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // Get the cardLayout object of the cardPanel
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();

        // Set the cardLayout to show the currently selected card
        cardLayout.show(cardPanel, e.getItem().toString());
    }
}
