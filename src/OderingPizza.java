import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OderingPizza extends JFrame {

	public OderingPizza() {
		this.setSize(700,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("MyFrame");
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();

		JLabel label = new JLabel("Welcome to Java pizza! "
				+ "Choose the type of pizza");
		panel1.add(label);
		
		JButton button1 = new JButton("Combination Pizza");
		JButton button2 = new JButton("Potato Pizza");
		JButton button3 = new JButton("Roasted meat Pizza");
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		
		JLabel label2 = new JLabel("count = ");
		JTextField tf = new JTextField(10);
		panel2.add(label2);
		panel2.add(tf);
		
		panel3.add(panel1);
		panel3.add(panel2);
		this.add(panel3);
		this.setVisible(true);
	}
}
