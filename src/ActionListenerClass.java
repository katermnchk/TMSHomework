import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// ActionListener must be added
public class ActionListenerClass implements ActionListener {
    private final JTextField textField;

    public ActionListenerClass(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Ensure the source is a JButton before casting
        if (e.getSource() instanceof JButton) {
            JButton btn = (JButton) e.getSource();
            setTextField(btn);
        }
    }

    void setTextField(JButton button) {
        String currentText = textField.getText();
        String value = button.getText();
        if (currentText.equals("0")) {
            textField.setText(value);
        } else {
            textField.setText(currentText + value);
        }
    }
}
