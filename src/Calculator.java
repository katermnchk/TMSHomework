import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField textField;

    public Calculator(){
        super("Calculator Swing");

        setLayout(new BorderLayout());

        add(setTop(), BorderLayout.NORTH);
        add(setBody(), BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 500);
        setResizable(false);
        setVisible(true);
    }

    public static double eval(String expression) {
        expression = expression.replaceAll("\\s", "");

        double result = 0;
        double currentNumber = 0;
        char operation = '+';

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            //if digit
            if (Character.isDigit(c)) {
                currentNumber = currentNumber * 10 + (c - '0');
            }

            //if operator or the end
            if (!Character.isDigit(c) || i == expression.length() - 1) {
                switch (operation) {
                    case '+':
                        result += currentNumber;
                        break;
                    case '-':
                        result -= currentNumber;
                        break;
                    case '*':
                        result *= currentNumber;
                        break;
                    case '/':
                        if (currentNumber == 0) {
                            JOptionPane.showMessageDialog(null, "Cannot divide by zero!",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                                    result = 0;
                            break;
                        }
                        result /= currentNumber;
                        break;
                    case '%':
                        result %= currentNumber;
                        break;
                }

                operation = c;
                currentNumber = 0;
            }
        }
        return result;
    }


    JPanel setTop(){
        JPanel top = new JPanel();
        textField = new JTextField("0");
        textField.setEditable(false);

        top.setLayout(new BorderLayout());
        top.add(textField, BorderLayout.CENTER);

        return top;
    }

    JPanel setBody(){
        JPanel body = new JPanel();
        body.setLayout(new GridLayout(5, 4));

        ActionListener click = new ActionListenerClass(textField);

        JButton clear = new JButton("C");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("0");
            }
        });

        JButton backspace = new JButton("Backs");
        //backspace.addActionListener(click);

        JButton pow = new JButton("**");
        pow.addActionListener(click);

        JButton minus = new JButton("-");
        minus.addActionListener(click);

        JButton equals = new JButton("=");

        body.add(clear);
        body.add(backspace);

        // Java 8 standard
        backspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = textField.getText();
                if (currentText.length() > 1) {
                    textField.setText(currentText.substring(0, currentText.length() - 1));
                } else {
                    textField.setText("0");
                }
            }
        });

        pow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currentText = textField.getText();
                    double value = Double.parseDouble(currentText);
                    double result = Math.pow(value, 2);
                    textField.setText(String.valueOf(result));
            }
        });

        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String expression = textField.getText();
                double result = eval(expression);
                textField.setText(String.valueOf(result));
            }
        });

        body.add(pow);
        body.add(minus);

        for (int counter = 9; counter >= 0; counter--){
            JButton btn = new JButton(String.valueOf(counter));
            btn.addActionListener(click);
            body.add(btn);
        }

        JButton addition = new JButton("+");
        addition.addActionListener(click);
        JButton division = new JButton("/");
        division.addActionListener(click);
        JButton multiply = new JButton("*");
        multiply.addActionListener(click);
        JButton dot = new JButton(".");
        dot.addActionListener(click);

        JButton modus = new JButton("%");
        modus.addActionListener(click);

        body.add(addition);
        body.add(division);
        body.add(multiply);
        body.add(modus);
        body.add(dot);
        body.add(equals);

        return body;
    }
}