// package admin_login;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Admin_Login {
    private JFrame frame;

    public Admin_Login() {
        initJFrame();
        initJPanel();
    }

    public void initJFrame() {
        frame = new JFrame();
        frame.setTitle("Admin");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080); // Set frame size to 1920x1080
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void initJPanel() {
        JPanel loginPanel = new JPanel(new GridBagLayout()); // Use GridBagLayout for more control
        loginPanel.setBackground(new Color(52, 143, 80));
    
        // Username label and text field
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(15); // Set preferred columns for text field
        addComponent(loginPanel, usernameLabel, 0, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
        addComponent(loginPanel, usernameField, 1, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
    
        // Password label and password field
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(15); // Set preferred columns for password field
        addComponent(loginPanel, passwordLabel, 0, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
        addComponent(loginPanel, passwordField, 1, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
    
        // Remember me checkbox
        JCheckBox rememberMeCheckBox = new JCheckBox("Remember me");
        addComponent(loginPanel, rememberMeCheckBox, 0, 2, 2, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
    
        // Login button
        JButton loginButton = new JButton("Login");
        addComponent(loginPanel, loginButton, 0, 3, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
    
        // Sign up button
        JButton signUpButton = new JButton("Sign Up");
        addComponent(loginPanel, signUpButton, 1, 3, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
    
        // Forgot password hyperlink
        JLabel forgotPasswordLabel = new JLabel("<html><u>Forgot password?</u></html>");
        forgotPasswordLabel.setForeground(Color.BLUE.darker());
        forgotPasswordLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        addComponent(loginPanel, forgotPasswordLabel, 0, 4, 2, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
    
        // Add login panel to frame
        frame.add(loginPanel, BorderLayout.CENTER);
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
            new Admin_Login();
        });
        
    }
}
