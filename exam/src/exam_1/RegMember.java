package exam_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegMember extends JFrame{
	public RegMember() {
		super("사원등록");
		
		Container contain = getContentPane();
		
		this.setVisible(true);
		contain.add(createJPanel());
		this.setBackground(Color.orange);
		
		
		
		this.setBounds(700, 100, 500, 600);
//		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		this.setBackground(Color.ORANGE);;
//		
//		JPanel panel = new JPanel();
//		panel.add(createJPanel());
		this.add(createJPanel(), BorderLayout.NORTH);
//		panel.setVisible(true);
		
	}
	
	public void buildGUI() {
		
	}
	
	private JPanel createJPanel() {
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel l_name = new JLabel("성    명");
		JTextField t_name = new JTextField(10);
		JLabel l_gender = new JLabel("성 별");
		JTextField t_gender = new JTextField(3);
		
		panel.add(l_name);
		panel.add(t_name);
		panel.add(l_gender);
		panel.add(t_gender);
		
		return panel;
	}
	public static void main(String[] args) {
		new RegMember();
	}
}


