package phone_dialer;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Phone_dialer implements ActionListener {
	
	// declare buttons & phone number
	JButton one;
	JButton two;
	JButton three;
	JButton four;
	JButton five;
	JButton six;
	JButton seven;
	JButton eight;
	JButton nine;
	JButton zero;
	JButton dash;
	JButton dial;
	String number;
	

	public static void main(String[] args) {
		new Phone_dialer();	// new instance of phone dialer

	}
	
	public Phone_dialer() {
		// labels the buttons
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		four = new JButton("4");
		five = new JButton("5");
		six = new JButton("6");
		seven = new JButton("7");
		eight = new JButton("8");
		nine = new JButton("9");
		zero = new JButton("0");
		dash = new JButton("-");
		dial = new JButton("Dial Number");
		
		number = "";	// number is blank for now
		
		// frame - set size and exit
		JFrame this_frame = new JFrame();
		this_frame.setTitle("Dialer");
		this_frame.setSize(200,250);
		this_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// PANELS - the main panel, label panel and button panel
		// main is box layout
		// label is flow layout
		// button is grid layout
		JPanel this_panel = (JPanel)this_frame.getContentPane();
		this_panel.setLayout(new BoxLayout(this_panel, BoxLayout.Y_AXIS));
		this_panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		JPanel top_label = new JPanel();
		top_label.setLayout(new FlowLayout());
		
		JPanel buttons = new JPanel();
		buttons.setLayout(new GridLayout(4,3,5,5));
		buttons.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
		
		// tells player what to do
		JLabel this_label = new JLabel("Enter the number to dial: ");
		top_label.add(this_label);
		
		// adds the buttons to the button panel
		buttons.add(one);
		buttons.add(two);
		buttons.add(three);
		buttons.add(four);
		buttons.add(five);
		buttons.add(six);
		buttons.add(seven);
		buttons.add(eight);
		buttons.add(nine);
		buttons.add(zero);
		buttons.add(dash);
		
		// adds the label and the buttons to the main panel
		this_panel.add(top_label);
		this_panel.add(buttons);
		
		// sets dial button in center and adds it to the panel
		dial.setAlignmentX(Component.CENTER_ALIGNMENT);
		this_panel.add(dial);
		
		// adds action listener to the buttons
		one.addActionListener(this);
		two.addActionListener(this);
		three.addActionListener(this);
		four.addActionListener(this);
		five.addActionListener(this);
		six.addActionListener(this);
		seven.addActionListener(this);
		eight.addActionListener(this);
		nine.addActionListener(this);
		zero.addActionListener(this);
		dash.addActionListener(this);
		dial.addActionListener(this);
		
		// sets the frame visible
		this_frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		// number buttons
		if (e.getSource() == one) {
			number = number + "1";
		} else if (e.getSource() == two) {
			number = number + "2";
		} else if (e.getSource() == three) {
			number = number + "3";
		} else if (e.getSource() == four) {
			number = number + "4";
		} else if (e.getSource() == five) {
			number = number + "5";
		} else if (e.getSource() == six) {
			number = number + "6";
		} else if (e.getSource() == seven) {
			number = number + "7";
		} else if (e.getSource() == eight) {
			number = number + "8";
		} else if (e.getSource() == nine) {
			number = number + "9";
		} else if (e.getSource() == zero) {
			number = number + "0";
		} else if (e.getSource() == dash) {
			number = number + "-";
		}
		
		// gives pop up of what number you are dialing
		if (e.getSource() == dial) {
			JOptionPane.showMessageDialog(null, "Dialing: " + number);
		}
	}
	
	

}
