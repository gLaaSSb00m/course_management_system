package log_in;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import admin_login.*;
public class Login {
    private JFrame frame;
    private JPanel panel;

    public Login() {
        initJFrame();
        initJPanel();
    }

    public void initJFrame() {
        frame = new JFrame();
        frame.setTitle("Login");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setLayout(new BorderLayout());
        frame.setSize(1920, 1080);
        frame.setVisible(true);
    }

    public void initJPanel() {
        panel = new JPanel(new GridLayout(1, 2));

        // Left panel with gradient background and image
        JPanel leftHalf1 = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                int width = getWidth();
                int height = getHeight();
                Color color1 = new Color(52, 143, 80);
                Color color2 = new Color(6, 75, 179);
                GradientPaint gp = new GradientPaint(0, 0, color1, width, 0, color2);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, width, height);
            }
        };
        leftHalf1.setLayout(new BorderLayout());
        JLabel imageLabel = new JLabel(new ImageIcon("D:\\course_managemetn\\1x\\Asset 2-8.png"));
        imageLabel.setPreferredSize(new Dimension(216, 239));
        leftHalf1.add(imageLabel, BorderLayout.CENTER);
        panel.add(leftHalf1);

        // Right panel with text fields
        JPanel rightHalf = new JPanel();
        rightHalf.setLayout(null);
        rightHalf.setBackground(new Color(230, 230, 230));

        // JLabel "Are You"
        JLabel ayt = new JLabel("Are You");
        Font customFont = loadFont("E:\\download\\bauhaus-93\\Bauhaus 93 Regular.ttf", Font.PLAIN, 47);
        ayt.setFont(customFont);
        ayt.setBounds(300, 200, 200, 200);
        rightHalf.add(ayt);

        // JTextField for "Admin"
        JTextField textField = new JTextField("A Admin");
        Font customFont1 = loadFont("E:\\download\\berlin-sans-fb-regular_zV55G\\Berlin Sans FB Regular\\Berlin Sans FB Regular.ttf", Font.PLAIN, 30);
        textField.setFont(customFont1);
        textField.setEditable(false);
        textField.setBounds(250, 350, 274, 44);
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        textField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) { 
                    frame.dispose();
                    // Admin_Login admin_login= new Admin_Login();
                }
            }
        });
        rightHalf.add(textField);

        // JLabel "OR"
        JLabel or = new JLabel("OR");
        or.setFont(customFont);
        or.setBounds(350, 360, 200, 200);
        rightHalf.add(or);

        // JTextField for "Student"
        JTextField textField1 = new JTextField("A Student");
        textField1.setFont(customFont1);
        textField1.setEditable(false);
        textField1.setBounds(250, 500, 274, 44);
        textField1.setHorizontalAlignment(JTextField.CENTER);
        textField1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        textField1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 1) { // Check for single click
                    JOptionPane.showMessageDialog(null, "Hello World!", "Clicked", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        rightHalf.add(textField1);

        panel.add(rightHalf);
        frame.add(panel, BorderLayout.CENTER);
    }

    public static Font loadFont(String path, int style, int size) {
        try {
            File file = new File(path);
            Font font = Font.createFont(Font.TRUETYPE_FONT, file);
            font = font.deriveFont(style, size);
            return font;
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
            return new Font("Arial", style, size);
        }
    }
    public static void main(String[] args) {
        Login l = new Login();
    }
}
