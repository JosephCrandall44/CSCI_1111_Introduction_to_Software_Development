// Import statements
import javax.swing.*;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.*;

// Calculator Simple Application
public class Calculator {
	// Create the GUI and show it
	private static void createAndShowGUI() {
		// Create and set up the window
		JFrame frame = new JFrame("CalculatorDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		frame.setSize(300, 150);
		frame.setResizable(false);
		// Create & Add panels to the frame
		JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel1.setPreferredSize(new Dimension(300, 30));
		JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel2.setPreferredSize(new Dimension(300, 30));
		JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel3.setPreferredSize(new Dimension(300, 30));

		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		// Create & Add text fields to Panel 1
		final JTextField jtfOperand1 = new JTextField(10);
		final JTextField jtfOperand2 = new JTextField(10);
		final JTextField jtfOperator = new JTextField(1);
		panel1.add(jtfOperand1);
		panel1.add(jtfOperator);
		panel1.add(jtfOperand2);
		// Create & Add new label to Panel 2
		final JLabel jlbEqual = new JLabel(" = ", JLabel.CENTER);
		final JLabel jlbCalculatorResult = new JLabel(
				"Your Result Will Be Here!", JLabel.CENTER);
		panel2.add(jlbEqual);
		panel2.add(jlbCalculatorResult);
		// Create & Add new button to Panel 3
		JButton jbtnCalculate = new JButton("<< Results");
		jbtnCalculate.setPreferredSize(new Dimension(100, 20));
		jbtnCalculate.setToolTipText("Press the button to see the magic!");
		// Define the action for pressing the button
		jbtnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Execute when button is pressed
				int number1 = Integer.parseInt(jtfOperand1.getText());
				int number2 = Integer.parseInt(jtfOperand2.getText());
				char[] operatorArray = jtfOperator.getText().toCharArray();
				char operator = operatorArray[0];
				String result = "";
				switch (operator) {
				case '+':
					result = Double.toString(number1 + number2);
					break;
				case '-':
					result = Double.toString(number1 - number2);
					break;
				case '*':
					result = Double.toString(number1 * number2);
					break;
				case '/':
					result = Double.toString((double) number1 / number2);
					break;
				default:
					result = "Invalid operator!";
				}
				jlbCalculatorResult.setText(result);
			}
		});
		panel3.add(jbtnCalculate);
		// Display the window
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// Creating and showing this application's GUI
		createAndShowGUI();
	}
}

