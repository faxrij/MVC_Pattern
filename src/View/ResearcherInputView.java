package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ResearcherInputView extends JFrame {
    private final JTextField usernameField;
    private final JButton submit;

    public ResearcherInputView() {
        setSize(600, 400);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(2, 5));

        panel.add(new JLabel("Add the Username of Researcher:"));
        usernameField = new JTextField();
        panel.add(usernameField);

        submit = new JButton("Submit");
        panel.add(submit);
        setContentPane(panel);

    }

    public String getUsername() {
        return usernameField.getText();
    }

    public void addActionListener(ActionListener listener) {
        submit.addActionListener(listener);
    }
}
