import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class firstFrame implements ActionListener {
	JFrame frame1;
	JPanel Panel1;
	JTextField field1;
	JButton button1;
	JLabel label1;
	
	public firstFrame() {
	frame1 = new JFrame("Welcome to CS 1111");
	frame1.setLayout(new FlowLayout());
	Panel1 = new JPanel(new FlowLayout());
	field1 = new JTextField();
	field1.setSize(50, 10 );
	button1 = new JButton("Click here");
	label1 = new JLabel("Name");
	
	Panel1.add(field1);
	Panel1.add(button1);
	frame1.setSize(400, 150);
	frame1.setVisible(true);
	frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1){
			System.out.println("clicked");
			
		}
	}
	
}
