//----------------------------------------------------------------------------------------------------------------------
//  Option #2:  Creating a GUI Application
//  Create a simple GUI application that will obtain the birthdate from a user. The program must then calculate and
//  display the age of the user within a JPanel when the user selects a button. The GUI should display the value
//  presented.
//
//  Ensure that your application includes the following components:
//  - JPanel
//  - JButton
//  - ActionListener
//----------------------------------------------------------------------------------------------------------------------

package Module2;

import javax.swing.*;

public class BirthdateGUI {
    public static void main(String[] args) {
        BirthdateFrame birthdateFrame = new BirthdateFrame();

        birthdateFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        birthdateFrame.setVisible(true);
    }
}
