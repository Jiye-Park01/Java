package week09;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class JFramePractice extends JFrame{
	public JFramePractice() {
		super("20210829");
		this.setBounds(100, 200, 350, 420);
		
		//프레임 구성
		buildGUI();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	private void buildGUI() {
		//패널 최종 합체
		this.setLayout(new BorderLayout());
		this.add(Panel01(), BorderLayout.NORTH);
		this.add(Panel02(), BorderLayout.CENTER);
	}
	
	private JPanel Panel01() {
		JPanel panel = new JPanel(new GridLayout(0,1));
		panel.add(Panel1());
		panel.add(Panel2());
		panel.add(Panel3());
		panel.add(Panel4());
		panel.add(Panel5());
		
		return panel;
	}
	
	private JPanel Panel02() {
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(Panel6(), BorderLayout.CENTER);
		panel.add(Panel7(), BorderLayout.SOUTH);
		
		return panel;
	}
	
	private JPanel Panel1() {
		//첫번째 칸
		JLabel name = new JLabel("성       명");
		JTextField nameF = new JTextField(8);
		
		JLabel man = new JLabel("성    별");
		JTextField manF = new JTextField(3);
		
		JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel1.add(name);
		panel1.add(nameF);
		panel1.add(man);
		panel1.add(manF);
		
		return panel1;
	}
	
	private JPanel Panel2() {
		//두번째 칸
		JLabel num = new JLabel("주민등록번호");
		JTextField numF1 = new JTextField(6);
		
		JLabel bar = new JLabel(" - ");
		JTextField numF2 = new JTextField(7);
		
		JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel2.add(num);
		panel2.add(numF1);
		panel2.add(bar);
		panel2.add(numF2);
		
		return panel2;
	}
	
	private JPanel Panel3() {
		//세번째 칸
		JLabel address = new JLabel("주      소");
		JTextField addressF = new JTextField(22);
		
		
		JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel3.add(address);
		panel3.add(addressF);
		
		return panel3;
	}
	
	private JPanel Panel4() {
		//네번째 칸
		JLabel department = new JLabel("부  서  명");
		JTextField departmentF = new JTextField(8);
		
		
		JPanel panel4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel4.add(department);
		panel4.add(departmentF);
		
		return panel4;
	}
	
	private JPanel Panel5() {
		//다섯번째 칸
		JLabel hobby = new JLabel("취     미");
		JTextField hobbyF = new JTextField(22);
		
		
		JPanel panel5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel5.add(hobby);
		panel5.add(hobbyF);
		
		return panel5;
	}
	
	private JPanel Panel6() {
		//마지막 칸
		JLabel myintro = new JLabel("자 기 소 개");
		JTextArea myintroF = new JTextArea(9,22);
		
		JPanel panel6 = new JPanel(new BorderLayout());
		panel6.add(myintro, BorderLayout.NORTH);
		panel6.add(myintroF, BorderLayout.CENTER);
		return panel6;
	}
	
	private JPanel Panel7() {
		//버튼 칸
		JButton btn1 = new JButton("저장");
		JButton btn2 = new JButton("종료");
		
		JPanel panel7 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel7.add(btn1);
		panel7.add(btn2);
		return panel7;
	}
}
