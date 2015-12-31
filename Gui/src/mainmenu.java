import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class mainmenu implements ActionListner {
	
	/**
	 * @param args
	 */
	
	
public static void main(String[] args) {
	
	JFrame Frame1 = new JFrame("test");
	
	JPanel j1 = new JPanel();
	JButton B1 = new JButton("Click me");
	JTextField t1 = new JTextField(20);
	JLabel L1 = new JLabel("Name of field here");
	
	j1.add(L1);
	j1.add(t1);
	j1.add(1);
	
	Frame1.setSize(500,500);
	Frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Frame1.setVisible(true);
	
	
	
	
	
	
}
}
