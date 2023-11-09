package week10;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class HelloWin extends JFrame{
	public HelloWin() {
		super("Hello Window");
		
		buildGUI();
		
		this.setBounds(200, 200, 200, 90);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public void buildGUI() {
		this.add(createInputPanel(), BorderLayout.NORTH);
		this.add(createDisplayPanel(), BorderLayout.SOUTH);
	}
	
	private JPanel createInputPanel() {
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JTextField t_input = new JTextField(10);
		JButton btn = new JButton("확인");
		
		p.add(t_input);
		p.add(btn);
		return p;
	}
	
	private JPanel createDisplayPanel() {
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel label = new JLabel("Hello World");
		
		p.add(label);
		return p;
	}
}
