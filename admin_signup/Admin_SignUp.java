import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Admin_SignUp {
    private JFrame frame;

    public Admin_SignUp() {
        initJFrame();
        initJPanel();
    }

    public void initJFrame() {
        frame = new JFrame();
        frame.setTitle("Sign Up");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080); // Set frame size
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void initJPanel() {
        JPanel signUpPanel = new JPanel(new GridBagLayout());
        signUpPanel.setBackground(new Color(52, 143, 80));

        // Username label and text field
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(15);
        addComponent(signUpPanel, usernameLabel, 0, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
        addComponent(signUpPanel, usernameField, 1, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);

        // Password label and password field
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(15);
        addComponent(signUpPanel, passwordLabel, 0, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
        addComponent(signUpPanel, passwordField, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);

        // Phone number label and text field
        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        JTextField phoneNumberField = new JTextField(15);
        addComponent(signUpPanel, phoneNumberLabel, 0, 2, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
        addComponent(signUpPanel, phoneNumberField, 1, 2, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);

        // Refer number label and text field
        JLabel referNumberLabel = new JLabel("Refer Number:");
        JTextField referNumberField = new JTextField(15);
        addComponent(signUpPanel, referNumberLabel, 0, 3, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
        addComponent(signUpPanel, referNumberField, 1, 3, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);

        // Sign up button
        JButton signUpButton = new JButton("Sign Up");
        addComponent(signUpPanel, signUpButton, 0, 4, 2, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);

        frame.add(signUpPanel, BorderLayout.CENTER);
    }

    private void addComponent(Container container, Component component, int gridx, int gridy, int gridwidth, int gridheight, int anchor, int fill) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        gbc.gridwidth = gridwidth;
        gbc.gridheight = gridheight;
        gbc.anchor = anchor;
        gbc.fill = fill;
        gbc.insets = new Insets(5, 5, 5, 5); // Add some padding
        container.add(component, gbc);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Admin_SignUp();
        });
    }
}
