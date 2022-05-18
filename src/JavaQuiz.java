import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.border.Border;

public class JavaQuiz extends LoginForm{
	JPanel p1,p2,p3,p4,p5,p6;
	JButton btn1,btn2;
	JLabel l1,l2;
	JRadioButton r1,r2,r3,r4,r5,r6,r7,r8;

	JavaQuiz(){
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		p6 = new JPanel();
		btn1 = new JButton("Submit");
		btn2 = new JButton();
		l1 = new JLabel();
		
		r1= new JRadioButton("A");
		r2= new JRadioButton("A")
				;
		r3= new JRadioButton("A");
		r4= new JRadioButton("A");
		
		
	}
	public void Q1() {
		add(p1);
		p1.setBackground(Color.LIGHT_GRAY);
		p1.setLayout(null);
		p1.setBounds(0, 0,450, 200);
		p1.add(l1);
		l1.setText("What is the return type of the hashCode() method in the Object class?");
		l1.setBounds(20,40,400,30);
		p1.add(r1);
		p1.add(r2);
		p1.add(r3);
		p1.add(r4);
		r1.setBounds(30,70, 40, 40);
		r2.setBounds(30,100, 40, 40);
		r3.setBounds(30,130, 40, 40);
		r4.setBounds(30,160, 40, 40);
}
	public void Q2() {
		l2 = new JLabel();
		r5= new JRadioButton("A");
		r6= new JRadioButton("A");
		r7= new JRadioButton("A");
		r8= new JRadioButton("A");
		add(p2);
		p2.setBackground(Color.LIGHT_GRAY);
		p2.setLayout(null);
		p2.setBounds(0, 201,450, 200);
		p2.add(l2);
		l2.setText("Which of the following is a valid long literal?");
		l2.setBounds(20,40,400,30);
		p2.add(r5);
		p2.add(r6);
		p2.add(r7);
		p2.add(r8);
		r5.setBounds(30,70, 40, 40);
		r6.setBounds(30,100, 40, 40);
		r7.setBounds(30,130, 40, 40);
		r8.setBounds(30,160, 40, 40);
}
	public void answer() {
		add(p3);
		p3.setBackground(Color.green);
		p3.setLayout(null);
		p3.setBounds(380,410,100,30);
		p3.add(btn1);
		btn1.setBounds(0,0,100,30);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				question2 q1 = new question2();
				q1.frame(400, 400);
			}
		});
	}
		
}
	
    
