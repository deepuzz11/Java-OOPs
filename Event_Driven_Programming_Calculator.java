import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private JTextField textField;
    private double firstOperand = 0;
    private String operator = "";
    private boolean isOperatorClicked = false;

    public Calculator() {
        // Set up the frame
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Text field for input and display
        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 24));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        add(textField, BorderLayout.NORTH);

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(6, 4));
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+",
            "C", "sqrt", "pow", "sin",
            "cos", "tan"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        SwingUtilities.invokeLater(() -> {
            String command = e.getActionCommand();

            switch (command) {
                case "=":
                    calculate();
                    break;
                case "C":
                    clear();
                    break;
                case "sqrt":
                    calculateUnaryOperation("sqrt");
                    break;
                case "pow":
                    calculateUnaryOperation("pow");
                    break;
                case "sin":
                    calculateUnaryOperation("sin");
                    break;
                case "cos":
                    calculateUnaryOperation("cos");
                    break;
                case "tan":
                    calculateUnaryOperation("tan");
                    break;
                default:
                    processInput(command);
                    break;
            }
        });
    }

    private void processInput(String input) {
        if (isOperatorClicked) {
            textField.setText(input);
            isOperatorClicked = false;
        } else {
            String currentText = textField.getText();
            textField.setText(currentText + input);
        }
    }

    private void calculate() {
        if (!isOperatorClicked) {
            String input = textField.getText();
            try {
                double secondOperand =
