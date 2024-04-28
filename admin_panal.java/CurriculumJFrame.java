import javax.swing.*;
import java.awt.*;

public class CurriculumJFrame {
    private JFrame frame;

    public CurriculumJFrame() {
        initJFrame();
        initTabs();
    }

    public void initJFrame() {
        frame = new JFrame();
        frame.setTitle("Curriculum");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600); // Set frame size
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void initTabs() {
        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel coursePanel = createCoursePanel();
        tabbedPane.addTab("Course Information", coursePanel);

        JPanel subjectPanel = createSubjectPanel();
        tabbedPane.addTab("Subject Details", subjectPanel);

        JPanel schedulePanel = createSchedulePanel();
        tabbedPane.addTab("Schedule", schedulePanel);

        JPanel additionalFeaturesPanel = createAdditionalFeaturesPanel();
        tabbedPane.addTab("Additional Features", additionalFeaturesPanel);

        frame.add(tabbedPane);
    }

    private JPanel createCoursePanel() {
        JPanel coursePanel = new JPanel(new GridBagLayout());
        // Add course components here
        return coursePanel;
    }

    private JPanel createSubjectPanel() {
        JPanel subjectPanel = new JPanel(new GridBagLayout());

        JLabel nameLabel = new JLabel("Subject Name:");
        JTextField nameField = new JTextField(20);
        addComponent(subjectPanel, nameLabel, 0, 0, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        addComponent(subjectPanel, nameField, 1, 0, 2, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);

        JLabel codeLabel = new JLabel("Subject Code:");
        JTextField codeField = new JTextField(10);
        addComponent(subjectPanel, codeLabel, 0, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
        addComponent(subjectPanel, codeField, 1, 1, 2, 1, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL);

        JLabel descriptionLabel = new JLabel("Description:");
        JTextArea descriptionArea = new JTextArea(4, 20);
        JScrollPane scrollPane = new JScrollPane(descriptionArea);
        addComponent(subjectPanel, descriptionLabel, 0, 2, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.NONE);
        addComponent(subjectPanel, scrollPane, 1, 2, 2, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL);

        return subjectPanel;
    }

    private JPanel createSchedulePanel() {
        JPanel schedulePanel = new JPanel(new GridBagLayout());
        // Add schedule components here
        return schedulePanel;
    }

    private JPanel createAdditionalFeaturesPanel() {
        JPanel additionalFeaturesPanel = new JPanel(new GridBagLayout());
        // Add additional features components here
        return additionalFeaturesPanel;
    }

    private void addComponent(JPanel panel, Component component, int gridx, int gridy, int gridwidth, int gridheight, int anchor, int fill) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = gridx;
        gbc.gridy = gridy;
        gbc.gridwidth = gridwidth;
        gbc.gridheight = gridheight;
        gbc.anchor = anchor;
        gbc.fill = fill;
        gbc.insets = new Insets(5, 5, 5, 5); // Add some padding
        panel.add(component, gbc);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CurriculumJFrame();
        });
    }
}
