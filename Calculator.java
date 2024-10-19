import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {
    private JFrame frame;
    private JTextField textField;
    private double num1, num2, result;
    private String operator;

    public Calculator() {
        frame = new JFrame("Calculator");
        textField = new JTextField();
        textField.setBounds(30, 40, 280, 30);
        textField.setEditable(false);
        
        // Create buttons
        JButton[] numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(new NumberListener());
        }

        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton mulButton = new JButton("*");
        JButton divButton = new JButton("/");
        JButton eqButton = new JButton("=");
        JButton clrButton = new JButton("C");

        // Set action listeners
        addButton.addActionListener(e -> setOperator("+"));
        subButton.addActionListener(e -> setOperator("-"));
        mulButton.addActionListener(e -> setOperator("*"));
        divButton.addActionListener(e -> setOperator("/"));
        eqButton.addActionListener(e -> calculateResult());
        clrButton.addActionListener(e -> clear());

        // Create a panel for buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        // Add buttons to the panel
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(clrButton);
        panel.add(numberButtons[0]);
        panel.add(eqButton);
        panel.add(divButton);

        // Set up the frame
        frame.add(textField);
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the frame
    }

    private void setOperator(String op) {
        num1 = Double.parseDouble(textField.getText());
        operator = op;
        textField.setText("");
    }

    private void calculateResult() {
        num2 = Double.parseDouble(textField.getText());
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        textField.setText(String.valueOf(result));
    }

    private void clear() {
        textField.setText("");
        num1 = num2 = result = 0;
        operator = "";
    }

    private class NumberListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String number = e.getActionCommand();
            textField.setText(textField.getText() + number);
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
